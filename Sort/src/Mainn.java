
import java.util.Date;

public class Mainn {

	public static void main(String[] args) {

		ListData list = new ListData(8, 10);
		Sorting sort = new Sorting();

		System.out.println("Исходный список:" + list.getList());
		System.out.println();

		long t1 = new Date().getTime();

		System.out.println("Пузырькова сортировка:" + sort.bubleSort(list.getList()));
		long t2 = new Date().getTime();

		System.out.println("Затраченное время:" + ((t2 - t1)) + " ms");
		System.out.println();

		t1 = new Date().getTime();

		System.out.println("Сортировка выбором:" + sort.choiceSort(list.getList()));
		t2 = new Date().getTime();

		System.out.println("Затраченное время:" + ((t2 - t1)) + " ms");
		System.out.println();

		t1 = new Date().getTime();

		System.out.println("Сортировка вставкой:" + sort.pasteSort(list.getList()));
		t2 = new Date().getTime();

		System.out.println("Затраченное время:" + ((t2 - t1)) + " ms");
		System.out.println();



	}

}