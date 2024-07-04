package Builder;

public class Client {
    public static void main(String[] args) {
//        StudentBuilder sb = new StudentBuilder();
           Student st = Student
                        .getBuilder()
                        .setName("Mohit")
                        .setAge(25)
                        .setGradYear(2000)
                        .setCourseName("Academy")
                        .build();

           // need to stop usage of the below line
//        Student st1 = new Student(new StudentBuilder());
//        sb.setName("Mohit");
//        sb.setAge(25);
//        sb.setGradYear(2000);
//        sb.setCourseName("Academy");

//        Student s = new Student(sb);
    }
}
