/*
   Дано трехзначное число. Найти число десятков,
   число единиц и произведение цифр

 */
public class Task2_3 {

	public static void main(String[] args) {
		int x = 999;
		// 
		int a = (x / 10);
		int b = (x % 10);
		int c = ( x / 100) * ((x / 10) - ( x / 100) * 10) * ( x % 10);
        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
	}

}
