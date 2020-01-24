import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        students.add(0, new Student("Alex", "Chen", 1));
        students.add(1, new Student("Emily", "Chen", 1));
        students.add(2, new Student("Tyrone", "Zheng", 12));
        students.add(3, new Student("Audrey", "Zeng", 5));
        students.add(4, new Student("Donald", "Tam", 6));
        students.add(5, new Student("Hubert", "Wolfeschlegelsteinhausenbergerdorff", 2));
        students.add(6, new Student("Neil", "Tu", 5));
        students.add(7, new Student("Terry", "Zeng", 2));
        students.add(8, new Student("Emily", "Watson", 10));
        students.add(9, new Student("Walter", "Chen", 3));

        teachers.add(0, new Teacher("Paul", "Pham", "Science"));
        teachers.add(1, new Teacher("Mark", "Panaligan", "PHE"));
        teachers.add(2, new Teacher("Alex", "Zeng", "Mandarin"));

        School school = new School("Windermere", 30, 20, teachers, students);

        school.getTeachers();
        school.getStudents();

        System.out.println();

        school.delStudent("Emily", "Watson", 10);
        school.delStudent("Neil", "Tu", 5);
        school.delTeacher("Paul", "Pham", "Science");

        school.getTeachers();
        school.getStudents();

    }

}
