package ua.artcode.vital.student_task;

/**
 * Created by admin on 18.12.2014.
 */
public class TestGroup {


    public static void main(String[] args) {
        Student[] mas = StudentGenerator.genStudents(10);

        Group group = new Group();
        group.students = mas;
        group.size = mas.length;


        group.showGroup();
    }
}
