package exception;

class ToStringPerson {

	private int id = 0;
	private String name = null;
	private String address= null;
	public ToStringPerson(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getaddress() {
		return address;
	}
	@Override
	public String toString() {

		return super.toString();
	}
	}
	


