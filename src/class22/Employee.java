package class22;

public class Employee {
    String name;
    static int baseSalary = 30000;
    static int baseHoliday = 10;

     void printSalary() {
        System.out.println(baseSalary);
    }

    void printHoliday() {
        System.out.println(baseHoliday);
    }

}

class OfficeBoy extends Employee {

}

class Manager extends Employee {
    void printSalary() {
        System.out.println((baseSalary * 4) + 200000);
    }
}

class Developer extends Employee {
     void printSalary() {
        System.out.println((baseSalary * 5) + 30000);
    }
}

class QA extends Employee {
    void printSalary() {
        System.out.println((baseSalary * 5) + 30000);
    }

    void printHoliday() {
        System.out.println(baseHoliday*5);
    }
}

class EmployeeTester {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.printSalary();
        OfficeBoy officeBoy = new OfficeBoy();
        officeBoy.printSalary();
    }
}

