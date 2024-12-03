package secao18.map.fixacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<String, Integer> votes = new LinkedHashMap<>();
        String path = "C:\\temp\\generics\\map.txt";
        int sum = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String candidate = fields[0];
                int quatityVotes = Integer.parseInt(fields[1]);

                if (votes.containsKey(candidate)) {
                    int votesSoFar = votes.get(candidate);
                    votes.put(candidate, quatityVotes + votesSoFar);
                } else {
                    votes.put(candidate, quatityVotes);
                }
                line = bufferedReader.readLine();
            }

            for (String candidate : votes.keySet()) {
                System.out.println(candidate + ": " + votes.get(candidate));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
