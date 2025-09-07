package Assignment5;

import java.io.*;

public class DriverByPo {
    static String fileName = "po.txt";
    public static void main(String[] args) throws IOException {
        File file = new File(fileName);
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        printWriter.println("50");
        printWriter.close();
    }
}
