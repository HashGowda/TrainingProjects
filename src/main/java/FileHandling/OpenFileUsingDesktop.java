package FileHandling;

import java.awt.*;
import java.io.File;

public class OpenFileUsingDesktop {

    public static void main(String[] args) {
        String path = "C:\\Users\\HHRA1231\\Desktop\\Imp\\Notes\\sample1.text";

        try {
            File file = new File(path);

            if (!Desktop.isDesktopSupported()){
                System.out.println("Desktop not supported");
                return;
            }

            Desktop desktop = Desktop.getDesktop();
            if (file.exists()){
                desktop.open(file);
            }
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }
}
