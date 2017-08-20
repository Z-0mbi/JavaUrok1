import java.util.Scanner;

/*
 * �������� ���������, ������� ���������� ��������� ������������ ����� �� ����� 
 * � ������� ������������ �����. ����������� ����� ��������
 *  ����� ������ � �������� � ����������.
 */
public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ����������� �����");
		
		if (sc.hasNextInt()) {
			
			int a = sc.nextInt();
			
			if (((a > 999) || (a < 100)) && ((a < -999) || (a > -100))) {
				
				System.out.println("�� ���������� �����");
			}
			else {
				
				a = Math.abs(a);
				int max = Math.max(a / 100, Math.max(a % 10, (a/10)%10));
				System.out.println("������������ ����� " + max);
			}
		}
		else {
			
			System.out.println("�� �����");
		}
		
		}

	}


