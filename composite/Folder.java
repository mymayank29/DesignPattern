package composite;

import java.util.List;

public class Folder implements FileSystem {
	List<FileSystem> fss;
	
	Folder(List<FileSystem> fs) {
		this.fss = fs;
	}

	@Override
	public void showContent() {
		fss.forEach(fs -> fs.showContent());
	}
	
}
