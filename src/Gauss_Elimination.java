import java.lang.*;
import java.util.Scanner;
public class Gauss_Elimination
{
    public static void main(String args[]) {
        float a[][] = new float[10][10];
        float x[] = new float[10];
        float ratio;
        int i, j, k, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n+1;j++)
            {
                System.out.println("a["+i+"]["+j+"]= ");
                a[i][j]=sc.nextFloat();
            }
        }
        for(i=1;i<=n-1;i++)
        {
            if(a[i][i] == 0.0)
            {
                System.out.println("Mathematical Error!");
                break;
            }
            for(j=i+1;j<=n;j++)
            {
                ratio = a[j][i]/a[i][i];

                for(k=1;k<=n+1;k++)
                {
                    a[j][k] = a[j][k] - ratio*a[i][k];
                }
            }
        }
        x[n] = a[n][n+1]/a[n][n];

        for(i=n-1;i>=1;i--)
        {
            x[i] = a[i][n+1];
            for(j=i+1;j<=n;j++)
            {
                x[i] = x[i] - a[i][j]*x[j];
            }
            x[i] = x[i]/a[i][i];
        }
        /* Displaying Solution */
        System.out.println("\nSolution:\n");
        for(i=1;i<=n;i++)
        {
            System.out.println("x["+i+"] = "+ x[i]);
        }
    }
}
