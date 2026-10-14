
class meta_data{
    String name;
    String date;
    String gender;
    String source;
    String destination;
    int km;

    meta_data(String name,String gender,String source,  String destination,String date){
        this.name = name;
        this.gender=gender;
        this.source=source;
        this.destination=destination;
        this.date=date;
        

    }

    void booking(){
        System.out.println("Mr/Ms "+name+" Your booking from "+source+" to "+destination +" on "+ date+" Thank u Eat well.. die happysoooooooooooon the journey");
}
}



public class travels{
    public static void main(String[] args){
        meta_data obj1 = new meta_data("rohith","Male","Anantapur","Banglore","24-04-2027");
        obj1.booking();

    }
}