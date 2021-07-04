import java.io.*;
import java.util.*;


public class Main
{
    public class Edges
    {
        int src;
        int dest;
        int weight;
        Edges(int src,int dest,int weight)
        {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    public static void main(String arg[]) throws Exception
    {
        int vertices = 7;
        ArrayList<Edges>graph[] = new ArrayList<Edges>[7];
        
        for(int i=0;i<vertices;i++)
        {
            graph[i] = new ArrayList<Edge>();
        }
        
        graph[0].add(new Edges(0,3,40));
        graph[0].add(new Edges(0,1,10));
        
        graph[1].add(new Edges(1,0,10));
        graph[1].add(new Edges(1,2,10));
        
        graph[2].add(new Edges(2,3,10));
        graph[2].add(new Edges(2,1,10));
        
        graph[3].add(new Edges(3,0,40));
        graph[3].add(new Edges(3,2,10));
        graph[3].add(new Edges(3,4,2));
        
        graph[4].add(new Edges(4,3,2));
        graph[4].add(new Edges(4,5,3));
        graph[4].add(new Edges(4,6,3));
        
        graph[5].add(new Edges(5,4,3));
        graph[5].add(new Edges(5,6,3));
        
        graph[6].add(new Edges(6,5,3));
        graph[6].add(new Edges(6,4,8));
    }
}