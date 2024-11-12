package secao17.comparable.application;

import secao17.comparable.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String path = "C:\\temp\\ex_interface_comparable2.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            
            String employeeCsv = bufferedReader.readLine();
            while (employeeCsv!= null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = bufferedReader.readLine();
            }
            Collections.sort(list);
            for (Employee e : list) {
                System.out.println(e.getName() + ", " + e.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
