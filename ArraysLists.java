import java.util.ArrayList;
import java.util.Comparator;


public class ArraysLists{
    public static void main(String[] args){
//        ArrayList<Integer> numbers= new ArrayList<Integer>();
//        numbers.add(3);
//        numbers.add(1);
//        numbers.add(5);
//        numbers.add(4);
//        numbers.add(2);
////        numbers.remove(3);
//        ArrayList<Integer> numbering = new ArrayList<>();
//
////        numbers.remove(Integer.valueOf(3)); // removing an array value
////        numbers.clear();//clearing an array;
////        numbers.set(2, Integer.valueOf(55));//updating an array value;
//        numbers.sort(Comparator.naturalOrder()); //Sorting arrays;
////        numbers.sort(Comparator.reverseOrder()); // sorting arrays in reverse order;
////        System.out.println(numbers.size());
////        System.out.println(numbers.contains(Integer.valueOf(7)));
////        numbers.clear();
////        System.out.println(numbers.isEmpty());
//        System.out.println("Before: "+numbers.toString());
//        numbers.forEach(number ->{
//            numbers.set(numbers.indexOf(number), number*2);
//        });
//        System.out.println("After: "+numbers.toString());
////        System.out.println(numbers.get(3).toString());
//        System.out.println(numbers.get(3));
        StringBuffer sb = new StringBuffer("Java Code");
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());

    }
}