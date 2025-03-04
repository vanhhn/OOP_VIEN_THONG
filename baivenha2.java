import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

abstract class Person {
    private String name;
    private String birthday;

    abstract public String getDetails();

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }
}

class Employee extends Person {
    private float salary;

    public Employee(String name, String birthday, float salary) {
        super(name, birthday);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String getDetails() {
        return "Employee: " + getName() + " - " + getBirthday() + " - Salary: " + salary;
    }
}

class Manager extends Employee {
    private ArrayList<Intern> interns;

    public Manager(String name, String birthday, float salary) {
        super(name, birthday, salary);
        interns = new ArrayList<>();
    }

    public void addIntern(Intern intern) {
        interns.add(intern);
    }

    public ArrayList<Intern> getInterns() {
        return interns;
    }

    @Override
    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Manager: ").append(getName()).append(" - ").append(getBirthday())
                .append(" - Salary: ").append(getSalary());
        if (interns.isEmpty()) {
            sb.append(" - No interns");
        } else {
            sb.append(" - Interns: ");
            for (Intern i : interns) {
                sb.append(i.getName()).append(", ");
            }
            sb.setLength(sb.length() - 2); // Xóa dấu phẩy cuối
        }
        return sb.toString();
    }
}

class Intern extends Person {
    private String university;

    public Intern(String name, String birthday, String university) {
        super(name, birthday);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public String getDetails() {
        return "Intern: " + getName() + " - " + getBirthday() + " - University: " + university;
    }
}

class Company {
    private ArrayList<Person> arr;

    public Company() {
        arr = new ArrayList<>();
    }

    public void addPerson(Person x) {
        arr.add(x);
    }

    public void printAll() {
        for (Person x : arr) {
            System.out.println(x.getDetails());
        }
    }

    public void sortEmployeesBySalary() {
        ArrayList<Employee> employees = new ArrayList<>();
        for (Person p : arr) {
            if (p instanceof Employee) {
                employees.add((Employee) p);
            }
        }
        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));

        System.out.println("\nEmployees (including Managers) sorted by salary:");
        for (Employee e : employees) {
            System.out.println(e.getDetails());
        }
    }

    public void checkPersonType() {
        System.out.println("\nChecking person types:");
        for (Person p : arr) {
            if (p instanceof Manager) {
                System.out.println(p.getName() + " is a Manager.");
            } else if (p instanceof Employee) {
                System.out.println(p.getName() + " is an Employee.");
            } else if (p instanceof Intern) {
                System.out.println(p.getName() + " is an Intern.");
            } else {
                System.out.println(p.getName() + " is an unknown type.");
            }
        }
    }
}

public class baivenha2 {
    public static void main(String[] args) {
        Company company = new Company();

        Employee e1 = new Employee("Alice", "1990-01-01", 5000);
        Employee e2 = new Employee("Bob", "1992-02-02", 4500);
        Intern i1 = new Intern("David", "2000-04-04", "Harvard");
        Intern i2 = new Intern("Eva", "2001-05-05", "Stanford");
        Manager m1 = new Manager("Charlie", "1985-03-03", 8000);

        // Manager hướng dẫn Intern
        m1.addIntern(i1);
        m1.addIntern(i2);

        company.addPerson(e1);
        company.addPerson(e2);
        company.addPerson(m1);
        company.addPerson(i1);
        company.addPerson(i2);

        System.out.println("All people in the company:");
        company.printAll();

        company.sortEmployeesBySalary();
        company.checkPersonType();
    }
}
