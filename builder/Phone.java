package builder;

public class Phone {
	String os;
	int memory;
	String processor;
	int ram;
	int size;
	String name;
	String brand;
	int noOfCamera;
	int cameraPixel;
	boolean gps;
	
	public Phone(String os, int memory, String processor, int ram, int size, String name, String brand, int noOfCamera,
			int cameraPixel, boolean gps) {
		this.os = os;
		this.memory = memory;
		this.processor = processor;
		this.ram = ram;
		this.size = size;
		this.name = name;
		this.brand = brand;
		this.noOfCamera = noOfCamera;
		this.cameraPixel = cameraPixel;
		this.gps = gps;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", memory=" + memory + ", processor=" + processor + ", ram=" + ram + ", size=" + size
				+ ", name=" + name + ", brand=" + brand + ", noOfCamera=" + noOfCamera + ", cameraPixel=" + cameraPixel
				+ ", gps=" + gps + "]";
	}
	
	
}
