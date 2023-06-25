package FileHandling;


import java.io.File;
import java.util.Arrays;

public class PrintFileNames {

    public static void main(String[] args) {
        fileNames();
    }

    public static void fileNames() {
        String path = "C:\\Users\\HHRA1231\\Desktop\\Imp\\Notes";
        File file = new File(path);
        File[] notes = file.listFiles();
        Arrays.sort(notes);


        for (File e : notes) {
            if (e.isFile()) {
                System.out.println("File : " + e.getName() + " " + e.getAbsolutePath());
            } else if (e.isDirectory()) {
                System.out.println("Directory : " + e.getName() + " " + e.getAbsolutePath());
            } else {
                System.out.println("Not known : " + e.getName() + " " + e.getAbsolutePath());
            }
        }
    }

}
