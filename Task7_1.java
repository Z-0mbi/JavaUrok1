/*
 * �������� ��������� ������ ����� ���� ��������� �����.
 * ������ ����� ����� ��������� �������� �� ��������� [0,10], 
 * ������ ����� ����� ��������� �������� �� ������� [25,35]

 */
public class Task7_1 {

	public static void main(String[] args) {
		int a = (int) (Math.random()*10);
		int b = (int) (Math.random()*10 + 25);
		System.out.println("a + b = " + (a + b));
	}

}
