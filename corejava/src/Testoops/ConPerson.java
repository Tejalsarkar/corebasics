package Testoops;

public class ConPerson {
	/*public ConPerson() {
		
    System.out.println("default Constructor");
	}
	public ConPerson(int a) {
		System.out.println("One Parameter Constructor");
	}
	
	public ConPerson(int a,int b) {
		System.out.println("two param Constructor");
	
		ClassTestPerson p =new ClassTestPerson(); */
		
	public ConPerson() {
		
	}
	private int id = 0;
	private String name ;
	private int contactNo = 0;
	
	public ConPerson (int id,String name,int ContactNo) {
		this.id=id;
		this.name=name;
		this.contactNo=ContactNo; 
	}
	
		public void setId(int id) {
			this.id=id;
		}
		public void setName(String name) {
			this.name=name;
		}
		public void setcontactNo(int contactNo) {
			this.contactNo = contactNo;
		}
		public int getid() {
			return id;
		}
		public String getname() {
			return name;
		}
		public int getcontactNo() {
			return contactNo;
		
		}

}
