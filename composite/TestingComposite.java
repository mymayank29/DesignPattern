package composite;

import java.util.ArrayList;
import java.util.List;

public class TestingComposite {
	/*
	 * 
	 * 				rootfolder
	 * 				/    \
	 * 		   file5	folder2
	 * 		  			 /   \
	 * 				folder3  file4
	 * 				/  \
	 * 			file3	folder4
	 * 					 /    \
	 * 				 folder5  folder6
	 * 					/ \     
	 * 				file2 file1	
	 * 
	 * 
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		FileSystem file1 = new File("Hey I am Amrita");
		FileSystem file2 = new File("Hey I am Mayank");
		FileSystem file3 = new File("loollloo");
		FileSystem file4 = new File("jojojojojojo");
		FileSystem file5 = new File("hmmmmmmm");
		
		FileSystem folder6 = new Folder(new ArrayList<>()); 
		
		List<FileSystem> list1 = new ArrayList<>();
		list1.add(file2);
		list1.add(file1);
		FileSystem folder5 = new Folder(list1);
		
		
		List<FileSystem> list2 = new ArrayList<>();
		list2.add(folder5);
		list2.add(folder6);
		FileSystem folder4 = new Folder(list2);
		
		List<FileSystem> list3 = new ArrayList<>();
		list3.add(file3);
		list3.add(folder4);
		FileSystem folder3 = new Folder(list3);
		
		List<FileSystem> list4 = new ArrayList<>();
		list4.add(file4);
		list4.add(folder3);
		FileSystem folder2 = new Folder(list4);
		
		List<FileSystem> list5 = new ArrayList<>();
		list5.add(file5);
		list5.add(folder2);
		FileSystem rootFolder = new Folder(list5);
		
		rootFolder.showContent();
		System.out.println("-----------------------");
		file5.showContent();
		System.out.println("-----------------------");
		folder2.showContent();
		System.out.println("-----------------------");
		folder3.showContent();
		System.out.println("-----------------------");
		file4.showContent();
		System.out.println("-----------------------");
		file3.showContent();
		System.out.println("-----------------------");
		folder4.showContent();
		System.out.println("-----------------------");
		folder5.showContent();
		System.out.println("-----------------------");
		folder6.showContent();
		System.out.println("-----------------------");
		file2.showContent();
		System.out.println("-----------------------");
		file1.showContent();
	}

}
