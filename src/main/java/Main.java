import java.io.*;

import java.nio.file.Files;
import java.util.Scanner;
public class Main {

    String fizzbuzz(String s) {
        int i = 0;
        try {
             i = Integer.parseInt(s);
        } catch (Exception e){
            System.out.println("Incorrect value");
            return "Incorrect value";

        }
        if (i == 0) {
            s = "0";
        } else {
            if (i % 3 == 0) {
                s = "Fizz";
            } else if (i % 5 == 0) {
                s = "Buzz";
            }
            if (i % 15 == 0) {
                s = "FizzBuzz";
            }
        }
            return s;

    }
         boolean verify(String path){
         boolean isTxt=false;
             try {
                 if (path.lastIndexOf(".") != -1
                         && path.lastIndexOf(".") != 0
                         && new File(path).isFile()
                         && path.isEmpty() == false) {

                     isTxt = path.substring(path.lastIndexOf(".") + 1).equals("txt");
                 }


                 return (isTxt);
             } catch (NullPointerException e) {
                 return false;
             }
         }


         String fileread(String path){
                 try {
                     File file = new File(path);
                 Main m = new Main();
                 FileReader freader = new FileReader(file);
                 BufferedReader reader = new BufferedReader(freader);
                 String line = null;

                 line = reader.readLine();


                 while (line != null) {
                     System.out.println(m.fizzbuzz(line));

                     line = reader.readLine();
                 }
             } catch (FileNotFoundException e) {
                 System.out.println("File not found");

                 return "File not found";

             } catch (IOException e) {
                 System.out.println("I/O error");

                 return "io error";

             } catch (NullPointerException e) {
                 System.out.println("NullPointer error");

                 return "np error";

             }
       return "ok";
         }

    public static void main (String[] args)  {
        Main m = new Main();
        System.out.println("Need path to file");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        if (m.verify(path)) {
            m.fileread(path);
        } else {
            System.out.println(path +" is not .txt file or not file");
        }
    }
}
