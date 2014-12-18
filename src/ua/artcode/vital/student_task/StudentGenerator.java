package ua.artcode.vital.student_task;

import ua.artcode.ArrayHelper;

/**
 *
 */
public class StudentGenerator {

    static String[] names = {"Vova", "Kolia", "Andriy", "Vitaliy", "Serhii", "Ruslan", "Valentin", "Olia"};

    public static Student[] genStudents(int size){
        Student[] students = new Student[size];
        for(int i = 0; i < students.length; i++){
            Student curr = new Student();
            curr.name = names[(int)(Math.random() * names.length)];
            curr.age = ArrayHelper.genRandomNum(18,25);
            curr.mark = ArrayHelper.genRandomNum(3,5);
            students[i] = curr;
        }

        return students;
    }

}
