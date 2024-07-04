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

    private Student(StudentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.gradYear = builder.gradYear;
    }

    static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        int id;
        String name;
        int age;
        int gradYear;
        String courseName;

        public StudentBuilder setCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        Student build(){
            // validations are being done over here
            if(age < 20){
                throw new IllegalArgumentException("Age must be greater than 20");
            }
            if(gradYear > 2024){
                throw new IllegalArgumentException("GradYear must be greater than 2024");
            }

            return new Student(this);
        }
    }

}
