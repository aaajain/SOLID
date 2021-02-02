package Good;

import java.util.Date;
import java.util.List;

public interface Repo {
	public List<User> listUsers(Date afterDate);
}
