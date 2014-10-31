package ua.artcode.week3.day2;


// methods(action of instance) 
// fields(state of instance)
public class Motorcycle {
	
	String model;
	int speed;
	double weight;
	double price;
	
	public void go(){
		System.out.println("Motorcycle : {model = " + model 
							+ ", speed " + speed 
							+", weight = " + weight 
							+ ", price = " + price + "} ");
	}
	
}
