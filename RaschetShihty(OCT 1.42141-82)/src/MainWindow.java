import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MainWindow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1034445994400832240L;
	private JTextField mDet;
	private JTextField mOtl;
	private JTextField mOtlSLps;
	private JTextField percentOfBrak;
	private JTextField percentOfNewMetall;
	private JTextField mObr;
	private JTextField mOtlSLpsA;
	private JTextField mOtlA;
	private JTextField mDetA;
	private JTextField normOfRashodA;
	private JTextField mPoterA;
	private JTextField mShihtiA;
	private JTextField mOfNewMetallA;
	private JTextField kVoVozvrA;
	private JComboBox<String> BoxKindOfCasting;
	private JComboBox<String> BoxSplav;
	private JCheckBox dupleks;

	public MainWindow(String s) {

		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLocationRelativeTo(null);
		setResizable(false);
		setSize(640, 480);
		getContentPane().setLayout(null);

		BoxKindOfCasting = new JComboBox<String>();
		BoxKindOfCasting.setFont(new Font("Tahoma", Font.ITALIC, 14));
		BoxKindOfCasting.setBounds(23, 12, 161, 31);
		getContentPane().add(BoxKindOfCasting);
		BoxKindOfCasting.addItem("В песчаные формы");
		BoxKindOfCasting.addItem("В оболочковые формы");
		BoxKindOfCasting.addItem("В кокиль");
		BoxKindOfCasting.addItem("ЛВМ");
		BoxKindOfCasting.addItem("Под давлением");
		BoxKindOfCasting.addItem("Выжиманием");

		BoxSplav = new JComboBox<String>();
		BoxSplav.setFont(new Font("Tahoma", Font.ITALIC, 14));
		BoxSplav.setBounds(23, 54, 161, 37);
		getContentPane().add(BoxSplav);
		BoxSplav.addItem("Чугуны");
		BoxSplav.addItem("Констр. стали");
		BoxSplav.addItem("Жаропроч. стали");
		BoxSplav.addItem("Алюминий");
		BoxSplav.addItem("Магний с сод. Cr");
		BoxSplav.addItem("Магний с сод. Al");

		dupleks = new JCheckBox(
				"\u0414\u0432\u043E\u0439\u043D\u043E\u0439 \u043F\u0435\u0440\u0435\u043F\u043B\u0430\u0432");
		dupleks.setBounds(23, 107, 161, 20);
		getContentPane().add(dupleks);

		JLabel lbln = new JLabel(
				"\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043C\u0430\u0441\u0441\u0443 \u0434\u0435\u0442\u0430\u043B\u0438,\u043A\u0433:");
		lbln.setBounds(225, 12, 171, 37);
		getContentPane().add(lbln);

		mDet = new JTextField();
		mDet.setBackground(Color.WHITE);
		mDet.setBounds(482, 17, 86, 20);
		getContentPane().add(mDet);
		mDet.setColumns(10);

		JLabel label = new JLabel(
				"\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043C\u0430\u0441\u0441\u0443 \u043E\u0442\u043B\u0438\u0432\u043A\u0438,\u043A\u0433:");
		label.setBounds(225, 60, 171, 14);
		getContentPane().add(label);

		mOtl = new JTextField();
		mOtl.setBackground(Color.WHITE);
		mOtl.setBounds(482, 57, 86, 20);
		getContentPane().add(mOtl);
		mOtl.setColumns(10);

		JLabel label_1 = new JLabel(
				"\u0423\u0441\u0442\u0430\u043D\u043E\u0432\u0438\u0442\u0435 % \u0431\u0440\u0430\u043A\u0430,%:");
		label_1.setBounds(225, 118, 141, 37);
		getContentPane().add(label_1);

		percentOfBrak = new JTextField();
		percentOfBrak.setBackground(Color.WHITE);
		percentOfBrak.setBounds(482, 120, 86, 20);
		getContentPane().add(percentOfBrak);
		percentOfBrak.setColumns(10);

		JLabel label_2 = new JLabel(
				"\u0423\u0441\u0442\u0430\u043D\u043E\u0432\u0438\u0442\u0435 % \u043E\u0441\u0432. \u043C\u0435\u0442\u0430\u043B\u043B\u0430,%:");
		label_2.setBounds(225, 160, 224, 14);
		getContentPane().add(label_2);

		percentOfNewMetall = new JTextField();
		percentOfNewMetall.setBackground(Color.WHITE);
		percentOfNewMetall.setBounds(482, 151, 86, 20);
		getContentPane().add(percentOfNewMetall);
		percentOfNewMetall.setColumns(10);

		JButton process = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C!");
		process.setBackground(Color.GREEN);
		process.setFont(new Font("Tahoma", Font.PLAIN, 16));
		process.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Main.setData();
					Main.processing();
					Main.getData();

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Введите положительные числа, десячичную дробь через точку");
					System.out.println("ошибка при расчете");
					e.printStackTrace();

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Проверте входные данные");
					System.out.println("ошибка при расчете");
					e.printStackTrace();

				}

			}
		});
		process.setBounds(23, 213, 161, 49);
		getContentPane().add(process);

		JLabel label_3 = new JLabel(
				"\u041C\u0430\u0441\u0441\u0430 \u0434\u0435\u0442\u0430\u043B\u0438,\u043A\u0433:");
		label_3.setBounds(23, 303, 117, 14);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel(
				"\u041C\u0430\u0441\u0441\u043A\u0430 \u043E\u0442\u043B\u0438\u0432\u043A\u0438,\u043A\u0433:");
		label_4.setBounds(23, 346, 117, 14);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel(
				"\u041C\u0430\u0441\u0441\u0430 \u043E\u0442\u043B\u0438\u043A\u0438 \u0441 \u041B\u041F\u0421,\u043A\u0433:");
		label_5.setBounds(23, 389, 141, 14);
		getContentPane().add(label_5);

		mOtlSLpsA = new JTextField();
		mOtlSLpsA.setEditable(false);
		mOtlSLpsA.setBounds(180, 386, 86, 20);
		getContentPane().add(mOtlSLpsA);
		mOtlSLpsA.setColumns(10);

		mOtlA = new JTextField();
		mOtlA.setEditable(false);
		mOtlA.setBounds(180, 343, 86, 20);
		getContentPane().add(mOtlA);
		mOtlA.setColumns(10);

		mDetA = new JTextField();
		mDetA.setEditable(false);
		mDetA.setBounds(180, 300, 86, 20);
		getContentPane().add(mDetA);
		mDetA.setColumns(10);

		JLabel label_6 = new JLabel("\u041C\u0430\u0441\u0441\u0430 \u0448\u0438\u0445\u0442\u044B,\u043A\u0433:");
		label_6.setBounds(316, 240, 179, 14);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel(
				"\u041C\u0430\u0441\u0441\u0430 \u0431/\u0432 \u043F\u043E\u0442\u0435\u0440\u044C,\u043A\u0433:");
		label_7.setBounds(316, 285, 179, 14);
		getContentPane().add(label_7);

		JLabel label_8 = new JLabel(
				"\u041D\u043E\u0440\u043C\u0430 \u0440\u0430\u0441\u0445\u043E\u0434\u0430 \u0441\u0432. \u043C\u0435\u0442,\u043A\u0433:");
		label_8.setBounds(316, 328, 179, 14);
		getContentPane().add(label_8);

		normOfRashodA = new JTextField();
		normOfRashodA.setEditable(false);
		normOfRashodA.setBounds(525, 328, 86, 20);
		getContentPane().add(normOfRashodA);
		normOfRashodA.setColumns(10);

		mPoterA = new JTextField();
		mPoterA.setEditable(false);
		mPoterA.setBounds(525, 285, 86, 20);
		getContentPane().add(mPoterA);
		mPoterA.setColumns(10);

		mShihtiA = new JTextField();
		mShihtiA.setEditable(false);
		mShihtiA.setBounds(525, 240, 86, 20);
		getContentPane().add(mShihtiA);
		mShihtiA.setColumns(10);

		JLabel label_9 = new JLabel(
				"\u041C\u0430\u0441\u0441\u0430 \u0441\u0432. \u043C\u0435\u0442\u0430\u043B\u043B\u0430,\u043A\u0433:");
		label_9.setBounds(316, 369, 179, 14);
		getContentPane().add(label_9);

		JLabel label_10 = new JLabel(
				"\u041C\u0430\u0441\u0441\u0430 \u0432\u043E\u0437\u0432\u0440\u0430\u0442\u0430,\u043A\u0433:");
		label_10.setBounds(316, 413, 179, 14);
		getContentPane().add(label_10);

		mOfNewMetallA = new JTextField();
		mOfNewMetallA.setEditable(false);
		mOfNewMetallA.setBounds(525, 369, 86, 20);
		getContentPane().add(mOfNewMetallA);
		mOfNewMetallA.setColumns(10);

		kVoVozvrA = new JTextField();
		kVoVozvrA.setEditable(false);
		kVoVozvrA.setBounds(525, 413, 86, 20);
		getContentPane().add(kVoVozvrA);
		kVoVozvrA.setColumns(10);

		JLabel label_11 = new JLabel(
				"\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043C\u0430\u0441\u0441\u0443 \u043E\u0442\u043B\u0438\u0432\u043A\u0438 \u0441 \u041B\u041F\u0421,\u043A\u0433:");
		label_11.setBounds(225, 93, 208, 14);
		getContentPane().add(label_11);

		mOtlSLps = new JTextField();
		mOtlSLps.setBackground(Color.WHITE);
		mOtlSLps.setBounds(482, 88, 86, 20);
		getContentPane().add(mOtlSLps);
		mOtlSLps.setColumns(10);

		JButton cancel = new JButton("\u0421\u0431\u0440\u043E\u0441");
		cancel.setBackground(Color.YELLOW);
		cancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mDet.setText(null);
				mOtl.setText(null);
				mOtlSLps.setText(null);
				percentOfBrak.setText(null);
				percentOfNewMetall.setText(null);
				mObr.setText(null);
				mOtlSLpsA.setText(null);
				mOtlA.setText(null);
				mDetA.setText(null);
				normOfRashodA.setText(null);
				mPoterA.setText(null);
				mShihtiA.setText(null);
				mOfNewMetallA.setText(null);
				kVoVozvrA.setText(null);
			}
		});
		cancel.setBounds(194, 213, 94, 49);
		getContentPane().add(cancel);

		JLabel label_12 = new JLabel(
				"\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043C\u0430\u0441\u0441\u0443 \u043E\u0431\u0440\u0430\u0437\u0446\u043E\u0432,\u043A\u0433:");
		label_12.setBounds(225, 185, 208, 14);
		getContentPane().add(label_12);

		mObr = new JTextField();
		mObr.setBackground(Color.WHITE);
		mObr.setBounds(482, 179, 86, 20);
		getContentPane().add(mObr);
		mObr.setColumns(10);

		setVisible(true);

	}

	public String getVidLitya() {

		return (String) BoxKindOfCasting.getSelectedItem();

	}

	public String getSplav() {

		return (String) BoxSplav.getSelectedItem();

	}

	public double getmDet() {
		String s = mDet.getText();

		if (!s.isEmpty()) {
			return Double.parseDouble(s);
		}
		return 0;

	}

	public double getmOtl() {
		String s = mOtl.getText();
		if (!s.isEmpty()) {

			return Double.parseDouble(s);

		}

		return -1;

	}

	public double getmOtlSLps() {
		String s = mOtlSLps.getText();
		if (!s.isEmpty()) {

			return Double.parseDouble(s);

		}

		return -1;

	}

	public double getPercentOfBrak() {

		String s = percentOfBrak.getText();
		if (!s.isEmpty()) {

			return Double.parseDouble(s);

		}

		return -1;

	}

	public double getpercentOfNewMetall() {

		String s = percentOfNewMetall.getText();
		if (!s.isEmpty()) {

			return Double.parseDouble(s);

		}

		return -1;

	}

	public double getmObr() {

		String s = mObr.getText();
		if (!s.isEmpty()) {

			return Double.parseDouble(s);

		}

		return -1;

	}

	public boolean getdupleks() {
		if (dupleks.isSelected()) {
			return true;
		} else
			return false;
	}

	public void setmDetA(String mDet) {
		mDetA.setText(mDet);
	}

	public void setmOtlA(String mOtl) {
		mOtlA.setText(mOtl);
	}

	public void setmOtlSLpsA(String mOtlSLps) {
		mOtlSLpsA.setText(mOtlSLps);
	}

	public void setmShihtiA(String mShihti) {
		mShihtiA.setText(mShihti);
		;
	}

	public void setmPoterA(String mPoter) {
		mPoterA.setText(mPoter);
	}

	public void setNormOfRashod(String normOfRashod) {
		this.normOfRashodA.setText(normOfRashod);
	}

	public void setmOfNewMetall(String mOfNewMetall) {
		this.mOfNewMetallA.setText(mOfNewMetall);
	}

	public void setkVoVozvr(String kVoVozvr) {
		this.kVoVozvrA.setText(kVoVozvr);
	}

}
