package secao18.genericsDelimitados.problema1.application;

import secao18.genericsDelimitados.problema1.model.service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        String path = "C:\\temp\\generics\\in.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                list.add(Integer.parseInt(line));
                line = bufferedReader.readLine();
            }

            Integer x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
