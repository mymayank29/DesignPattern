package strategy;

class Duck {
	
	IQuackStrategy quackType;
	
	Duck(IQuackStrategy quackType) {
		this.quackType = quackType;
	}
	
	void quack(){
		quackType.quack();
	}

}

class WildDuck extends Duck{
	WildDuck() {
		super(new SimpleQuack());
	}
}

class CityDuck extends Duck{
	CityDuck() {
		super(new SimpleQuack());
	}
}

class PetDuck extends Duck{
	PetDuck() {
		super(new NoQuack());
	}
}



