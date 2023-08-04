package fileIO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable{
	public int id = 0;
	public String FirstName = null;
	public String LastName = null;
	public transient int Salary = 0;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
	out.writeInt(id);
	out.writeObject(FirstName);
	out.writeObject(LastName);
	out.writeInt(Salary);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id=in.readInt();
		FirstName=(String)in.readObject();
		LastName=(String)in.readObject();
		Salary = in.readInt();
		
		
	}
	

}
