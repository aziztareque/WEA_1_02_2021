package constructor;

public class LearnConstructor {

    //Constructor
    //Constructor name should be same as class name
    //Constructor has no return type
    //***Constructor are used to initialize object***

    // AccessModifier className(){ }

    // Without parameter its call default constructor
    public LearnConstructor (){
        //Default Constructor

        System.out.println("this is default constructor");
    }
    //Signature Pattern
    //Create parameter

    //single value parameter its call single parameterized constructor

    public LearnConstructor (String name) {
        System.out.println("my name is " + name);
    }

    // multiParameterized constructor with multiple parameter value

    public LearnConstructor (int age, double ssn ){
        System.out.println("my age is"+ age +"my ssn is"+ ssn);

    }

    String  pizzaName = "Dominoes";
    String stName;
    String stAddress;
    public LearnConstructor (String stName, String stAddress){
        this.stName = stName;
        this.stAddress = stAddress;
        System.out.println("Student name is"+ this.stName + "this address is"+ this.stAddress);
    }


    public static void main(String[] args) {

        // className objectName= new constructorName ();

        LearnConstructor obj = new LearnConstructor();

        LearnConstructor obj2 = new LearnConstructor("Aziz"); // Argument passing

        LearnConstructor obj3 = new LearnConstructor("Taraq"); // 2nd argument passing in the same constructor

        LearnConstructor obj4 = new LearnConstructor(56,346.45);





    }

}
