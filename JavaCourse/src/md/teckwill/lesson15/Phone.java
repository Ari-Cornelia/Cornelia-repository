package md.teckwill.lesson15;

public class Phone {

    String model;
    String color;
    private int imei;

    Phone(){};

    Phone(String model){
        this();
        this.model = model;
    };

    Phone(String model, int imei){
        this(model);
        this.imei = imei;

    };

    Phone(String model, int imei,  String color){
        this(model,imei);
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
