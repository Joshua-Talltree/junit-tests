import java.util.ArrayList;

public class Student {

    public long id;
    public String name;
    ArrayList<Integer> grades = new ArrayList<Integer>();

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.addGrade(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverages() {
        return this.getGradeAverages();
    }
}
