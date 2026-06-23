import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Semo {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();

        // list.add(20);
        // list.add(50);
        // list.add(60);
        // list.add(100);
        // //System.out.println(list);
        // list.remove(0);
        // //System.out.println(list);

        // List<Integer> list2 = new ArrayList<>();
        // list2.add(102);
        // list2.add(110);
        // list2.addAll(list);
        //System.out.println(list2);
        // list2.removeAll(list);
        // System.out.println(list2);
        // list.clear();
        // System.out.println(list.size());
        // Iterator<Integer> iterator = list.iterator();
        // while(iterator.hasNext()){
        //     System.out.println("Element : "+iterator.next());
        // }

        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(1000);
        list3.add(20);
        list3.add(300); 
        System.out.println(list3.get(2));

        // list3.set(2, 100);

        // System.out.println(list3);

        // // Object []arr = list3.toArray();
        // // for(Object x : arr){
        // //     System.out.println(x);
        // // }
        // System.out.println(list3.contains(100));/
        List<Integer> list4 = new ArrayList<>();

        list4.add(1000);
        list4.add(20);
        list4.add(2);
        list4.add(300);
        list4.sort(Comparator.reverseOrder());;

        System.out.println(list4);
    } 
}