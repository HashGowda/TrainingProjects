package FileHandling;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageHandling {

    public static void main(String[] args) {

        // .jpg ----> .png/.bmp/.gif

        try {

            //using URL
//            URL url = new URL("https://i.ebayimg.com/images/g/nAIAAOSwsBtaDeZL/s-l500.jpg");
//            BufferedImage img = ImageIO.read(url);

            //Using file
            File file = new File("C:\\Users\\HHRA1231\\Desktop\\Imp\\Notes\\Watch.jpg");
            BufferedImage img = ImageIO.read(file);

            ImageIO.write(img,"jpg", new File("C:\\Users\\HHRA1231\\IdeaProjects\\Practice\\Practice\\Images\\watch.jpg"));
            ImageIO.write(img,"png", new File("C:\\Users\\HHRA1231\\IdeaProjects\\Practice\\Practice\\Images\\watch.png"));
            ImageIO.write(img,"gif", new File("C:\\Users\\HHRA1231\\IdeaProjects\\Practice\\Practice\\Images\\watch.gif"));
            ImageIO.write(img,"bmp", new File("C:\\Users\\HHRA1231\\IdeaProjects\\Practice\\Practice\\Images\\watch.bmp"));

            System.out.println("Done...");
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
