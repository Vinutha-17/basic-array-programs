//This program adds two matrices

public class addMatrice {
    private static void addMat(int a[][], int b[][])
    {
        int n=a.length;
        int c[][] = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        printMat(c,n);
    }
    private static void printMat(int a[][], int n)
    {
        System.out.println("Matrices");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int a[][] = {{1,1},{1,1}};
        int b[][] = {{1,1},{1,1}};
        addMat(a, b);
    }
}
