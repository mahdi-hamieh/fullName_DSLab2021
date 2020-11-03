
public class javaapplication {
    public static void main(String[] args) {
     static int arraySortedOrNot(int Array[], int n)
    {
      
        if (n == 1 || n == 0)
            return 1;
 
       
        if (Array[n - 1] < Array[n - 2])
            return 0;
 
       
          return arraySortedOrNot(Array, n - 1);
    }
 
    public static void main(String[] args)
    {
        int arr[] = { 20, 23, 23, 45, 78, 88 };
        int n = arr.length;
        if (arraySortedOrNot(arr, n) != 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
