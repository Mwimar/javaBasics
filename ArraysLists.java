import java.util.ArrayList;


public class ArraysLists{
    public static void main(String[] args){
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
//        numbers.remove(3);

        numbers.remove(Integer.valueOf(3));
        System.out.println(numbers.toString());

//        System.out.println(numbers.get(3).toString());
//        System.out.println(numbers.get(3));
    }
}