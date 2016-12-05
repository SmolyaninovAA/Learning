import java.util.ArrayList;
import java.util.Random;

class ListData {

	private ArrayList<Integer> list;

	ListData(int n , int r) {

		list = new ArrayList<Integer>();
		Random random = new Random();

		for (int i = n; i > 0; i--) {
			list.add(random.nextInt(r));
		} 

	}

	public ArrayList<Integer> getList() {
		ArrayList<Integer> m = new ArrayList<Integer>(list);
		return m;
	}

}
