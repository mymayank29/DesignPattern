package prototype;

public class TestingPrototype {
	
	public static void changeValue(String str) {
		str = "changed";
	}

	public static void main(String[] args) throws CloneNotSupportedException{
		BookShop bs1 = new BookShop();
		Author a = new Author();
		a.setName("Amrita");
		bs1.setAuthor(a);
		bs1.loadData();
		
		
	    // BookShop bs2 = (BookShop)bs1.clone();
		// is same as doing
		BookShop bs2 = new BookShop();
		bs2.name = bs1.name;
		bs2.books = bs1.books;
		//----
		
		
		
		System.out.println(bs1);
		System.out.println(bs2);
		
		
//		String str  =  "before";
//		changeValue(str);
//		System.out.println(str);
//		
//		String s1 = "Mayank";
//		String s2 = s1;
//		String s3 = "Mayank";
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
	}

}
