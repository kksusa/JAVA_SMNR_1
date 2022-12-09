import java.util.Scanner;
public class TSK_3
{
    static float CheckNumbers(String param)
    {
        Scanner iScanner = new Scanner(System.in);
        while (true)
        {
            System.out.printf(param + ": ");
            if (iScanner.hasNextFloat() == true)
            {
                float number = iScanner.nextFloat();
                return number;
            }
            else System.out.println("Число введено неправильно.");
            iScanner.next();
        }
    } 
    static void Result(float param1, float param2)
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите оператор из списка:\n"
        + "+: сложение;\n"
        + "-: вычитание;\n"
        + "*: умножение;\n"
        + "/: деление.");
        while (true)
        {
            String operand = iScanner.nextLine();
            if (operand.equals("+"))
            {
                System.out.printf(param1 + " + " + param2 + " = " + (param1 + param2));
                break;
            }
            else if (operand.equals("-"))
            {
                System.out.println(param1 + " - " + param2 + " = " + (param1 - param2));
                break;
            }
            else if (operand.equals("*"))
            {
                System.out.printf(param1 + " * " + param2 + " = " + (param1 * param2));
                break;
            }
            else if (operand.equals("/"))
            {
                if (param2 == 0)
                {
                    System.out.println("Деление на 0 невозможно.");
                    break;
                }
                else
                {
                    System.out.println(param1 + " / " + param2 + " = " + (param1 / param2));
                    break;
                }
            }
            else System.out.println("Оператор введен неправильно.");
        }
    }
    public static void main(String[] args)
    {
        Result(CheckNumbers("Введите первое число"), CheckNumbers("Введите второе число"));
    }
}