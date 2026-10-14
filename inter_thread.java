import java.lang.*;
class abcd implements Runnable{

    String info = "RO45";
    public void run(){
        System.out.println("Hlo "+ info);
    }


}
public class inter_thread {
    public static void main(String[] args){
        abcd obj=new abcd();
        Thread t=new Thread(obj);
        t.start();
    }
}
