import java.util.Scanner;

/*
 * Написать программу, которая просит пользователя 
 * ввести результат умножения двух чисел, 
 * сформированных случайным образом в диапазоне от 1 до 10.
 * Если пользователь допустит ошибку – 
 * необходимо его проинформировать и выдать правильный ответ
 */

public class Task10 {

	public static void main(String[] args) {
		int a = (int) (Math.random()*9 + 1);
		int b = (int) (Math.random()*9 + 1);
		System.out.print(a + " * " + b + "= ");
		Scanner sc = new Scanner(System.in);
		int ansver = sc.nextInt();
		if (ansver != a*b) {
			System.out.println("Ошибка, правильный ответ " + (a*b));
		}
		else {
			System.out.println("Все правильно");
		}

	}

}
