package th.project.samplecode.entity;

public class Person {

	private int id;
	private String name;
	private String address;
	private String gender;
	private int phonenumber;
	public Person() {
	}
	public Person(int id, String name, String address, String gender, int phonenumber) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.phonenumber = phonenumber;
	}
	public Person( String name, String address, String gender, int phonenumber) {
		super();
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.phonenumber = phonenumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender + ", phonenumber="
				+ phonenumber + "]";
	}
	
	
	
	
}
