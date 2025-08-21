class comp{
    public:
    bool operator()(array<int,3> &a, array<int,3> &b){
        return a[1] > b[1];
    }
};

class Solution {
public:
    int minPathCost(vector<vector<int>>& grid, vector<vector<int>>& moveCost) {

        priority_queue<array<int,3>, vector<array<int,3>>,  comp> q;

        int n = grid.size(), m = grid[0].size();
        for(int i=0; i<m; i++){
            q.push({grid[0][i], grid[0][i], 0}); //pushing all first row value
            //{element, cost, row}
        }

        vector<vector<int>> costMat(n, vector<int>(m, INT_MAX));
        //cost matrix to prune

        while(q.size()){
            array<int,3> arr = q.top(); q.pop();
            //the top element in pq will have shortest path cost

            int row = arr[2];

            if(row == n-1) return arr[1]; //if this is last row : so in bfs it will be the shortest path

            for(int i=0; i<m; i++){
                int cost = arr[1]+moveCost[arr[0]][i]+grid[row+1][i]; //compute cost for next row for ith element
                if(cost < costMat[row+1][i]){ //if this cost is less than cost for a path till this element, we add it to queue
                    costMat[row+1][i] = cost;
                    q.push({grid[row+1][i], cost, row+1});
                }
            }
        }

        return -1;
    }
};