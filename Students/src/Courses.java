public class Courses {

    private String subjectName;
    private int studentGrade;

    Courses(String subjectName, int grade) {

        this.subjectName = subjectName;
        this.studentGrade = grade;

    }

    public String getSubjectName() {

        return subjectName;

    }

    public int getStudentGrade() {

        return studentGrade;

    }

    public String toString() {

        return "Courses[Subject name = " + subjectName + "]";

    }

}
