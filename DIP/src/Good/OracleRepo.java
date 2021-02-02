package Good;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OracleRepo implements Repo {

	@Override
	public List<User> listUsers(Date afterDate) {
		// Oracle Syntax
		System.out.println("Oracle");
		return new ArrayList<User>();
	}

}
