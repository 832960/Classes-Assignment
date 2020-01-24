public class Main {

    public static void main(String[] args) {

        Student student = new Student("Jon", new Courses[]{

            new Courses("Math", 90),
            new Courses("Science",93),

        });

        //Adds a course to the student's courses array
        student.addCourse("Social Studies", 91);
        student.addCourse("NA", 10);

        //Gets all student's subjects
        student.getSubjects();

        //Average grade
        System.out.println(student.getGrades());

        //Printing student object
        System.out.println(student.toString());

        //Printing courses object
        student.coursesToString();

    }

}
