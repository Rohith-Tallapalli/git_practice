
import java.time.*;

class methods{
    public static void main(String[]args){
        LocalTime t=LocalTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(t);
    }
}