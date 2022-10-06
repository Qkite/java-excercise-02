package ListExcer;

import java.util.List;

public class ListExcerciseMain {

    public static void main(String[] args) {
        ListExcercise listExcercise = new ListExcercise();

        List<String> students = listExcercise.getStudents();
        for (String student: students){
            System.out.println(student);
        }
        System.out.println(students.size());
    }
}
