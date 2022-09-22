package Day11ObjectArray;

public class UseCar {
	public static void main(String[]args) {
		Car car1=new Car();
		car1.brand="honda";
		car1.model="a1";
		car1.price=4000000;
		car1.speed=140;
		car1.colour="grey";
		car1.isBs6=false;
		
		Car car2=new Car();
		car2.brand="hyundai";
		car2.model="b1";
		car2.price=2500000;
		car2.speed=150;
		car2.colour="white";
		car2.isBs6=false;
		
		Car car3=new Car();
		car3.brand="bmw";
		car3.model="c1";
		car3.price=10000000;
		car3.speed=200;
		car3.colour="black";
		car3.isBs6=true;
		
		Car car4=new Car();
		car2.brand="nano";
		car2.model="d1";
		car2.price=3000000;
		car2.speed=180;
		car2.colour="blue";
		car2.isBs6=false;
		
	/*	int max=0; String temp="";
		Car[] cars= {car1,car2,car3,car4};
		for(Car c:cars) {
			if(c.price>max) {
				max=c.price;
				temp=temp+c;
	
				
			}
			
		}
		System.out.println(temp.brand+" "+temp.model); 
	}*/
		
	/*	Car[] cars= {car1,car2,car3,car4};
		for(int i=0;i<cars.length;i++) {
			if(cars[i].isBs6==true) {
	System.out.println(cars[i].price+(cars[i].price*10/100));
			}
		}*/
		
		
		
	}
}
