package basic_First_Class;

public class LearnStatic {

    //Declare variable : Declare dataType with variable name
    int age;
    //Declare variable and Assign value
    int pizzaPrice = 25;

    public static String stName= "Rahan"; // static global variable
    String stAddress= "NewYork";   // non static global variable

static String stFatherName;

public static void tvDisplay(){

    System.out.println("TV Display is UHD");

}
public void display (){

    System.out.println("Display size is large");
}


    public static void main(String[] args) {

        //how can we call a static variable inside main method?
        // == Static variable call by class name as that variable in class level.

        LearnStatic.stName="Kevin"; // ReAssign the value
        LearnStatic.stName="Arafat"; // always print the recent value
        System.out.println(LearnStatic.stName);

        //how can we call a non static variable inside main method?
        // to call a non static variable / Method

     //How to create object?
      //className objectName = new constructorOfClass();
      LearnStatic obj = new LearnStatic();
      //obj.stAddress;
        System.out.println(obj.stAddress);
        obj.age=34;
        System.out.println(obj.age);
        obj.pizzaPrice=45;
        System.out.println("Pizza Price is " + obj.pizzaPrice);

        //tvDisplay();
        LearnStatic.tvDisplay();
        LearnStatic.stFatherName= "Anwar";
        System.out.println("Father name is "+ stFatherName);

      obj.display();


        String stPhoneNumber = "856029384"; // Local variable

    }
}
