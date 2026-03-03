package Arrays;
import java.util.ArrayList;
import java.util.Collections;
class Class{

}
public class ArrayListDemo {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>(5);
        System.out.println(list);
        System.out.println(list.size());
       // ArrayList<> list3 = new ArrayList<Integer>():

       list.add(1);
       list.add(2)
       list.add(3);
       list.add(4);
       list.add(5);
       System.out.println(list);
       System.out.print(list.size());

       list.add(1,5);
       System.out.print(list.size());

       System.out.println(list.get(1));

       list.remove(1);
       System.out.println(list);

       list.add(1,5);
       list.add(2,5);

       list.remove(Integer.valueOf(5));
       System.out.println(list);

       System.out.println(list.contains(5));

       Collections.sort(list);
       Collections.binarySearch(list,4);
       System.println(value);
       System.out.println(list);

       System.out.println(list.toString());

       Integer[] arr= list.toArray(new Integer[0]);
       for (int val: arr){
        System.out.print(val + " ");
       }

    ArrayList<Integer> splitList = new ArrayList<Integer>(list.subList(3,list.size()));
    System.out.println(splitList);

    list.clear();
    System.err.println(list);
    System.out.println(splitList);



    }
    
}

