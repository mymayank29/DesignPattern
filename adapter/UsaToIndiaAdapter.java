package adapter;

public class UsaToIndiaAdapter implements UsaTV {
	
	IndiaHome indiaHome;
	UsaToIndiaAdapter(){
		this.indiaHome = new IndiaHome();
	}

	@Override
	public void showContentofChannel() {
		this.indiaHome.showContentOfIndiaChannel();
		
	}
}
