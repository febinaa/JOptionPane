import javax.swing.JOptionPane;

public class JavaLibs5026201098 {

    public static void main(String[] args) {
    String nama;
	nama = JOptionPane.showInputDialog("Siapa namamu?");

	String job;
	job = JOptionPane.showInputDialog("Apa pekerjaan impianmu?");

	int umur;
	umur = (Integer.parseInt(JOptionPane.showInputDialog("Oiya, Berapa umurmu?(angka)")));

	String hobi;
	hobi = JOptionPane.showInputDialog("Apa hobimu?");

	String tempat;
	tempat = JOptionPane.showInputDialog("Tempat favoritmu dimana?");

	int tahun;
	tahun = (Integer.parseInt(JOptionPane.showInputDialog("Tulis salah satu tahun yang ada dipikiranmu (angka)")));

	int tambah=umur+tahun;

	double angka;
	angka = (Double.parseDouble(JOptionPane.showInputDialog("Sebutkan salah satu angka (Desimal or integer)")));

	String idola;
	idola = JOptionPane.showInputDialog("siapa idolamu?");

	double uang;
	uang = (Double.parseDouble(JOptionPane.showInputDialog("Berapa uang yang kamu punya? (angka)")));

	String waktu;
	waktu = JOptionPane.showInputDialog("Sebutkan 1 waktu yang nyaman (pasi,siang,dll)");

	double biaya=angka*uang;

	JOptionPane.showMessageDialog(null,nama + " berumur " + umur + " adalah seorang " + job + ". " +
	nama + " suka " + hobi + " di " + tempat + " selama " + tambah + " hari " + "bersama" + idola +
	" dengan membawa uang di sakunya sebanyak " + biaya + " rupiah.");
	
    }
}
