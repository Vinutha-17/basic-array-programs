//This program shows whether two matrices are equal or not.

public class eqmatrix {
    
    private static void eqal(int a[][],int b[][],int n)
    {
        int result = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <n; j++) 
            {
                if(a[i][j] != b[i][j])
                   result = 1;
            }
        }
        if(result != 0)
            System.out.println("Matrices are not equal");
        else
            System.out.println("Matrices are equal");
    }

    public static void main(String[] args) {
        
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};

        eqal(a, b, 3);
    }
}
