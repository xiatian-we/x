package 装饰模式;

public class Finery extends Person {
	private Person person;
	
	public Person getPerson() {
		return person;
	}
 
	public void setPerson(Person person) {
		this.person = person;
	}
 
	//打扮
	public void Decorate(Person person) {
		this.person = person;
	}
 
	public void show() {
		if (person != null) {
			person.show();
		}
	}
 
}
