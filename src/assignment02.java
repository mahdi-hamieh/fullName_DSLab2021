public class assignment02 {
    
    public static void main(String args[]) {
        int[] Array1 = {312,322,21,411,342,241,542};
        int[] Array2 = {56,95,345,63,5542,15,347};
        int[] Array3 = new int[Array1.length + Array2.length];

        System.arraycopy(Array1, 0, Array3, 0, Array1.length);
        System.arraycopy(Array2, 0, Array3, Array1.length, Array2.length);
        for (int i = 0; i < Array1.length + Array2.length; i++) {
            System.out.println(Array3[i]);
        }}}


