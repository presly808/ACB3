package ua.artcode.vital.student_task;

/**
 * Created by admin on 18.12.2014.
 */
public class Group {

    int num;
    int size = 0;
    Student[] students = new Student[10];


    public void addStudent(Student student){
        students[size++] = student;
    }

    public Student removeLast(){
        return students[--size];
    }

    public void showGroup(){
        for(int i = 0; i < size; i++){
            students[i].sayHello();
        }
    }

}
