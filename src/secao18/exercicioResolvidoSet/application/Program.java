package secao18.exercicioResolvidoSet.application;

import secao18.exercicioResolvidoSet.model.entities.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        String path = "C:\\temp\\generics\\set.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            Set<User> set = new HashSet<>();

            String line = bufferedReader.readLine();

            while (line != null) {
                String[] fields = line.split(" ");

                String username = fields[0];
                Instant moment = Instant.parse(fields[1]);

                set.add(new User(username, moment));
                line = bufferedReader.readLine();
            }
            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
