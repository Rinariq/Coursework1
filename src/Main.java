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

        // базовая сложность
        print();
        System.out.println("\nСумма зарплат: " + findSumWages() + " руб.");
        System.out.println("\nСотрудник с минимальной ЗП:" + "\n" + findEmployeeWithMinWage());
        System.out.println("\nСотрудник с максимальной ЗП:" + "\n" + findEmployeeWithMaxWage());
        System.out.println("\nСредняя зарплата сотрудников: " + findAverageWage() + " руб.");
        System.out.println("\nСписок сотрудников:");
        makeListNPS();
        System.out.println("");

        //повышенная сложность
        indexWage();
        int numberDepartment = 1;
        int index = 10;
        System.out.println("\nСотрудник с минимальной ЗП в " + numberDepartment + " отделе: \n" + findEmployeeWithMinWageInDepartament(numberDepartment));
        System.out.println("\nСотрудник с максимальной ЗП в " + numberDepartment + " отделе: \n" + findEmployeeWithMaxWageInDepartament(numberDepartment));
        System.out.println("\nСумма ЗП сотрудников в " + numberDepartment + " отделе: \n" + findSumWagesInDepartment(numberDepartment) + " руб.");
        System.out.println("\nСредняя ЗП сотрудников в " + numberDepartment + " отделе: \n" + findAverageWageInDepartment(numberDepartment) + " руб.");
        System.out.println("\nСотрудники и их ЗП после индексации на " + index + "% в " + numberDepartment + " отделе:");
        indexWageInDepartment(index, numberDepartment);
        System.out.println("\nСотрудники " + numberDepartment + " отдела: ");
        employeesInDepartment(numberDepartment);
        int wageBelowAndMore = 100000;
        System.out.println("\nСотрудники с ЗП меньше " + wageBelowAndMore + " руб:");
        findEmployeeWithWageBelow(wageBelowAndMore);
        System.out.println("\nСотрудники с ЗП больше " + wageBelowAndMore + " руб:");
        findEmployeeWithWageMore(wageBelowAndMore);

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

    private static void indexWage() {
        for (Employee employee : EMPLOYEES) {
            employee.increaseWage(13);
            System.out.println(employee);
        }
    }

    private static Employee findEmployeeWithMinWageInDepartament(int numDepartment) {
        Employee employeeWithMinWageInDepartment = null;
        for (Employee employee : EMPLOYEES) {
            if ((employeeWithMinWageInDepartment == null || employee.getWage() < employeeWithMinWageInDepartment.getWage()) && employee.getDepartment() == numDepartment) {
                employeeWithMinWageInDepartment = employee;
            }
        }
        return employeeWithMinWageInDepartment;
    }

    private static Employee findEmployeeWithMaxWageInDepartament(int numDepartment) {
        Employee employeeWithMaxWageInDepartment = null;
        for (Employee employee : EMPLOYEES) {
            if ((employeeWithMaxWageInDepartment == null || employee.getWage() > employeeWithMaxWageInDepartment.getWage()) && employee.getDepartment() == numDepartment) {
                employeeWithMaxWageInDepartment = employee;
            }
        }
        return employeeWithMaxWageInDepartment;
    }

    private static int findSumWagesInDepartment(int numDepartment) {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee.getDepartment() == numDepartment) {
                sum += employee.getWage();
            }
        }
        return sum;
    }

    private static int findAverageWageInDepartment(int numDepartment) {
        int sumWageInDepartment = findSumWagesInDepartment(numDepartment);
        int staffEmployeeInDepartment = 0;
        for (Employee employee : EMPLOYEES) {
            if (employee.getDepartment() == numDepartment) {
                staffEmployeeInDepartment += 1;
            }
        }
        int averageWageInDepartment = sumWageInDepartment / staffEmployeeInDepartment;
        return averageWageInDepartment;
    }

    private static void indexWageInDepartment(int indexWage, int numDepartment) {
        for (Employee employee : EMPLOYEES) {
            if (employee.getDepartment() == numDepartment) {
                employee.increaseWage(indexWage);
                System.out.println(employee);
            }
        }
    }

    private static void employeesInDepartment(int numDepartment) {
        for (Employee employee : EMPLOYEES) {
            if (employee.getDepartment() == numDepartment) {
                System.out.println(employee.toShotString());
            }
        }
    }

    private static void findEmployeeWithWageBelow(int wageBelow) {
        for (Employee employee : EMPLOYEES) {
            if (employee.getWage() < wageBelow) {
                System.out.println(employee);
            }
        }
    }

    private static void findEmployeeWithWageMore(int wageMore) {
        for (Employee employee : EMPLOYEES) {
            if (employee.getWage() > wageMore) {
                System.out.println(employee);
            }
        }
    }
}