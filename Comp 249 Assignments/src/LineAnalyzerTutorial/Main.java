package LineAnalyzerTutorial;


import java.io.*;
import java.util.ArrayList;

public class Main {
    static String input_file = "C:\\Users\\mayar\\Downloads\\lines.txt";
    static String output_file = "longest_word.txt";
    public static void main(String[] args) throws FileNotFoundException , IOException{
        ArrayList<String> largestThing = new ArrayList<>();

       try(BufferedReader bufferedReader =  new BufferedReader(new FileReader(input_file))){
         String line = "";
         line = bufferedReader.readLine();
         while ((line= bufferedReader.readLine())!=null){
             String[] words = line.split(" ");
             String largest = "";
             for (String word : words){
                 if (word.length()>largest.length()){
                     largest = word;
                 }
                 largestThing.add(largest);
             }
       }

       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       for (String largestWord : largestThing){
           System.out.println(largestWord);
       }
       try(           BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(output_file)))
       {
           int i = 1;
           for (String largestWord : largestThing) {
               String line = "Line "+ i+" "+largestWord;
               bufferedWriter.write(line);
               bufferedWriter.newLine();
               i++;
           }

       }
       catch (IOException e) {
           throw new RuntimeException(e);
       }

    }
}
