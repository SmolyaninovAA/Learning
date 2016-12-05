
import java.text.DecimalFormat;

public class Main {

	private static double mShihty;
	private static double massOfPoter;
	private static double normOfRashod;
	private static double newMetall;
	private static double vozvrat;

	private static MainWindow window;
	private static Tranlater translate;
	private static Data data;

	public static void main(String[] args) {
		window = new MainWindow("Расчет шихты по ОСТ 1.42141-82");
		translate = new Tranlater();
		data = new Data();
	}

	public static void setData() {
		// установка параметров
		System.out.println("Новый рассчет");

		data.setmDet(window.getmDet());

		System.out.println("Размерная группа детали: " + translate.getRazmGroupString(data.getRazmGroup()) + " ("
				+ data.getRazmGroup() + ")");
		System.out.println("М детали: " + data.getmDet());
		data.setDupleks(window.getdupleks());

		String s;
		if (data.getDupleks() == 1) {
			s = "двойной";
		} else {
			s = "одинарный";
		}
		System.out.println("Переплав: " + s);
		data.setVidLitya(window.getVidLitya());
		data.setSplav(window.getSplav());

		data.setmOtl(window.getmOtl()); // по умолчанию от м дет
		System.out.println("М отливки: " + data.getmOtl());
		System.out.println("Размерная группа отливки: " + translate.getRazmGroupString(data.getRazmGroup()) + " ("
				+ data.getRazmGroup() + ")");
		data.setmOtlSLps(window.getmOtlSLps()); // по учмолчанию от м отл

		data.setkIzb();
		data.setB_v_potery();
		data.setOthods();

		data.setPercentOfbrak(window.getPercentOfBrak());
		data.setPercentOfNewMetall(window.getpercentOfNewMetall());
		data.setmObrazcov(window.getmObr());

		System.out.println("М отливки с лпс: " + data.getmOtlSLps());
		System.out.println("Размерная группа в конце установки: " + translate.getRazmGroupString(data.getRazmGroup()) + " ("
				+ data.getRazmGroup() + ")");

		System.out.println("Сплав: " + translate.getSplavString(data.getSplav()) + " (" + data.getSplav() + ")");
		System.out
				.println("Вид литья: " + translate.getVidLityaString(data.getVidLitya()) + " (" + data.getVidLitya() + ")");

		System.out.println("% брака: " + data.getPercentOfbrak());
		System.out.println("% св. металла: " + data.getPercentOfNewMetall());
		System.out.println("М образцов: " + data.getmObrazcov());

		System.out.println();

		System.out.println("К изб: " + data.getkIzb());
		System.out.println("Б.В. Потери: " + data.getB_v_potery());
		System.out.println("Отходы: " + data.getOthods());

		System.out.println();

	}

	public static void processing() {
		
		//выполнение расчетов
		mShihty = ((data.getmOtlSLps() + data.getmObrazcov()) * data.getkIzb()) / (1 - (data.getPercentOfbrak() / 100));
		massOfPoter = mShihty * (data.getB_v_potery() + data.getOthods()) / 100;
		normOfRashod = data.getmOtl() + massOfPoter;
		newMetall = mShihty * data.getPercentOfNewMetall() / 100;
		vozvrat = newMetall - normOfRashod;

		System.out.println("Вес шихты: " + mShihty);

		System.out.println("Масса безв потерь: " + massOfPoter);

		System.out.println("Норма расхода " + normOfRashod);

		System.out.println("свежего металла " + newMetall);

		System.out.println("Возврат " + vozvrat);
		System.out.println();
	}

	public static void getData() {
		
		//вывод данных
		
		window.setmDetA(Formatter(data.getmDet()));
		window.setmOtlA(Formatter(data.getmOtl()));
		window.setmOtlSLpsA(Formatter(data.getmOtlSLps()));

		window.setmShihtiA(Formatter((mShihty)));
		window.setmPoterA(Formatter((massOfPoter)));
		window.setNormOfRashod(Formatter((normOfRashod)));
		window.setmOfNewMetall(Formatter((newMetall)));
		window.setkVoVozvr(Formatter((vozvrat)));

	}

	public static String Formatter(double d) {
		String formattedDouble = new DecimalFormat("#0.000").format(d);

		return formattedDouble;
	}

}
