package Good;

import java.util.Date;
import java.util.List;

public class ListUsers {
	public static void main(String[] args) {
		getUsers("Mongo");

	}
	public static List<User> getUsers(String DBType)
	{
		List<User> users = DBFactory.getDB(DBType).listUsers(new Date());
		return users;
	}
	
	
}
