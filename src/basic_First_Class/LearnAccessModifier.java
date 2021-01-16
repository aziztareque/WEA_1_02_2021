package basic_First_Class;

public class LearnAccessModifier {

    // Access Modifier / Access Specifier : class, variable, method
    //Private : only we can call use within the class where it is located
    //protected: only accessible from all the class of that particular package.

    // Access modifier
    //--public, private, protected, default.

    private static int age= 27;
    //protected static int age= 78;

    public static void main(String[] args) {

        LearnDataType.mobileBrand();
        System.out.println(LearnAccessModifier.age);

    }
}
