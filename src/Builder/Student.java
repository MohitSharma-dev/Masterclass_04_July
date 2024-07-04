package Builder;

public class Student {
    int id;
    String name;
    int age;
    int gradYear;
    String courseName;
    // You can keep more attributes

    // In the worst way we have to write a lot of diff constructors
    Student(int id, String name, int age, int gradYear) {
//
    }

    Student(StudentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.gradYear = builder.gradYear;
    }

    static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }
}
