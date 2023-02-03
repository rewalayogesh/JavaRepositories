import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        try {
            //Initial array list declaration
            List arrayList = new ArrayList<String>();
            arrayList.add("Anil");
            arrayList.add("Abhishek");
            arrayList.add("Yogesh");
            arrayList.add("xyz");
            //New array list declaration by adding initial items
            List secondArrayList = new ArrayList();
            secondArrayList.addAll(arrayList);
            System.out.println("This is contents of second array list "+secondArrayList);
            System.out.println("Size of second array list is: "+secondArrayList.size());
            secondArrayList.add("newItem");
            System.out.println(secondArrayList.containsAll(arrayList)?"secondArrayList contains all arrayList":"Does not contains");
            System.out.println("This is now modified secondArrayList: "+secondArrayList);
            System.out.println(secondArrayList.size());
            System.out.println(arrayList.contains("xyz") ? "true" : "False");
            arrayList.remove("xyz");
            System.out.println(arrayList.contains("xyz") ? "true" : "False");
            System.out.println(arrayList.size());
            System.out.println(arrayList.get(0));
            //System.out.println(arrayList.get(8));
            System.out.println(arrayList.isEmpty());
            arrayList.clear();
            System.out.println("Initial array list created is empty now "+arrayList);
        }
        catch(IndexOutOfBoundsException ie){
            System.out.println(ie);
        }
    }
}
