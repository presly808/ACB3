package ua.artcode.vital.student_task;

/**
 * Created by admin on 18.12.2014.
 */
public class Student {

    String name;
    int age;
    int mark;
    Address address;

    public void sayHello(){
        System.out.printf("Hi, im student, name %s, age %d\n", name, age);
    }

}
