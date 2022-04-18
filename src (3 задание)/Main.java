import java.io.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        try {

            int countWords = 0;
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
            String words;


            while ((words = reader.readLine()) != null) {
                if (words.isEmpty()) {
                    continue;
                }
                String[] w = words.split("[,\\s]+");
                countWords = w.length;
            }
            FileWriter out =new FileWriter("text2.txt");
            BufferedWriter br = new BufferedWriter(out);
            PrintWriter pw = new PrintWriter(br);
            pw.println("text.txt слов: " + countWords);
            pw.close();

            System.out.println("TESTTTT" + countWords);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

