package Clonning;

		public class Customer implements Cloneable {
			String name;
			Account account;
			
			public Customer(String s) {
				name = s;
				account = new Account(10);
				
			}
			@Override
			protected Object clone() throws CloneNotSupportedException {
				Customer c =(Customer)super.clone();
				c.account=(Account)account.clone();
				return c;
			}
		}