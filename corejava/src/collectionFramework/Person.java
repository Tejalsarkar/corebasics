package collectionFramework;

public class Person {

	private int id = 0;
	private String name = null;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;

	}

	public String getname() {
		return name;
	}
	
  @Override
  
  public String toString() {
		return "(" + id + " " + name +")";
	}

	@Override
	public boolean equals(Object obj) {
	if (!(obj instanceof Person)) {
			return false;
	}
		Person p = (Person) obj;
		boolean b = this.id == p.id && this.name.equals(p.name);
		return b;
	}
	@Override
	public int hashCode() {
		String str = id+name;
		return str.hashCode();
	}
	
	
}