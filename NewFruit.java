package Day11ObjectArray;

public class NewFruit {
	public static void main(String[]args) {
		Fruit fruit1=new Fruit();
		fruit1.fruitName="Mango";
		fruit1.price=50;
		fruit1.isHybrid=false;
		
		Fruit fruit2=new Fruit();
		fruit2.fruitName="Apple";
		fruit2.price=40;
		fruit2.isHybrid=true;
		
		Fruit fruit3=new Fruit();
		fruit3.fruitName="banana";
		fruit3.price=20;
		fruit3.isHybrid=false;
		
		Fruit fruit4=new Fruit();
		fruit4.fruitName="grapes";
		fruit4.price=10;
		fruit4.isHybrid=true;
		
		Fruit fruit5=new Fruit();
		fruit5.fruitName="orange";
		fruit5.price=60;
		fruit5.isHybrid=false;
		
		Fruit fruit6=new Fruit();
		fruit6.fruitName="sapota";
		fruit6.price=40;
		fruit6.isHybrid=true;
		
		Fruit[] fruits= {fruit1,fruit2,fruit3,fruit4,fruit5,fruit6};
		/*for(int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i].fruitName+" "+fruits[i].price+" "+fruits[i].isHybrid);
		}*/
		
		/*for(int i=fruits.length-1;i>=0;i--) {
			System.out.println(fruits[i].fruitName+fruits[i].price+fruits[i].isHybrid);
			}*/
		
		/*for(int i=0;i<fruits.length/2;i++) {
			System.out.println(fruits[i].fruitName+" "+fruits[i].price+" "+fruits[i].isHybrid);
		}*/
		
	/*	for(int i=fruits.length/2;i<fruits.length;i++) {
			System.out.println(fruits[i].fruitName+" "+fruits[i].price+" "+fruits[i].isHybrid);
		}*/
		
	/*	for(int i=fruits.length/2-1;i>=0;i--) {
			System.out.println(fruits[i].fruitName+" "+fruits[i].price+" "+fruits[i].isHybrid);
		}*/
		
		for(int i=fruits.length-1;i>=fruits.length/2;i--) {
			System.out.println(fruits[i].fruitName+" "+fruits[i].price+" "+fruits[i].isHybrid);
			
		}
	}
}
