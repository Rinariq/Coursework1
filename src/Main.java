import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        EmployeeBook company = new EmployeeBook();
        company.allEmployees();
        company.print();
        System.out.println("\nЗамена сотрудника");
        int id = 3;
        company.deleteEmployee(id);
        Employee newEmployee = new Employee("Иванов","Иван","Иванович",3,123000);
        newEmployee.setId(id);
        company.addEmployee(newEmployee);
        company.print();
        System.out.println("\nСотрудник с ID: " + id);
        company.findEmployeeById(id);

    }


}