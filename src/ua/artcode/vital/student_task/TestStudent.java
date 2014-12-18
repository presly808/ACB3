package ua.artcode.vital.student_task;

/**
 * Created by admin on 18.12.2014.
 */
public class TestStudent {

    public static void main(String[] args) {
        Address address = new Address();
        address.setAddress("Kiev", "V.Vasylevskoi", 5);

        Student s1 = new Student();
        s1.age = 25;
        s1.name = "Vova";
        s1.mark = 4;
        s1.address = address;

        Student s2 = new Student();
        s2.age = 22;
        s2.name = "Andrey";
        s2.mark = 5;
        s2.address = address;

        Student s3 = null;
        s3.sayHello();
    }


}
