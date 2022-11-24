/* напишите метод, который составит строку, состоящую из 100 повторений слова TEST 
   и метод, который запишет эту строку в простой текстовый файл */

import java.io.FileWriter;
import java.io.IOException;

public class Task2_2 {

    private static String generateString(String string) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            builder.append(string);
            if (i % 10 == 0) {
                builder.append('\n');
            }
        }
        return builder.toString();
    }

    private static void writeFileSimple(String content) {
        try (FileWriter writer = new FileWriter("TEST.txt", false)) {
            writer.write(content);
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } 
    }
    public static void main(String[] args) {
        String newText = generateString("TEST ");
        writeFileSimple(newText);
    }
}
