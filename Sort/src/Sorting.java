import java.util.ArrayList;

public class Sorting {

	ArrayList<Integer> bubleSort(ArrayList<Integer> m) {

		int k = 0;
		boolean b = true;

		for (; b;) {
			b = false;
			for (int j = 1; j < m.size(); j++) {
				if (m.get(j - 1) > m.get(j)) {
					k = m.get(j);
					m.set(j, m.get(j - 1));
					m.set(j - 1, k);
					b = true;

				}

			}

		}

		return m;

	}

	ArrayList<Integer> choiceSort(ArrayList<Integer> m) {

		int k = m.get(0);
		int c = 0;

		for (int t = 0; t < m.size(); t++) {
			for (int i = t; i < m.size(); i++) {
				if (k > m.get(i)) {
					k = m.get(i);
					c = i;
				}
			}

			m.remove(c);
			m.add(t, k);
			k = 2147483647;
		}

		return m;

	}

	ArrayList<Integer> pasteSort(ArrayList<Integer> m) {

		int k = 0;

		for (int i = 0; i < m.size() - 1; i++) {

			while (m.get(i) > m.get(i + 1)) {
				k = m.get(i + 1);
				m.set(i + 1, m.get(i));
				m.set(i, k);
				if (i != 0) {
					i--;
				}
			}

		}

		return m;
	}


}
