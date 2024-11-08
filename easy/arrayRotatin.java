public class arrayRotatin{
    
    private static void rotate(int a[],int d, int n)
    {
        int b[] = new int[n];
        int k = 0;
        for (int i = d; i < n; i++)
        {
            b[k++] = a[i];
        }
        for(int j=0; j < d; j++){
            b[k++]=a[j];
        }
        for(int j=0; j < n; j++){
            System.out.print(b[j] +" ");
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        int n= a.length;
        rotate(a, 2,n);
    }
}
