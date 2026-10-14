class a1{
    private class a2{
        void demo(){
            System.out.println("I am a inner class");
        }
    }
    void java(){
        a2 obj1 = new a2();
        obj1.demo();

    }
}

public class nested {
    public static void main(String[] args) {
        a1 obj = new a1();
        obj.java();
    }
}