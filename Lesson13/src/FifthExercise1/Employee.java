package FifthExercise1;

public class Employee {
    NaturalPerson naturalPerson;
    String name;
    String surname;
    int age;
    String jobPosition;
    String jobDescription;

    public void setEmployeeProperties(NaturalPerson naturalPerson){
        this.naturalPerson = naturalPerson;
        this.name = naturalPerson.name;
        this.surname = naturalPerson.surname;
        this.age = 1;
        this.jobPosition = "baby";
        this.jobDescription = "eating,  growing, crying, loving MOM";
    };
}
//5. One class with a method that has a parameter.
//When calling the method, it should be possible to pass "this" as parameter.
