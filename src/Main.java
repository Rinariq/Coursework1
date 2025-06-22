import javax.swing.*;

public class Main {
    public final static Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Новиков", "Александр", "Петрович", 2, 144000);
        EMPLOYEES[1] = new Employee("Иванов", "Дмитрий", "Сергеевич", 1, 78400);
        EMPLOYEES[2] = new Employee("Петрова", "Алена", "Игоревна", 3, 65200);
        EMPLOYEES[3] = new Employee("Сидоров", "Артем", "Викторович", 4, 112500);
        EMPLOYEES[4] = new Employee("Кузнецова", "Елена", "Олеговна", 1, 93700);
        EMPLOYEES[5] = new Employee("Смирнов", "Павел", "Игоревич", 5, 127300);
        EMPLOYEES[6] = new Employee("Васильева", "Мария", "Дмитриевна", 2, 56800);
        EMPLOYEES[7] = new Employee("Морозова", "Ольга", "Владимировна", 4, 85600);
        EMPLOYEES[8] = new Employee("Лебедев", "Иван", "Алексеевич", 5, 103200);
        EMPLOYEES[9] = new Employee("Козлова", "Татьяна", "Сергеевна", 3, 59500);

        print();
        System.out.println("\nСумма зарплат: " + findSumWages() + " руб.");
        System.out.println("\nСотрудник с минимальной ЗП:" + "\n" + findEmployeeWithMinWage());
        System.out.println("\nСотрудник с максимальной ЗП:" + "\n" + findEmployeeWithMaxWage());
        System.out.println("\nСредняя зарплата сотрудников: " + findAverageWage() + " руб.");
        System.out.println("\nСписок сотрудников:");
        makeListNPS();
    }

    private static void print() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static int findSumWages() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getWage();
        }
        return sum;
    }

    private static Employee findEmployeeWithMinWage() {
        Employee employeeWithMinWage = null;
        for (Employee employee : EMPLOYEES) {
            if (employeeWithMinWage == null || employee.getWage() < employeeWithMinWage.getWage()) {
                employeeWithMinWage = employee;
            }
        }
        return employeeWithMinWage;
    }

    private static Employee findEmployeeWithMaxWage() {
        Employee employeeWithMaxWage = null;
        for (Employee employee : EMPLOYEES) {
            if (employeeWithMaxWage == null || employee.getWage() > employeeWithMaxWage.getWage()) {
                employeeWithMaxWage = employee;
            }
        }
        return employeeWithMaxWage;
    }

    private static int findAverageWage() {
        int sumWage = findSumWages();
        int averageWage = sumWage / EMPLOYEES.length;
        return averageWage;
    }

    private static void makeListNPS() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getNameEmployee() + " " + employee.getPatronymicEmployee() + " " + employee.getSurnameEmployee());
        }
    }
}