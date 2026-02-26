public class Employee extends Person{
    private double salary;
//    public Employee1(String name, int age, String gender, double salary) {
//        this.name = name;
//        this.age = age;
//        this.gender = "gender";
//        this.salary = salary;
//    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isSameName(Employee employee){
        return this.getName().equals (employee.getName());
    }
}

