import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count=0;
        while (1>0)
        {
           System.out.println();
           System.out.println("Please enter valid file path:");
           String path = new Scanner (System.in) .nextLine();

           File file = new File(path);
           boolean isDirectory = file.isDirectory();

           if (isDirectory)
           {System.out.println("The path entered is not for a file, but for a directory, please re-check and provide correct input");continue;}

           boolean fileExists = file.exists();
           if (!fileExists)
           {System.out.println("There's no such file, please re-check and provide correct input");continue;}
           else
           {
               count++;
               System.out.println("File path provided is valid");
               System.out.println("This is file #"+count);
           }

        }

    }
}
