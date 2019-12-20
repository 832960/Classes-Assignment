public class Student {

    String firstName;
    int studentId;
    static int id;
    Courses[] courses;

    Student(String firstName, Courses[] courses) {

        this.firstName = firstName;
        studentId = id;
        id++;
        this.courses = courses;

    }

}
