package md.teckwill.lesson15;

public class SmartPhone extends Phone{
    int generation;

    SmartPhone(){
        super();
    };

    SmartPhone(String model){
        super(model);
    };

    SmartPhone(String model, int imei){
        super(model,imei);
    };

    SmartPhone(String model, int imei,  String color){
        super(model,imei,color);
    };

    SmartPhone(String model, int imei,  String color, int generation){
        super(model,imei,color);
        this.generation  = generation;
    };

    @Override
    public void playSong(String songToPlay){
        System.out.println("The song " + songToPlay +" is playing from the child class");
    };

    @Override
    void call(){
        System.out.println("The phone is calling from the child class");
    };

}
