package lzf2;

public class student {
	public int a;

	public student(int i) {
		a = i;
	}

	protected void finalize()  {
		switch (a) {
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("����");
			break;
		default:
			System.out.println("����");
		}
	}
	public static void main(String args[]) {
		student name = new student(1);
		new student(3);
		System.gc();
	}
}

