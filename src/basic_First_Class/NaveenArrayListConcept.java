package basic_First_Class;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NaveenArrayListConcept {


    public static void main(String[] args) {
        ArrayList ar = new ArrayList();

        ar.add(34);
        ar.add(344);
        ar.add(432);

        System.out.println(ar.size());
        System.out.println(ar.toArray().length);
        ar.add(45);
        ar.add(4745);

        System.out.println(ar.size()); // new size
        System.out.println(ar.toArray().length); // new length






        ArrayList <Integer> ar1 = new <Integer> ArrayList();

        ar1.add(23);
        ar1.add(8943);
        ar1.add(90);

        ar1.add(354);

        System.out.println(ar1.toArray().length);
        System.out.println(ar1.size());

        ArrayList <String> ar3 = new ArrayList<>();

        ar3.add("Naveen");
        ar3.add("Kevin");
        ar3.toArray();

        System.out.println(ar3.toArray().clone());



    }



}
