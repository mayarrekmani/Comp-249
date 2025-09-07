package TutorialFileIO;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class FilingZ {
    static String input_file = "C:\\Users\\mayar\\Downloads\\lines.txt";
    static String output_file = "longest_word.txt";

    public static void main(String[] args) {
        ArrayList<String> longestWord = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(input_file))){
            String line ="";
            while ( (line= reader.readLine())!=null){
                String[] words = line.split(" ");
                String largest = "";
                for (String word : words){
                    if (word.length()>largest.length()){
                        largest = word;
                    }
                    longestWord.add(largest);
                }
            }
        }
        catch (FileNotFoundException e){

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(output_file))) {
            for (String line : longestWord){
                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
