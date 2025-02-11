import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFirstName() {
        return fullName.split(" ")[0];
    }
}

public class ques4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);

        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", 4500L, "Delhi"),
                new Employee("Jane Smith", 6000L, "Mumbai"),
                new Employee("Alice Johnson", 4800L, "Delhi"),
                new Employee("Bob Brown", 5000L, "Delhi"),
                new Employee("Charlie Davis", 3000L, "Delhi")
        );

        Set<String> uniqueFirstNames = employees.stream()
                .filter(e -> e.salary < 5000 && e.city.equalsIgnoreCase("Delhi"))
                .map(Employee::getFirstName)
                .collect(Collectors.toSet());

        System.out.println("Unique First Names (Salary < 5000 & Lives in Delhi): " + uniqueFirstNames);
    }
}
