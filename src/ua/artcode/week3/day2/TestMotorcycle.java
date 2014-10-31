package ua.artcode.week3.day2;

public class TestMotorcycle {

	public static void main(String[] args) {
		Motorcycle moto1 = new Motorcycle(); 
		//Create ref instance =  Create instance(object) of Motorcycle
		moto1.model = "Honda CB400";
		moto1.speed = 200;
		moto1.weight = 300;
		moto1.price = 4000;
		moto1.go();
		
		Motorcycle moto2 = new Motorcycle();
		moto2.model = "Suzuzki S789";
		moto2.speed = 300;
		moto2.weight = 450;
		moto2.price = 9000;
		moto2.go();
	}

}
