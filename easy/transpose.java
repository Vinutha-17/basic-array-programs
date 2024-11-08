//This program depicts the transpose of two matrices

public class transpose {
    private static void print(int a[][],int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <n; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void tran(int a[][],int n)
    {
        int b[][] = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                b[i][j] = a[j][i];
            }
        }
        print(b,n);
    }

    public static void main(String[] args)
    {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        tran(a, 3);
    }
}
