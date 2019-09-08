import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long currN = n;
        int number = 0;

        while (currN >= 0)
        {
            currN -= number;
            number++;
        }

        long currSum = (number / 2) * (number - 1);

        if (number % 2 == 1)
            currSum = ((0 + number) / 2) * number;

        long notInSum = currSum - n;

        int k = 0;
        if (notInSum == 0)
            k = number - 1;
        else
            k = number - 2;

        System.out.println(k);
        for (int i = 1; i < number; i++)
            if (i != notInSum)
                System.out.print(i + " ");
    }
}
