package proj;

public class Author {
	int id;
	String firstName;
	String lastName;
	public Author() {
		
	}
	public Author(int id,String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Author{"+"id= "+id +", First Name: '"+firstName+'\''+", last name: "+lastName+'\''+"}";
	}
}
