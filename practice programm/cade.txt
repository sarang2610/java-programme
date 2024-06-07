
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class P8 {

    public static void main(String[] args) {
        String filename = "P8.java";
        String newfilename = "cade.txt";
        try {
            File file = new File(filename);
            File newfile = new File(newfilename);
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(newfile);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
            fis.close();
            fos.close();
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}