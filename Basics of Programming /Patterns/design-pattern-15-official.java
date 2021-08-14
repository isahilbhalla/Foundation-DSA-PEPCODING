import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp1 = n/2,star=1;
        
        for(int i=1;i<=n;i++)
        {
            int t= i;
            if(i<=n/2)
            {
                for (int j = 0; j < sp1; j++) {
                    System.out.print("	");
                }
                sp1--;
                for (int j = 0; j < star;j++) {
                    if(j>star/2)
                    {   
                        t--;
                        System.out.print(t+"	");
                    }
                    else
                    {
                        System.out.print(t+"	");
                        t++;
                        if(j==star/2)
                        {
                            t--;
                        }
                    }
                    
                }
                star = star + 2;

                System.out.println();

            }
            else if (i==n/2+1)
            {
                for (int j = 0; j < star;j++) {
                    if(j>star/2)
                    {   
                        t--;
                        System.out.print(t+"	");
                    }
                    else
                    {
                        System.out.print(t+"	");
                        t++;
                         if(j==star/2)
                        {
                            t--;
                        }
                    }
                   
                }
                System.out.println();
                sp1++;
                star = star-2;
            }
            else
            {
                for (int j = 0; j < sp1; j++) {
                    System.out.print("	");
                }
                sp1++;
                t=n-t+1;
                for (int j = 0; j < star;j++) {
                    if(j>star/2)
                    {   
                        t--;
                        System.out.print(t+"	");
                    }
                    else
                    {
                        System.out.print(t+"	");
                        t++;
                         if(j==star/2)
                        {
                            t--;
                        }
                    }
                }
                star = star - 2;

                System.out.println();
            }
        }
        // write ur code here

    }
}