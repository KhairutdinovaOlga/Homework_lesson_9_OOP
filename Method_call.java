public class Method_call {

    static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Olga");
        person1.setGender("F");

        Person person2 = new Person();
        person2.setName("Sergey");
        person2.setGender("M");

        Employee[] employeeArray = new Employee[4];
        employeeArray[0]  = new Employee();
        employeeArray[0].setName("Миша");
        employeeArray[0].setAge(35);
        employeeArray[0].setGender("M");
        employeeArray[0].setSalary(123.0);


        employeeArray[1]  = new Employee();
        employeeArray[1].setName("Лена");
        employeeArray[1].setAge(30);
        employeeArray[1].setGender("F");
        employeeArray[1].setSalary(110);


        employeeArray[2]  = new Employee();
        employeeArray[2].setName("Лена");
        employeeArray[2].setAge(38);
        employeeArray[2].setGender("F");
        employeeArray[2].setSalary(140);


        employeeArray[3]  = new Employee();
        employeeArray[3].setName("Коля");
        employeeArray[3].setAge(30);
        employeeArray[3].setGender("M");
        employeeArray[3].setSalary(110);

        Employee employee4 = new Employee();
        employee4.setName("Olga");
        employee4.setGender("F");
        employee4.setAge(25);
        employee4.setSalary(130.0);

        Employee employee5 = new Employee();
        employee5.setName("Olga");
        employee5.setGender("F");
        employee5.setAge(45);
        employee5.setSalary(200.0);

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(employee4.isSameName(employee5));

        Salary salary = new Salary(); // создаем объект
        double total = salary.getSum(employeeArray); // вызываем нестатический метод
        System.out.println(total);
    }
}


