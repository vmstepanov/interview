package i.stream;

// найти отделы с суммарной ЗП более 1 М, отсортировав по убыванию ЗП

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Department {
    public static void main(String[] args) {
        List<Employee> emp = null;
        Map<Department, Long> deptSalaries = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingLong(Employee::getSalary)));

        deptSalaries.entrySet().stream().filter(e->e.getValue() > 1_000_000)
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b)->a, LinkedHashMap::new));
    }
}

interface Employee {
    Department getDepartment();
    long getSalary();
}
