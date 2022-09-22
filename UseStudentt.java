package Day11ObjectArray;

public class UseStudentt {
	public static void main(String[]args) {
		Studentt student1=new Studentt();
		student1.name="Manohar";
		student1.rollNum=46;
		student1.age=25;
		student1.isMale=true;
		
		Studentt student2=new Studentt();
		student2.name="Shoba";
		student2.rollNum=26;
		student2.age=24;
		student2.isMale=false;
		
		Studentt student3=new Studentt();
		student3.name="Sameer";
		student3.rollNum=15;
		student3.age=21;
		student3.isMale=true;
		
		Studentt student4=new Studentt();
		student4.name="Sagar";
		student4.rollNum=18;
		student4.age=28;
		student4.isMale=true;
		
		int temp=student1.age;
		String temp1="";
		
		
		
		Studentt[] students= {student1,student2,student3,student4};
		/*for(Studentt std:students) {
			if(std.age>18) {
				System.out.println(std.name+" "+std.rollNum+" "+std.age+" "+std.isMale);
				
		}
		
	}*/
		
		
		/*for(int i=0;i<students.length;i++) {
			if(students[i].isMale!=true) {
				System.out.println(students[i].name);
				
			}
		}*/
		
	/*	for(int i=0;i<students.length;i++) {
			if(temp<students[i].age) {
				temp=students[i].age;
				temp1=students[i].name;
			}
		}
				System.out.println(temp1); */
		
		/*for(Studentt s:students) {
			if(s.age<temp) {
				temp=s.age;
				temp1=s.name;
			}
			}
		System.out.println(temp1); */
		
	/*	for(Studentt s:students) {
			if(s.name.length()>4) {
				System.out.println(s.name+" "+s.rollNum+" "+s.age+" "+s.isMale);
			}
		}*/
		
		for(int i=0;i<students.length;i++) {
			if(students[i].rollNum>25&&students[i].rollNum<50) {
				System.out.println(students[i].name+" "+students[i].rollNum+" "+students[i].age+" "+students[i].isMale);
			}
		}
				
				
			
		
		}

}
