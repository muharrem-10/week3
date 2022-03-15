package Tr.Edu.Maltepe.OOP;

public class Teachers extends Person{

    public Teachers(){
        System.out.println("teachers constructor worked");
    }

    private int salary;


    public int getSalary() {

        return salary;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }
}
