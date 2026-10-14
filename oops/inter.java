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
    @Override
    public void message(){
        System.out.println("I am a whatsapp");
    }
}

class Gmail implements notification{
    @Override
    public void message(){
        System.out.println("I am a Gmail");
    }
}

public class inter{
    public static void main(String[] args) {
        notification obj = new sms();
        obj.message();
        obj = new whatsapp();
        obj.message();
        obj = new Gmail();
        obj.message();
    }
}
