/*
    ��һ������ �ӳ��������������ÿ���¶���һ������ С���ӳ����������º�ÿ��������һ������ �������Ӷ����� ��ÿ���µ����Ӷ���Ϊ����

    ���� ���ӵĹ���Ϊ���� 1, 1, 2, 3, 5, 8 ....
    ʹ�õݹ鴦��

    ���� CMD������GBK���� ��CMD����ʱע���������
        ����GBK�Ĳ���ӳ���ַ�
        ������� ���±��� ʹ��ANST���±����ļ�
*/
import java.util.Scanner;

public class ProgDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������·�");
		int in = sc.nextInt();

		System.out.println("��" + in + "��������������" + fun(in) + "��");
	}

	// ʹ�õݹ鴦��������
	private static int fun(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fun(n - 1) + fun(n - 2);
	}
}