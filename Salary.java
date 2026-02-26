public class Salary {
    public double getSum(Employee[] employeeArray ){
        double total = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            Employee employee = employeeArray[i];
            total += employee.getSalary();
        }
        return total;
    }
}
