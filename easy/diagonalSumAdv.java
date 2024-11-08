public class diagonalSumAdv {
    
    private static void sum(int a[][], int n){

        int r1= 0;
        int r2= 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j)
                    r1+= a[i][j];
                if(i+j == n-1)
                    r2+= a[i][j];
            }
        }

        System.out.println("Principle diagonal sum : " + r1);
        System.out.println("Secondary diagonal sum : " + r2);
    }

    public static void main(String[] args) {
        
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};

        sum(a, 3);
    }
}
