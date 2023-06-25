package FileHandling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class ReadFileUsingNIO {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\HHRA1231\\Desktop\\Imp\\Notes\\sample1.text";

        try {
            List<String> li = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
            Iterator<String> it = li.listIterator();

            while (it.hasNext()){
                System.out.println(it.next());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
