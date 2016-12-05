
public class Tranlater {

	public String getSplavString(int splav) {

		switch (splav) {
		case 0:
			return "Чугуны";
		case 1:
			return "Констр. стали";
		case 2:
			return "Жаропроч. стали";
		case 3:
			return "Алюминий";
		case 4:
			return "Магний с сод. Cr";
		case 5:
			return "Магний с сод. Al";
		}
		return null;
	}

	public String getVidLityaString(int vidLitya) {

		switch (vidLitya) {
		case 0:
			return "В песчаные формы";
		case 1:
			return "В оболочковые формы";
		case 2:
			return "В кокиль";
		case 3:
			return "ЛВМ";
		case 4:
			return "Под давлением";
		case 5:
			return "Выжиманием";
		}
		return null;
	}

	public String getRazmGroupString(int razmGroup) {
		switch (razmGroup) {
		case 0:
			return "До 0,25";
		case 1:
			return "От 0,25 до 0,63";
		case 2:
			return "От 0,63 до 1,60";
		case 3:
			return "От 1,60 до 4,00";
		case 4:
			return "От 4,00 до 10,00";
		case 5:
			return "От 10,00 до 25,00";
		case 6:
			return "От 25,00 до 63,00";
		case 7:
			return "От 63,00 до 160,00";
		case 8:
			return "От 160,00";
		}
		return null;

	}

}
