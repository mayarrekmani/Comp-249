package Assignment5;

import java.awt.*;
import java.io.*;

import java.util.Scanner;

public class InputFileReading {
    static String output_file_passing = "passing.txt";
    static String output_file_failing = "failing.txt";
    static String output_file_numbered = "numbered_students.txt";
    static String output_file_log = "log.txt";
    static int passingGrade = 60;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path to the file: ");
        //                C:\Users\mayar\School\Comp 249\Comp 249 Assignments\src\Assignment5\students.txt
        String fileName = scanner.next();
        File file = new File(fileName);
        if(!file.exists() || !file.canRead()){
            System.out.println("File not found");
            return;
        }
        try {
            Scanner fileScanner = new Scanner(file);
            PrintWriter printWriterPassing = new PrintWriter(output_file_passing);
            PrintWriter printWriterFailing = new PrintWriter(output_file_failing);
            printWriterFailing.println("---Failing Students---");
            printWriterPassing.println("---Passing Students---");
            int numberOfPassing = 0;
            int numberOfFailing = 0;
            int totalStudents= 0;
            if(!file.exists() || !file.canRead()){
                System.out.println("File not found");
                return;
            }

            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] studentVariables = line.split(" ");

                if (Double.parseDouble(studentVariables[2])<passingGrade){
                    printWriterFailing.println("Student "+studentVariables[0]+"(ID: "+studentVariables[1]+") - Grade: "+studentVariables[2]);
                    numberOfFailing++;
                }
                else {
                    printWriterPassing.println("Student "+studentVariables[0]+"(ID: "+studentVariables[1]+") - Grade: "+studentVariables[2]);
                    numberOfPassing++;
                }
                totalStudents++;
            }

            PrintWriter appendWriter = new PrintWriter(new FileOutputStream(output_file_log, true));
            appendWriter.println("Processed students.txt: "+totalStudents+" ("+numberOfPassing+" passing,"+" "+numberOfFailing+" failing)");
            fileScanner.close();
            printWriterFailing.close();
            printWriterPassing.close();
            appendWriter.close();
//            Desktop.getDesktop().open(new File(output_file_passing));
//            Desktop.getDesktop().open(new File(output_file_failing));
//            Desktop.getDesktop().open(new File(output_file_log));
        }
        catch (FileNotFoundException e) {
            System.out.println("Error");
        }
        catch (IOException e){
            System.out.println();
            e.printStackTrace();

        }
        try(BufferedReader bufferedReader =  new BufferedReader(new FileReader(file))) {
            String line = "";
            int i = 0;
            PrintWriter printWriterNumbered = new PrintWriter(output_file_numbered);
            while ((line=bufferedReader.readLine())!=null){
                i++;
                printWriterNumbered.println(i+":"+" "+line);
            }
            printWriterNumbered.close();
//            Desktop.getDesktop().open(new File(output_file_numbered));
        } catch (FileNotFoundException e) {
            System.out.println("error");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
