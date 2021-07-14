package md.teckwill.lesson15;

public class Phone {

    int someInt;
    String model;
    String color;
    private int imei;

    Phone(){};

    Phone( int someInt){
        this();
        this.someInt = someInt;
    };

    Phone(int someInt,String model){
        this(someInt);
        this.model = model;
    };

    Phone(int someInt,String model, int imei){
        this(someInt,model);
        this.imei = imei;

    };

    Phone(int someInt,String model, int imei,  String color){
        this(someInt,model,imei);
        this.color = color;

    };

    public void setIMEI(int imei){
        this.imei = imei;
    };

    public int getIMEI(){
        return this.imei;
    };

    public void playSong(String songToPlay){
        System.out.println("The song " + songToPlay +" is playing from the parent class");
    };

    void call(){
        System.out.println("The phone is calling from the parent class");
    };

    private void sendMessage(){
        System.out.println("The message is sent from the parent class");
    };
}
