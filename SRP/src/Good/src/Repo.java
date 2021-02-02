package Good.src;


public class Repo {
	//make a db connection
	DbCon dbCon = new DbCon();
	public User store(User user) {
		return user;
	}
}
