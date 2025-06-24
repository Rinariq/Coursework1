public class EmployeeBook {
    private static Employee [] employees = new Employee[10];

    public void allEmployees(){
        employees[0] = new Employee("Новиков", "Александр", "Петрович", 2, 144000);
        employees[1] = new Employee("Иванов", "Дмитрий", "Сергеевич", 1, 78400);
        employees[2] = new Employee("Петрова", "Алена", "Игоревна", 3, 65200);
        employees[3] = new Employee("Сидоров", "Артем", "Викторович", 4, 112500);
        employees[4] = new Employee("Кузнецова", "Елена", "Олеговна", 1, 93700);
        employees[5] = new Employee("Смирнов", "Павел", "Игоревич", 5, 127300);
        employees[6] = new Employee("Васильева", "Мария", "Дмитриевна", 2, 56800);
        employees[7] = new Employee("Морозова", "Ольга", "Владимировна", 4, 85600);
        employees[8] = new Employee("Лебедев", "Иван", "Алексеевич", 5, 103200);
        employees[9] = new Employee("Козлова", "Татьяна", "Сергеевна", 3, 59500);
    }

    public void addEmployee(Employee newEmployee){
        for (int i = 0; i< employees.length; i++){
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return;
            }
        }
    }

    public void deleteEmployee (int idEmployee){
        for (int i = 0; i< employees.length; i++){
            if (employees[i].getId() == idEmployee){
                employees[i] = null;
            }
        }
    }

    public void findEmployeeById(int id){
        for (Employee employee : employees){
            if(employee.getId() == id){
                System.out.println(employee);
            }
        }
    }

    public void print() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public int findSumWages() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getWage();
        }
        return sum;
    }

    public Employee findEmployeeWithMinWage() {
        Employee employeeWithMinWage = null;
        for (Employee employee : employees) {
            if (employeeWithMinWage == null || employee.getWage() < employeeWithMinWage.getWage()) {
                employeeWithMinWage = employee;
            }
        }
        return employeeWithMinWage;
    }

    public Employee findEmployeeWithMaxWage() {
        Employee employeeWithMaxWage = null;
        for (Employee employee : employees) {
            if (employeeWithMaxWage == null || employee.getWage() > employeeWithMaxWage.getWage()) {
                employeeWithMaxWage = employee;
            }
        }
        return employeeWithMaxWage;
    }

    public int findAverageWage() {
        int sumWage = findSumWages();
        int averageWage = sumWage / employees.length;
        return averageWage;
    }

    public void makeListNPS() {
        for (Employee employee : employees) {
            System.out.println(employee.getNameEmployee() + " " + employee.getPatronymicEmployee() + " " + employee.getSurnameEmployee());
        }
    }

    public void indexWage() {
        for (Employee employee : employees) {
            employee.increaseWage(13);
            System.out.println(employee);
        }
    }

    public Employee findEmployeeWithMinWageInDepartament(int numDepartment) {
        Employee employeeWithMinWageInDepartment = null;
        for (Employee employee : employees) {
            if ((employeeWithMinWageInDepartment == null || employee.getWage() < employeeWithMinWageInDepartment.getWage()) && employee.getDepartment() == numDepartment) {
                employeeWithMinWageInDepartment = employee;
            }
        }
        return employeeWithMinWageInDepartment;
    }

    public Employee findEmployeeWithMaxWageInDepartament(int numDepartment) {
        Employee employeeWithMaxWageInDepartment = null;
        for (Employee employee : employees) {
            if ((employeeWithMaxWageInDepartment == null || employee.getWage() > employeeWithMaxWageInDepartment.getWage()) && employee.getDepartment() == numDepartment) {
                employeeWithMaxWageInDepartment = employee;
            }
        }
        return employeeWithMaxWageInDepartment;
    }

    public int findSumWagesInDepartment(int numDepartment) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numDepartment) {
                sum += employee.getWage();
            }
        }
        return sum;
    }

    public int findAverageWageInDepartment(int numDepartment) {
        int sumWageInDepartment = findSumWagesInDepartment(numDepartment);
        int staffEmployeeInDepartment = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == numDepartment) {
                staffEmployeeInDepartment += 1;
            }
        }
        int averageWageInDepartment = sumWageInDepartment / staffEmployeeInDepartment;
        return averageWageInDepartment;
    }

    public void indexWageInDepartment(int indexWage, int numDepartment) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == numDepartment) {
                employee.increaseWage(indexWage);
                System.out.println(employee);
            }
        }
    }

    public void employeesInDepartment(int numDepartment) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == numDepartment) {
                System.out.println(employee.toShotString());
            }
        }
    }

    public void findEmployeeWithWageBelow(int wageBelow) {
        for (Employee employee : employees) {
            if (employee.getWage() < wageBelow) {
                System.out.println(employee);
            }
        }
    }

    public void findEmployeeWithWageMore(int wageMore) {
        for (Employee employee : employees) {
            if (employee.getWage() > wageMore) {
                System.out.println(employee);
            }
        }
    }
}
