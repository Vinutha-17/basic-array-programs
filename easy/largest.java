//This is a program to print largest ellement in an array

public class largest
{
    public static void main(String[] args)
    {
        final int a[]={2,6,5,7,34,87,45,21};
        int max=a[0];
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("largest:"+max);
    }
}