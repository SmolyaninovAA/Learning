
public class Tranlater {

	public String getSplavString(int splav) {

		switch (splav) {
		case 0:
			return "������";
		case 1:
			return "������. �����";
		case 2:
			return "��������. �����";
		case 3:
			return "��������";
		case 4:
			return "������ � ���. Cr";
		case 5:
			return "������ � ���. Al";
		}
		return null;
	}

	public String getVidLityaString(int vidLitya) {

		switch (vidLitya) {
		case 0:
			return "� �������� �����";
		case 1:
			return "� ����������� �����";
		case 2:
			return "� ������";
		case 3:
			return "���";
		case 4:
			return "��� ���������";
		case 5:
			return "����������";
		}
		return null;
	}

	public String getRazmGroupString(int razmGroup) {
		switch (razmGroup) {
		case 0:
			return "�� 0,25";
		case 1:
			return "�� 0,25 �� 0,63";
		case 2:
			return "�� 0,63 �� 1,60";
		case 3:
			return "�� 1,60 �� 4,00";
		case 4:
			return "�� 4,00 �� 10,00";
		case 5:
			return "�� 10,00 �� 25,00";
		case 6:
			return "�� 25,00 �� 63,00";
		case 7:
			return "�� 63,00 �� 160,00";
		case 8:
			return "�� 160,00";
		}
		return null;

	}

}
