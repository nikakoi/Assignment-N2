import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        RandomNumbersToFile randomNumbersToFile = new RandomNumbersToFile();
        randomNumbersToFile.randNumbers();


        try {
            int[] x = MyArray.reader("Numbers");
            int sum = MyArray.sumArray(x);
            System.out.println("Sum of array: " + sum);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }



}