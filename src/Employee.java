import java.util.Objects;

public class Employee {
    private String nameEmployee;
    private String patronymicEmployee;
    private String surnameEmployee;
    private int department;
    private int wage;

    private int id;
    private static int idEmployee = 1;

    public Employee(String nameEmployee, String patronymicEmployee, String surnameEmployee, int department, int wage) {
        this.nameEmployee = nameEmployee;
        this.patronymicEmployee = patronymicEmployee;
        this.surnameEmployee = surnameEmployee;
        this.department = department;
        this.wage = wage;
        this.id = idEmployee++;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public String getPatronymicEmployee() {
        return patronymicEmployee;
    }

    public String getSurnameEmployee() {
        return surnameEmployee;
    }

    public int getDepartment() {
        return department;
    }

    public int getWage() {
        return wage;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return this.nameEmployee.equals(other.nameEmployee) &&
                this.patronymicEmployee.equals(other.patronymicEmployee) &&
                this.surnameEmployee.equals(other.surnameEmployee) &&
                this.department == other.department &&
                this.wage == other.wage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameEmployee, patronymicEmployee, surnameEmployee, department, wage, id);
    }

    @Override
    public String toString() {
        return "ID: " + id + "  ФИО СОТРУДНИКА: " + nameEmployee + " " + patronymicEmployee + " " + surnameEmployee + "  № ОДТЕЛА: " + department + "  ЗАРПЛАТА: " + wage + " руб.";
    }

    public void increaseWage(int increment) {
        this.wage += wage / 100 * increment;
    }


    public String toShotString() {
        return "ID: " + id + "  ФИО СОТРУДНИКА: " + nameEmployee + " " + patronymicEmployee + " " + surnameEmployee + "  ЗАРПЛАТА: " + wage + " руб.";
    }
}
