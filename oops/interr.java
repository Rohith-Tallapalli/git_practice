interface Notification {
    void message();
}

class Sms implements Notification {
    @Override
    public void message(){
        System.out.println("I am a sms");
    }
}

class Whatsapp implements Notification {
    @Override
    public void message(){
        System.out.println("I am a whatsapp");
    }
}

class Gmail implements Notification {
    @Override
    public void message(){
        System.out.println("I am a Gmail");
    }
}

public class interr{
    public static void main(String[] args) {
        Sms obj = new Sms();
        obj.message();
        Whatsapp w = new Whatsapp();
        w.message();
        Gmail g = new Gmail();
        g.message();
    }
}
