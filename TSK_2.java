import java.util.Scanner;
public class TSK_2
{
    static int CheckNumbers(String param)
    {
        Scanner iScanner = new Scanner(System.in);
        while (true)
        {
            System.out.printf(param + ": ");
            if (iScanner.hasNextInt() == true)
            {
                int number = iScanner.nextInt();
                if (number > 0)
                {
                    iScanner.close();
                    return number;
                }
                else System.out.println("Число введено неправильно.");
            }
            else System.out.println("Число введено неправильно.");
            iScanner.next();
        }
    }

    static void PrimeFactor(int number)
    {
        for (int i = 2; i <= number; i++)
        {
            boolean check = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    check = false;
                    break;
                }     
            }
            if (check == true) System.out.print(i + " ");
        }
    }
    public static void main(String[] args)
    {
        int number = CheckNumbers("Введите любое натуральное число");
if (number == 1) System.out.println("У числа 1 нет простых множителей.");
else
{
    System.out.println("Список простых чисел до этого числа:");
    PrimeFactor(number);
}

    
    
    }
} 