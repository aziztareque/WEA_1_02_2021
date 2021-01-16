package basic_First_Class;

public class LearnDataType {

    //Data:
    //Data Type:
    //primitive data type --

    int age = 24;
    byte ram= 20;
    short number= 455;
    long ssn= 96309567900324l;

    double salary= 345.65;
    float courseFee= 5000.65f;

    char size = 'L';
    boolean isAvailable= true;


    //non primitive data type

    String name = "Aziz Rahan";

    public static void mobileBrand(){ // to test accessmodifier in learnaccessmodifierclass.
        System.out.println("iPhone");
    }

    //Array : can take multiple data at a time but data has to be same

    public static void main(String[] args) {

        int number1 = 23;
        int number2= 35;
        int total = number1+number2;

        System.out.println(total);

        double price = 45.6;
        System.out.println(price);

        String firstName= "Mohammad";
        String lastName= "Aziz";
        String fullName= firstName + lastName;

        System.out.println(fullName);




    }
}
