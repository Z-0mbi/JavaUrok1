import java.util.Scanner;

/*
 * Написать программу, которая производит разбиение трехзначного числа на цифры 
 * и находит максимальную цифру. Трехзначное число является
 *  целым числом и вводится с клавиатуры.
 */
public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите трехзначное число");
		
		if (sc.hasNextInt()) {
			
			int a = sc.nextInt();
			
			if (((a > 999) || (a < 100)) && ((a < -999) || (a > -100))) {
				
				System.out.println("Не корректное число");
			}
			else {
				
				a = Math.abs(a);
				int max = Math.max(a / 100, Math.max(a % 10, (a/10)%10));
				System.out.println("Максимальная цифра " + max);
			}
		}
		else {
			
			System.out.println("Не число");
		}
		
		}

	}


