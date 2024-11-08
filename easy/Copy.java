//This is a program to copy content of one array into another array

public class Copy {
    public static void main(String[] args)
    {
        int a[]={34,65,34,87,45};
        int n=a.length;
        int b[]= new int[n];

        for (int i=0; i<n; i++)
        {
            b[i]=a[i];
        }
        for (int i=0; i<n; i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
