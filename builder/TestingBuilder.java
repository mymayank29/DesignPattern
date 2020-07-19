package builder;

public class TestingBuilder {

	public static void main(String[] args) {
		PhoneBuilder phoneBuilder = new PhoneBuilder();
		Phone p = phoneBuilder.setMemory(512).setOs("Android").setRam(16).getPhone();
		System.out.println(p);
	}

}
