package pm1;

public class Emplyoee {
	int id;
	String name;
	Address address;
	public Emplyoee(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() {
		System.out.print(id+" "+name);
		System.out.print(" "+address.city+" "+address.state+" "+address.country);
		System.out.println("\n");
	}
	public static void main(String[] args) {
		Address a1=new Address("Davangere","Karnataka","India");
		Address a2=new Address("kolkotta","West Bengal","India");
		
		Emplyoee e1=new Emplyoee(100,"Anil",a1);
		Emplyoee e2=new Emplyoee(101,"Naveen",a2);
		Emplyoee e3=new Emplyoee(103,"Virat",a1);
		
		e1.display();
		e2.display();
		e3.display();
	}

}
