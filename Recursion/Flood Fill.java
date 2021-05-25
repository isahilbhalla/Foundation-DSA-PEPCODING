import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "",new boolean[n][m]);
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf, boolean visited[][]) {
    //base
    //faith
    //expectation

    if(maze.length-1==sr  && maze[0].length-1==sc) {
        System.out.println(asf);
        return;
    }

    //t(up)

    if(sr-1>=0 && maze[sr-1][sc]==0   && visited[sr-1][sc]==false)
    {
        visited[sr][sc]=true;
        floodfill(maze, sr-1, sc, asf+"t",visited);
        visited[sr-1][sc]=false;
    }
    //l

    if(sc-1>=0 && maze[sr][sc-1]==0  && visited[sr][sc-1]==false)
    {
        visited[sr][sc]=true;
        floodfill(maze, sr, sc-1, asf+"l",visited);
        visited[sr][sc-1]=false;
    }
    //d

    if(sr+1<maze.length && maze[sr+1][sc]==0  && visited[sr+1][sc]==false)
    {
        visited[sr][sc]=true;
        floodfill(maze, sr+1, sc, asf+"d",visited);
        visited[sr+1][sc]=false;
    }
    //r
    
    if(sc+1<maze[0].length && maze[sr][sc+1]==0  && visited[sr][sc+1]==false)
    {
        visited[sr][sc]=true;
        floodfill(maze, sr, sc+1, asf+"r",visited);
        visited[sr][sc+1]=false;
    }

    }
}