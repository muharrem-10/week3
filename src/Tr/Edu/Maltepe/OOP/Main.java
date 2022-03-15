package Tr.Edu.Maltepe.OOP;

public class Main {

    public static void main(String[] args) {

        Teachers teachers = new Teachers();
        teachers.setFirstName("muharrem");
        teachers.setLastName("bahceci");
        teachers.setAge(22);
        teachers.setSalary(10000);


        System.out.println(teachers.getFirstName());
        System.out.println(teachers.getLastName());
        System.out.println(teachers.getAge());
        System.out.println(teachers.getSalary());

        Students students = new Students();
        students.setFirstName("ayşe");
        students.setLastName("bahceci");
        students.setAge(10);
        students.setDepartment("computer engineering");
        students.setLectureCount(20);

        System.out.println(students.getFirstName());
        System.out.println(students.getLastName());
        System.out.println(students.getAge());
        System.out.println(students.getDepartment());
        System.out.println(students.getLectureCount());
    }
}
