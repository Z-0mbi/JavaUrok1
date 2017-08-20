/*
 * Поменяйте местами значения двух переменных,
 * не используя дополнительных переменных*.
 */
public class Task1_4 {

	public static void main(String[] args) {
		int x = 8, y = 4;
		y = y - x;
		x = x + y;
		y = x - y;
		System.out.println("x = " + x + "\ny = " + y);

	}

}
