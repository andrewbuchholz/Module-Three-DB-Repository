import java.util.ArrayList;

public class ArrayAndArrayListExamples {
    public static void main(String[] args)
    {
        // array example
        int[] array = {1, 2, 3, 4, 5};
        /*
         * could have also used:
         * array[0] = 1;
         * array[1] = 2;
         * array[2] = 3;
         * array[3] = 4;
         * array[4] = 5;
         */
        System.out.println("Value of second position is: " + array[1]);

        // arraylist example
        ArrayList<Integer> list = new ArrayList<>(); // running list instead of set
        list.add(1); // like arrays, ArrayList indices at 0
        list.add(2);
        list.add(3); // this is considered the third element
        list.add(4);
        list.add(5);

        System.out.println("Value of third position is: " + list.get(2));
    }
}