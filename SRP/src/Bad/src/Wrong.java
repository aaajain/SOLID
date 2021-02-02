package Bad.src;


public class Wrong {

	public static void main(String[] args) {
		System.out.println("wrong");
	}
	
	public User createUser(User userDetails)
	{
		//make a db connection
		DbCon dbCon = new DbCon();
		Repo repo = new Repo();
		repo.store(userDetails,dbCon);
		return userDetails;
		
	}

}
