package װ��ģʽ;

public class Finery extends Person {
	private Person person;
	
	public Person getPerson() {
		return person;
	}
 
	public void setPerson(Person person) {
		this.person = person;
	}
 
	//���
	public void Decorate(Person person) {
		this.person = person;
	}
 
	public void show() {
		if (person != null) {
			person.show();
		}
	}
 
}
