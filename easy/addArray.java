
//This program adds two array

public class addArray {

   
        private static void addA(int a[], int b[]){
            int n=Math.min(a.length,b.length);
            int c[] = new int[n];
            
            for(int i=0; i<n; i++){
                c[i]=(a[i]+b[i]);
            }
            System.out.println("Added array:");
            for(int i=0; i<n; i++){
                System.out.print(c[i]+" ");
            }
    }

    public static void main(String[] args) {
        int a[] = {2,3,5,2,23};
        int b[] = {34,2,43,12,6,78,9};

        addA(a, b);
    }
}
