import java.util.Scanner;

/*
 * �������� ���������, ������� ������ ������������ 
 * ������ ��������� ��������� ���� �����, 
 * �������������� ��������� ������� � ��������� �� 1 �� 10.
 * ���� ������������ �������� ������ � 
 * ���������� ��� ���������������� � ������ ���������� �����
 */

public class Task10 {

	public static void main(String[] args) {
		int a = (int) (Math.random()*9 + 1);
		int b = (int) (Math.random()*9 + 1);
		System.out.print(a + " * " + b + "= ");
		Scanner sc = new Scanner(System.in);
		int ansver = sc.nextInt();
		if (ansver != a*b) {
			System.out.println("������, ���������� ����� " + (a*b));
		}
		else {
			System.out.println("��� ���������");
		}

	}

}
