import java.util.Scanner;

public class Regex {

	// ��֤������ֻ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ֻ��ţ�");
		String mobile = sc.nextLine();
		System.out.println("�ֻ��ţ�" + checkMobile(mobile));
	}

	public static boolean checkMobile(String mobile) {
		// String regex= "[135][0-9]{10,}";
		// boolean flag = mobile.matches(regex);
		// return flag;

		// д����
		return mobile.matches("[135][0-9]{10,}");
	}
	

}
