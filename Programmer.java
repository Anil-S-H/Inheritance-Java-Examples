package inheritance_exmaples;

public class Programmer extends Employee{
	int bonus=15000;
	public static void main(String[] args) {
		Programmer p=new Programmer();
		System.out.println("salary is :"+p.salary);
		System.out.println("bonus is :"+p.bonus);
	}

}
