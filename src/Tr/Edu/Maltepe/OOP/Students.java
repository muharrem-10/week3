package Tr.Edu.Maltepe.OOP;

public class Students extends Person{

    public Students(){
        System.out.println("students constructor worked");
    }

    private String department;
    private int lectureCount;


    public String getDepartment() {

        return department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    public int getLectureCount() {

        return lectureCount;
    }

    public void setLectureCount(int lectureCount) {

        this.lectureCount = lectureCount;
    }
}
