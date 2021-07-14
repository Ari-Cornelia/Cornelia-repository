package md.teckwill.lesson15;

public class TestClass {
    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone();
        samsung.setIMEI(1);
        System.out.println(samsung.someInt);
        System.out.println(samsung.generation);
        System.out.println(samsung.model);
        System.out.println(samsung.getIMEI());

    }
}
