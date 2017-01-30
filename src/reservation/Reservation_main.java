package reservation;

public class Reservation_main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Reservation_control rcontrol = new Reservation_control();
		Reservation_view rview = new Reservation_view(rcontrol);
		rview.setBounds( 5, 5, 700, 500 );
		rview.setVisible(true);

	}

}
