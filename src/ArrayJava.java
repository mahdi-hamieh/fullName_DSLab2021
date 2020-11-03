public class ArrayJava {
    public static void main(int value, int[] array) {
        // Write logic here
        boolean found = false;
        for (int i = 0; i<array.length; i++) {
            if(value == array[i]) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println(value + "is found");
        } else {
            System.out.println(value + "is not found");
        }
        }
    public static void main(String[] args) {
        int [] array = {41, 6, 91, 24, 54, 78};
        
        }
    int n = array.length;
        if(arraySortedOrNot(array,n)!=0);
            System.out.println("Yes");
        else
            System.out.println("No");
    }


