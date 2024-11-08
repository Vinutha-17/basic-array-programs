//This program finds the trace and normal of the given matrix

public class normalTrace {
    private static int normal(int a[][],int n){
        int sum = 0;
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                sum+=a[i][j]*a[i][j];
            }
        }
        int normal = (int) Math.sqrt(sum);
        return normal;
    }

    private static int trace(int a[][],int n){
        int sum = 0;
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                if(i==j)
                  sum+=a[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        
        int a[][] = {{2,6,7},{6,-6,8},{0,2,4}};
        int b[][] = {{2,6,7},{6,2,8},{0,1,3}};
        int c[][] = {{1, 4, 4},
        {2, 3, 7},
        {0, 5, 1}};

        System.out.println("trace: " +trace(a,3));
        System.out.println("normal" + normal(b,3));
        System.out.println("trace: " + trace(c,3));
        System.out.println("normal:" + normal(c,3));
    }

}
