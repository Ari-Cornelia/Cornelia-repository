public class FirstExercise {

    public void methodOne(){
        this.methodTwo();
        this.methodThree();
        System.out.println("This is the first method");
    }
    public void methodTwo(){
        System.out.println("This is the second method");
    }
    public void methodThree(){
        System.out.println("This is the third method");
    }

    public static void main (String[] args){
        FirstExercise a = new FirstExercise();
        a.methodOne();
        }
}



//1. One class with two or three methods.
// In the first method call the second and third method with "this" keyword.