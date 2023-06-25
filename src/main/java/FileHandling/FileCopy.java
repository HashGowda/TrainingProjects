package FileHandling;

import java.io.*;

public class FileCopy {

    public static void main(String[] args) throws IOException {

        fileCopy();
    }

    public static void fileCopy(){
        File file = new File("C:\\Users\\HHRA1231\\Desktop\\Imp\\Notes\\Objectives.pdf");
        File outFile = new File("C:\\Users\\HHRA1231\\Desktop\\Imp\\Notes\\Objectives-Copy.pdf");

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(outFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(fileInputStream.available());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int i = 0;
        try {
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            if (fileInputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
