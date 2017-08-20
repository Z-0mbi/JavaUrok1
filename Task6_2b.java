/*
 * Подсчитать значения следующих функций
 */
public class Task6_2b {

	public static void main(String[] args) {
		int x = 1000;
		int a = 600 + x;
		double b = Math.sqrt(1200 * 1200 + Math.pow(600 + x, 2));
		int c = 1500 - x;
		double d = Math.sqrt(900 * 900 + Math.pow(1500 - x, 2));
        double S = (a/b + c/d);
        
        System.out.printf("%.2f", S);
	}

}
