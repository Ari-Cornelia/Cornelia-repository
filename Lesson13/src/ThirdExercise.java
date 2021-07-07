public class ThirdExercise {
    String name;
    String surname;
    int age;

    ThirdExercise(String name){
        this.name = name;
    };

    ThirdExercise(String name, String surname){
        this.name  = name;
        this.surname = surname;
    };

    ThirdExercise(String name, String surname, int age){
        this(name,surname);
        this.age = age;
    };

    public static void main (String[] args){
        ThirdExercise a = new ThirdExercise("Cornelia", "Volosin", 24);
        System.out.println(a.name);
        System.out.println(a.surname);
        System.out.println(a.age);
    }

}

// 3. One class with three overloaded constructors.
// Use "this" to assign the passed parameters to class properties.

