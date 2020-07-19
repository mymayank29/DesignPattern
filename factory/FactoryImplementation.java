package factory;

public class FactoryImplementation extends Factory{
	
	Product p;
	Product q;
	FactoryImplementation(){
	}
	
	public Product getProduct(int age){
		
		if(age> 18){
			if(p!=null){
				return p;
			}
			else {
				return new ProductImplementationabove18();
			}
		}
		else
			if(q!=null){
				return q;
			}
			else {
				return new ProductImplementationBelow18();
			}
		
	}

}
