public class ex {
    public static void main(String[] args) {
        int a=11;
        int b = 2;
        try{
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (Exception e) {
            System.out.println("Error: Division by zero is not allowed."+e);
        }
    }
}