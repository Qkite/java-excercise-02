package ListExcer;

import java.util.ArrayList;
import java.util.List;

public class ListExcercise {



    private List<String> students;

    public List<String> getStudents() {
        return this.students;
    }

    public ListExcercise(){

        this.students = new ArrayList<>();
        this.students.add("김경록");
        this.students.add("김미미");
        this.students.add("김나나");
    }
}
