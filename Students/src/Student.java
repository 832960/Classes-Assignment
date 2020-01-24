public class Student {

    private String firstName;
    private static int id = 1;
    private int studentId;
    private Courses[] courses;

    Student(String firstName, Courses[] courses) {

        this.firstName = firstName;
        this.courses = courses;
        studentId = id;
        id++;

    }

    public String getFirstName() {

        return firstName;

    }

    public int getStudentId() {

        return studentId;

    }

    public void getSubjects() {

        for (Courses course : courses) {

            System.out.println(course.getSubjectName());

        }

    }

    public int getGrades() {

        int total = 0;

        for (Courses course : courses) {

            total += course.getStudentGrade();

        }

        return total / courses.length;

    }

    public void addCourse(String name, int grade) {

        Courses course = new Courses(name, grade);

        Courses[] temp = new Courses[courses.length+1];
        System.arraycopy(courses, 0, temp, 0, courses.length);

        temp[temp.length-1] = course;

        courses = temp;

    }

    public String toString() {

        return "Student[id = " + studentId + ", First Name = " + firstName + "]";

    }

    public void coursesToString() {

        for (Courses course : courses) {

            System.out.println(course.toString());

        }

    }

}
