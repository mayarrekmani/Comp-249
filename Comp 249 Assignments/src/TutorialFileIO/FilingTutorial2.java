package TutorialFileIO;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FilingTutorial2 {
    static String output_file ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give file ");
        String file = scanner.nextLine();
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();
        File file1 = null;
        while (true) {
            file1 = new File(file);
            if (!file1.exists()){
                break;
            }
            file= scanner.nextLine();
        }
        while (true){
            System.out.print("Give student name ");
            String line = scanner.nextLine();
            studentNames.add(line);
            if (line.equalsIgnoreCase("done")){
                break;
            }
            System.out.print("Give grade: ");
            int grade = scanner.nextInt();
            grades.add(grade);
            scanner.nextLine();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file1))){
            for (int i = 0; i < studentNames.size(); i++) {
                String name = studentNames.get(i);
                if (name.equalsIgnoreCase("done"))
                    break;
                int grade = grades.get(i);
                writer.write(name + " - Grade: " + grade);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
