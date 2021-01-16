package basic_First_Class;

public class LearnObject {

    //how to create a object?
    // className objectName = new constructionOfClass();

    int num1=34;
    int num2=56;


    public static void main(String[] args) {
        LearnObject learn = new LearnObject();

        int total = learn.num1+ learn.num2; // call by object name
        System.out.println("Total value is "+ total);

        //can we create multiple object of same class? == Yes.
        LearnObject obj = new LearnObject();

        obj.num1=66;
        obj.num2=77;
        int output = obj.num1*obj.num2;
        System.out.println("output is " + output);

        //can we create another class object here? == yes
        LearnDataType dataTypeObj = new LearnDataType();

        System.out.println(dataTypeObj.courseFee);

        dataTypeObj.isAvailable = false; // reAssign the value
        System.out.println(dataTypeObj.isAvailable); // recent value will print
    }
}
