import java.io.*;
public class file_reader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\chintu\\Documents\\kaggle datasets\\online Retail Data Set.xlsx");
            System.out.println(fr);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e);     
        }
    }
}
