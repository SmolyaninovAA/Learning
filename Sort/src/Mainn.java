
import java.util.Date;

public class Mainn {

	public static void main(String[] args) {

		ListData list = new ListData(8, 10);
		Sorting sort = new Sorting();

		System.out.println("�������� ������:" + list.getList());
		System.out.println();

		long t1 = new Date().getTime();

		System.out.println("���������� ����������:" + sort.bubleSort(list.getList()));
		long t2 = new Date().getTime();

		System.out.println("����������� �����:" + ((t2 - t1)) + " ms");
		System.out.println();

		t1 = new Date().getTime();

		System.out.println("���������� �������:" + sort.choiceSort(list.getList()));
		t2 = new Date().getTime();

		System.out.println("����������� �����:" + ((t2 - t1)) + " ms");
		System.out.println();

		t1 = new Date().getTime();

		System.out.println("���������� ��������:" + sort.pasteSort(list.getList()));
		t2 = new Date().getTime();

		System.out.println("����������� �����:" + ((t2 - t1)) + " ms");
		System.out.println();



	}

}