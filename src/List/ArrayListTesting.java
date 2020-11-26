
package List;

public class ArrayListTesting {

    public static void main(String args[]) {
        ArrayList list = new ArrayList();
        System.out.println(list.size());
        list.add("hasan");
        list.add("ali");
        list.add("issa");
        list.add("hamzeh");
        list.print();
        System.out.println(list.size());
        list.remove();
        list.print();
        System.out.println(list.size());
        list.remove(0);
        list.print();
        System.out.println(list.size());
        list.remove("mahdi");
        list.print();
        System.out.println(list.size());

    }
}

