package md.teckwill.lesson15;

public class SmartPhone extends Phone{
    int generation;

    SmartPhone(){
        super();
    };

    SmartPhone(int someInt){
        super(someInt);
    };

    SmartPhone(int  someInt, String model){
        super(someInt,model);
    };

    SmartPhone(int  someInt, String model, int imei){
        super(someInt,model,imei);
    };

    SmartPhone(int  someInt, String model, int imei,  String color){
        super(someInt,model,imei,color);
    };

    SmartPhone(int  someInt, String model, int imei,  String color, int generation){
        super(someInt,model,imei,color);
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
