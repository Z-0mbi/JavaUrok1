import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gibdd
{
    public static void main(String[] args) throws IOException
    {
        //Параметры программы
        Integer maxAccessSpeed = 80; // km/h максимально допустимая скорость
        Integer speedGrade = 20; // km/h граница скорости, т.е. каждые 20 км штраф увеличивается на fineGrade
        Integer fineGrade = 500; // RUB минимальный штраф
        Integer dangerSpeed = 180; // km/h критическая скорость
        int daysAfter = 1;

        //=============================================================

        System.out.println("Введите скорость автомобиля:");

        //Скорость автомобиля
        Integer oncomingSpeed = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        if(oncomingSpeed >= dangerSpeed)
        {
            System.out.println("Немедленно остановитесь!");
        }
        else if(oncomingSpeed > maxAccessSpeed)
        {
            Integer overSpeed = oncomingSpeed - maxAccessSpeed;
            Integer gradesCount = overSpeed / speedGrade + 1; //коэффициент штрафа
            Integer fine = fineGrade * gradesCount;
            if (daysAfter >= 30) {
                System.out.println("Сумма штрафа: " + fine);
            }
            else {
            	System.out.println("Сумма штрафа: " + fine/2);
            }
        }
        else {
            System.out.println("Скорость не превышена");
        }
    }
}