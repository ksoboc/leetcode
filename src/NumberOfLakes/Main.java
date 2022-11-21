package NumberOfLakes;

import java.util.ArrayList;
import java.util.List;
class Pair{
    int row;
    int col;

    public Pair(int row,int col){
        this.row = row;
        this.col = col;
    }
}

public class Main {
    private static int[][] visited;
    public static int countLake(int[][] grid){
        visited = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                visited[i][j] = -1;
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0 && (i==0 || i==grid.length-1 || j==0 || j==grid[0].length-1)){
                    dfs(i,j,grid);
                    grid[i][j] = 3;
                }
            }
        }
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    connectComponents(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(int i,int j,int[][] grid){
        for(Pair p : getNeighbour(i,j,grid)){
            if(grid[p.row][p.col]==0){
                grid[p.row][p.col] = 3;
                dfs(p.row,p.col,grid);
            }
        }
        return;
    }
    public static void connectComponents(int i,int j,int[][] grid){
        visited[i][j] = 1;
        for(Pair p : getNeighbour(i,j,grid)){
            if(grid[p.row][p.col]==1 && visited[p.row][p.col]==-1){
                visited[p.row][p.col]=1;
                dfs(p.row,p.col,grid);
            }
        }
        return;
    }
    public static List<Pair> getNeighbour(int i, int j, int[][] grid){
        List<Pair> result = new ArrayList<>();
        if(i>=0 && j>=0 && grid.length>0 && grid[0].length>0){
            if(i+1<=grid.length-1){
                result.add(new Pair(i+1,j));
            }
            if(i-1>=0){
                result.add(new Pair(i-1,j));
            }
            if(j+1<=grid[0].length-1){
                result.add(new Pair(i,j+1));
            }
            if(j-1>=0){
                result.add(new Pair(i,j-1));
            }
        }
        return result;
    }
    public static void main(String[] args) {
//        int[][] input = new int[3][3];
//        input[0][0] = 0;
//        input[0][1] = 1;
//        input[0][2] = 0;
//        input[1][0] = 1;
//        input[1][1] = 0;
//        input[1][2] = 1;
//        input[2][0] = 0;
//        input[2][1] = 0;
//        input[2][2] = 1;
        int[][] ocean =
                {{1,1,1,1,1},
                 {1,0,1,0,1},
                 {1,1,1,1,1}};
        System.out.println(countLake(ocean));
    }

}