package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateFile {

    public static void main(String[] args) {
        String path = "C:\\Users\\HHRA1231\\Desktop\\Imp\\Notes\\sample.text";

        //1.Using file:
        File file = new File(path);

        try {
            boolean flag = file.createNewFile();
            if (flag) {
                System.out.println("File is created");
            } else {
                System.out.println("File is already present");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //2.FileOutputStream along with Scanner:
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the file name with location path: ");
            String fileName = sc.nextLine();

            FileOutputStream fos = new FileOutputStream(fileName, true);
            System.out.println("Enter the file content: ");
            String content = sc.nextLine();
            byte b[]= content.getBytes();

            fos.write(b);
            fos.close();
            System.out.println("File is saved on the given location path");

        } catch (Exception e){
            System.out.println("Some exception is coming");
            e.printStackTrace();
        }

        //3. Java nio package
        try {
            Path pathLocation = Paths.get("C:\\Users\\HHRA1231\\Desktop\\Imp\\Notes\\sample2.text");
            Path newPath = Files.createFile(pathLocation);
            System.out.println("new file is created at : "+newPath);
        } catch (Exception e){
            System.out.println("Some exception is coming");
            e.printStackTrace();
        }
    }
}
