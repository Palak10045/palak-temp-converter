import java.util.Scanner;
public class Exercise1
{
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the order of matrix : ");
        n=sc.nextInt();
        int[][] a = new int [n][n];
        int[][] b = new int [n][n];
        int[][] c = new int [n][n];
        int[][] d = new int [n][n];

        System.out.println("Enter the elements of matrix 1 :");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                Scanner sc1 = new Scanner (System.in);
                a[i][j]=sc1.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix 2 : ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                Scanner sc1 = new Scanner(System.in);
                b[i][j]=sc1.nextInt();
            }
        }
        System.out.println("Matrix 1 : ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.printf("%d \t",a[i][j]);

            }
            System.out.println();
} 
 System.out.println("Matrix 2 : ");
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        System.out.printf("%d \t",b[i][j]);

    }
    System.out.println();

}
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        c[i][j]=a[i][j]+b[i][j];
    }
}
System.out.println("addition of given matrices : ");
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        System.out.printf("%d \t",c[i][j]);

    }
    System.out.println();

}
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        d[i][j]=a[i][j] - b[i][j];
    }
}
System.out.println("subtraction of given matrices : ");
for(i=0;i<n;i++)
{
    for(j=0;j<n;j++)
    {
        System.out.printf("%d \t",d[i][j]);

    }
    System.out.println();

}
}
}

    