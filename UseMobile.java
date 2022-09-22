package Day11ObjectArray;

public class UseMobile {
	public static void main(String[]args) {
		Mobile mob1= new Mobile();
		mob1.brand="samsung";
		mob1.price=40000;
		mob1.colour="blue";
		mob1.isTouchScreen=true;
	
	
		Mobile mob2=new Mobile();
		mob2.brand="sony";
		mob2.price=30000;
		mob2.colour="black";
		mob2.isTouchScreen=true;
		
		Mobile mob3=new Mobile();
		mob3.brand="oppo";
		mob3.price=45000;
		mob3.colour="white";
		mob3.isTouchScreen=true;
		
		Mobile[] mobiles=new Mobile[3];
		mobiles[0]=mob1;
		mobiles[1]=mob2;
		mobiles[2]=mob3;
		
		/*for(int i=0;i<mobiles.length;i++) {
		if(mobiles[i].colour.equalsIgnoreCase("white")) {
		System.out.println(mobiles[i].brand+" "+mobiles[i].price+" "+mobiles[i].isTouchScreen);
		}
	}*/
		for(Mobile m:mobiles) {
		if(m.colour.equalsIgnoreCase("white")) {
			System.out.println(m.brand+" "+m.price+" "+m.isTouchScreen);
		}
			
		if(m.price<40000) {
			System.out.println(m.brand+" "+m.colour+" "+m.price+" "+m.isTouchScreen);
		}
		
		if(m.brand.toUpperCase().startsWith("S")) {
			System.out.println(m.brand+" "+m.colour+" "+m.price+" "+m.isTouchScreen);
			}
		
		}
	}
	
}

		


