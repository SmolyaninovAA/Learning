
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
		window = new MainWindow("������ ����� �� ��� 1.42141-82");
		translate = new Tranlater();
		data = new Data();
	}

	public static void setData() {
		// ��������� ����������
		System.out.println("����� �������");

		data.setmDet(window.getmDet());

		System.out.println("��������� ������ ������: " + translate.getRazmGroupString(data.getRazmGroup()) + " ("
				+ data.getRazmGroup() + ")");
		System.out.println("� ������: " + data.getmDet());
		data.setDupleks(window.getdupleks());

		String s;
		if (data.getDupleks() == 1) {
			s = "�������";
		} else {
			s = "���������";
		}
		System.out.println("��������: " + s);
		data.setVidLitya(window.getVidLitya());
		data.setSplav(window.getSplav());

		data.setmOtl(window.getmOtl()); // �� ��������� �� � ���
		System.out.println("� �������: " + data.getmOtl());
		System.out.println("��������� ������ �������: " + translate.getRazmGroupString(data.getRazmGroup()) + " ("
				+ data.getRazmGroup() + ")");
		data.setmOtlSLps(window.getmOtlSLps()); // �� ���������� �� � ���

		data.setkIzb();
		data.setB_v_potery();
		data.setOthods();

		data.setPercentOfbrak(window.getPercentOfBrak());
		data.setPercentOfNewMetall(window.getpercentOfNewMetall());
		data.setmObrazcov(window.getmObr());

		System.out.println("� ������� � ���: " + data.getmOtlSLps());
		System.out.println("��������� ������ � ����� ���������: " + translate.getRazmGroupString(data.getRazmGroup()) + " ("
				+ data.getRazmGroup() + ")");

		System.out.println("�����: " + translate.getSplavString(data.getSplav()) + " (" + data.getSplav() + ")");
		System.out
				.println("��� �����: " + translate.getVidLityaString(data.getVidLitya()) + " (" + data.getVidLitya() + ")");

		System.out.println("% �����: " + data.getPercentOfbrak());
		System.out.println("% ��. �������: " + data.getPercentOfNewMetall());
		System.out.println("� ��������: " + data.getmObrazcov());

		System.out.println();

		System.out.println("� ���: " + data.getkIzb());
		System.out.println("�.�. ������: " + data.getB_v_potery());
		System.out.println("������: " + data.getOthods());

		System.out.println();

	}

	public static void processing() {
		
		//���������� ��������
		mShihty = ((data.getmOtlSLps() + data.getmObrazcov()) * data.getkIzb()) / (1 - (data.getPercentOfbrak() / 100));
		massOfPoter = mShihty * (data.getB_v_potery() + data.getOthods()) / 100;
		normOfRashod = data.getmOtl() + massOfPoter;
		newMetall = mShihty * data.getPercentOfNewMetall() / 100;
		vozvrat = newMetall - normOfRashod;

		System.out.println("��� �����: " + mShihty);

		System.out.println("����� ���� ������: " + massOfPoter);

		System.out.println("����� ������� " + normOfRashod);

		System.out.println("������� ������� " + newMetall);

		System.out.println("������� " + vozvrat);
		System.out.println();
	}

	public static void getData() {
		
		//����� ������
		
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
