package composite;

public class File implements FileSystem{
	String text;
	
	File(String text) {
		this.text  = text;
	}
	@Override
	public void showContent() {
		System.out.println(this.text);
	}
}
