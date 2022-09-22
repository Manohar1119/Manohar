package Day11ObjectArray;

public class UseLaptop {
	public static void main(String[]args) {
		Laptop laptop1= new Laptop();
		laptop1.brand="hp";
		laptop1.price=40000;
		laptop1.colour="grey";
		laptop1.isTouchScreen=false;
	
	
		Laptop lap2=new Laptop();
		lap2.brand="lenovo";
		lap2.price=30000;
		lap2.colour="black";
		lap2.isTouchScreen=false;
		
		Laptop lap3=new Laptop();
		lap3.brand="dell";
		lap3.price=45000;
		lap3.colour="black";
		lap3.isTouchScreen=true;
		
		Laptop[] laps=new Laptop[3];
		laps[0]=laptop1;
		laps[1]=lap2;
		laps[2]=lap3;
		
	/*	System.out.println(laps[0].brand+" "+laps[0].colour);
		System.out.println(laps[1].brand+" "+laps[1].colour);
		System.out.println(laps[2].brand+" "+laps[2].colour);
		} */
		
	/*	for(int i=0;i<laps.length;i++) {
			System.out.println(laps[i].brand+" "+laps[i].colour);
			
		}*/
		
		for(int i=laps.length-1;i>=0;i--) {
			System.out.println(laps[i].brand+" "+laps[i].price);
		}
		}


}
