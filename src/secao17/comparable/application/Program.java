package secao17.comparable.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String path = "C:\\temp\\ex_interface_comparable.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String name = bufferedReader.readLine();
            while (name!= null) {
                list.add(name);
                name = bufferedReader.readLine();
            }
            Collections.sort(list);
            for (String n : list) {
                System.out.println(n);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
