class Member {

    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary = " + salary);
    }
}

class Employee extends Member {

    String specialization;

    void displayEmployee() {

        System.out.println("Employee Details");
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Phone = " + phoneNumber);
        System.out.println("Address = " + address);
        System.out.println("Specialization = " + specialization);

        printSalary();
    }
}

class Manager extends Member {

    String department;

    void displayManager() {

        System.out.println("\nManager Details");
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Phone = " + phoneNumber);
        System.out.println("Address = " + address);
        System.out.println("Department = " + department);

        printSalary();
    }
}

public class p97 {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.name = "Aniruddh";
        e.age = 19;
        e.phoneNumber = "9876543210";
        e.address = "Rajkot";
        e.salary = 25000;
        e.specialization = "Java Developer";

        Manager m = new Manager();

        m.name = "Rahul";
        m.age = 35;
        m.phoneNumber = "9999999999";
        m.address = "Ahmedabad";
        m.salary = 60000;
        m.department = "IT";

        e.displayEmployee();

        m.displayManager();
    }
}