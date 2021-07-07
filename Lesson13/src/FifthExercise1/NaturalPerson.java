package FifthExercise1;

public class NaturalPerson {
    String name;
    String surname;
    int age;

    public void method1 (){
    Employee a = new Employee();
        a.setEmployeeProperties(this);
        System.out.println(a.naturalPerson);
        System.out.println(a.name);
        System.out.println(a.surname);
        System.out.println(a.age);
        System.out.println(a.jobPosition);
        System.out.println(a.jobDescription);
    }


}

//5. One class with a method that has a parameter.
//When calling the method, it should be possible to pass "this" as parameter.
