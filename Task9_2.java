/*
 * �������� ���������, ������� ��������� ����������� �� 
 * �������� ��������������� ����� �� �������  (-10,10) 
 * ��������� [-3,5].

 */
public class Task9_2 {

	public static void main(String[] args) {
		int a = (int) (Math.random()*20 - 10);
		if ((a >= -3) && (a <= 5)) {
			System.out.println("����� " + a + " ����������� ������� [-3,5]");
		}
		else {
			System.out.println("����� " + a + " �� ����������� ������� [-3,5]");
		}

	}

}