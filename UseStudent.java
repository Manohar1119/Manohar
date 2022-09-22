package Day11ObjectArray;

public class UseStudent {
	public static void main(String[]args) {
		Student student1=new Student();
		student1.name="manohar";
		student1.marks=90;
		student1.isMale=true;
		
		Student student2=new Student();
		student2.name="sagar";
		student2.marks=95;
		student2.isMale=true;
		
		Student student3=new Student();
		student3.name="shoba";
		student3.marks=90;
		student3.isMale=false;
		
		Student student4=new Student();
		student4.name="vivek";
		student4.marks=93;
		student4.isMale=true;
		
		Student[] students=new Student[4];
		students[0]=student1;
		students[1]=student2;
		students[2]=student3;
		students[3]=student4;
		
	/*	for(Student details:students) {
			System.out.println(details.name+" "+details.marks+" "+details.isMale);
		} */
		
		for(int i=students.length-1;i>=0;i--) {
			System.out.println(students[i].name+" "+students[i].marks+" "+students[i].isMale);
			
		}
	}

}
