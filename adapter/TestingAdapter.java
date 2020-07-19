package adapter;

public class TestingAdapter {

	public static void main(String[] args) {
//		UsaTV tvUsa = new USHome();
//		tvUsa.showContentofChannel();
		
		UsaToIndiaAdapter tvIndia = new UsaToIndiaAdapter();
		tvIndia.showContentofChannel();

	}

}
