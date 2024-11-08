//This program determines the diagonal sum of two matrices.

public class diagonalSum {
    
    private static void addtin(int a[][], int b[][], int n)
    {
        int c[][] = new int[n][ n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(i==j)
                  c[i][j] = a[i][j]+b[i][j];
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{1,2,1},{1,1,1},{1,1,1}};

        addtin(a, b, 3);
    }
}
