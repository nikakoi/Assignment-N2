import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomNumbersToFile {
    //მინოდა თვითონ ჩაეგდო 10 შემთხვევითი რიცხვი ფაილში

    public  void randNumbers() {
        String file = "Numbers";
        int numCount = 10;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            Random random = new Random();
            for (int i = 0; i < numCount; i++) {
                int number = random.nextInt(100);
                writer.write(Integer.toString(number));
                writer.newLine();
            }


        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

    }
}
