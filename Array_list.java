import java.util.ArrayList;
import java.util.Collections;
public class Array_list {
    public static void main(String11[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        //.add element
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //.Get Element
        int element=list.get(0);
        System.out.println(element);
        list.add(1, 7);
        System.out.println(list);
        //Set Element
        list.set(0,5);
        System.out.println(list);
        //Delete Element
        list.remove(3);
        System.out.println(list);
        //Size Find
        int size=list.size();
        System.out.println(size);
        //Loop
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+", ");
            //Sorting
            Collections.sort(list);
            System.out.print(list);
        }
    }


}
