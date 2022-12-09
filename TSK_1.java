import java.util.Scanner;
public class TSK_1
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
    public static void main(String[] args)
    {   
        int N = CheckNumbers("Введите число N");
        int sum = 0, mult = 1;
        for (int i = 1; i <= N; i++)
        {
            sum = sum + i;
            mult = mult*i;
        }
        System.out.printf("Сумма чисел от 1 до %d равна %d. \n", N, sum);
        System.out.printf("Произведение чисел от 1 до %d равно %d.", N, mult);
    }
}
