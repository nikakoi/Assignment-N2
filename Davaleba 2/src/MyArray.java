import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MyArray {

    int[] arr;

    public MyArray(int[] arr) {
        this.arr = arr;
    }


    public static int[] reader(String filename) throws IOException, InvalidNumberException {
        int[] arr = new int[10];                                                                  //10 ელემენტიანი მასივი გავაკეთე
        BufferedReader read = new BufferedReader(new FileReader(filename));                       // ამით მივწვდი ფაილს
        String line;                                                                   // String ტიპის ცვლადი მინდოდა რადგან ფაილიდან ამოკითხული რიცხვები შეენახა
        int i = 0;
        while ((line = read.readLine()) != null && i < 10) {
            try {
                int num = Integer.parseInt(line);                                           //ფაილიდან ამოკითხული რიცხვები გარდავქმენი Integer-ად
                if (num < 0) {
                    throw new InvalidNumberException("Negative number: " + num);
                }
                arr[i] = num;
                i++;

            } catch (NumberFormatException e) {
                throw new InvalidNumberException("Invalid number format: " + line);
            }

        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println("Array: " + arr[j]);
        }                              //მასივის ყველა ელემენტი რომ გამოეტანა

        read.close();
        return arr;


    }

    public static int sumArray(int[] arr) throws ArithmeticException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                sum += arr[i];
            } catch (ArithmeticException e) {
                throw new ArithmeticException(e.getMessage());
            }
        } //მასივის ელემენტების ჯამიც დავთვალე
        return sum;
    }


}
