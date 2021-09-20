package moe;

import java.io.BufferedReader;
import java.io.FileReader;

public class FindWord {

    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException(
                    "No args");
        }
        String wordToFind = args[0];
        String path = args[1];
        int count = 0;
        try {
            BufferedReader read = new BufferedReader(new FileReader(path));
            String line = read.readLine();
            while (line != null) {
                String[] lines = line.split("[ \n\t\r:;,.\"]");
                for (String s : lines) {
                    String word = s.toLowerCase();
                    if (word.equals(wordToFind)) {
                        count++;
                    }
                }
                line = read.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.printf("Occurrence of the word \"%s\": %d\n", wordToFind, count);
    }
}
