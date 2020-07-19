package builder;

public class PhoneBuilder {
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
	
	PhoneBuilder() {}

	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder setMemory(int memory) {
		this.memory = memory;
		return this;
	}

	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public PhoneBuilder setSize(int size) {
		this.size = size;
		return this;
	}

	public PhoneBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public PhoneBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	public PhoneBuilder setNoOfCamera(int noOfCamera) {
		this.noOfCamera = noOfCamera;
		return this;
	}

	public PhoneBuilder setCameraPixel(int cameraPixel) {
		this.cameraPixel = cameraPixel;
		return this;
	}

	public PhoneBuilder setGps(boolean gps) {
		this.gps = gps;
		return this;
	}
	
	public Phone getPhone(){
		return new Phone(os, memory, processor, ram, size, name, brand, noOfCamera, cameraPixel, gps);
	}
	
	
}
