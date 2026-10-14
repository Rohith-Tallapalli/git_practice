// Nested class
//Type: Anonymous inner class
//Anonymous inner class are created instantly ,without a name and without a constructor. 
// They are used to override the method of class or interface.
// To use lambda expression, we need anonymous class,we need to have only one method in the interface.
// "->" Tho=is is lambda operator, it is used to implement the abstract method of functional interface.
// "()->{}" Structure of lambda expression.
interface a{
    void demo();
}


public class anonymous{
    public static void main(String[] args) {
        a obj = ()->System.out.println("This is demo method of anonymous inner class");
        // If there multiple stmnts wee need to use {} after the lambda operator,
        // And if ther are any task to be performed operations like a+b, 
        // we need to pass arguments in the () while creating the lambda expression.
        obj.demo();
    }

}