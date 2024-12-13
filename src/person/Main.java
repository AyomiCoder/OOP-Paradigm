package person;

public class Main {

	public static void main(String[] args) {
		Yoruba y = new Yoruba();
		y.setName("Ayomide");
		y.greet();
		
		Igbo i = new Igbo();
		i.setName("Chike");
		i.greet();
		
		Person person = new Person();
		person.setAge(25);
		System.out.println(person.getAge());
		
	}

}
