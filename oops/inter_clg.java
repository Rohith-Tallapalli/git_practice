interface notification{
    void message();
}
class sms implements notification{
    @Override
    public void message(){
        System.out.println("I am a sms");
    }
}
class whatsapp implements notification{
    public void message(){
        System.out.println("I am a whatsapp");
    }
}
}
class dog implements animal{}
public class inter_clg{
    public static void main(String[] args){
        dog obj1 = new dog();
        obj1.demo();
        animal.demo1();
    }
}