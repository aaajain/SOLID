package Good;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MongoDBRepo implements Repo {

	@Override
	public List<User> listUsers(Date afterDate) {
		//MongoDB Syntex
		System.out.println("Mongo");
		return new ArrayList<User>();
	}

}
