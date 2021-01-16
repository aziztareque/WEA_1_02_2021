package basic_First_Class;

public class LearnCasting {

    //Casting: Casting means converting data type
    //Primitive DataType to Primitive dataType
    //NonPrimitive to NonPrimitive

    public static void main(String[] args) {
        double price = 35.99;
        int discountPrice = (int) price;

        System.out.println(discountPrice);

        int num1=50;
        int num2=40;
        int num3=num1;
        int num4=num3+num2;

        System.out.println("Total is " + num4);

        int age= 24;
        double newAge = (double) age;
        System.out.println(newAge);

        int number =56;
        byte total= (byte) number;
        System.out.println(total);

        String name ="Rahan";
        String stName=name;
        String ssn="2345";
        int newSsn = Integer.parseInt(ssn);
        System.out.println(ssn);

        int salary = 2500;
        String newSalary = String.valueOf(salary);
        System.out.println(newSalary);

    }
}
