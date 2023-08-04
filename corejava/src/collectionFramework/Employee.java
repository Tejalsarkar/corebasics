


package collectionFramework;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	private int id = 0;
	private String name = null;
	private int salary = 0;

	public Employee(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}

	@Override
	public int compareTo(Employee o) {

		if (this.id - o.id == 0) {
			return this.name.compareTo(o.name);
		}
		return this.id - o.id;
	}
}

class orderByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.getName().compareTo(o2.getName());
	}

}

class OrderById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		//return o1.getId()-o2.getId();// for Accending order
		return o2.getId()-o1.getId();  //for Decending order
	}

}
class orderBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
//	return o1.getSalary()-o2.getSalary(); //for accending order
	return o2.getSalary()-o2.getSalary(); //for decending order 
	}
	
}