package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileUsingScanner {
    public static void main(String[] args) {
        String path = "C:\\Users\\HHRA1231\\Desktop\\Imp\\Notes\\sample1.text";
        Scanner sc = null;
        try {
            File file = new File(path);
            sc = new Scanner(file);
            System.out.println("File content is: ");

            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            sc.close();
        }
    }
}
