public class SixthExercise {

    public SixthExercise getTheType(){

        return this;
    }

    public static void main(String[] args) {
        SixthExercise object = new SixthExercise();
        System.out.println(object.getTheType());
    }
}
 //6. One class with a method or two that return a type of the current class.
// Hint: using "this".