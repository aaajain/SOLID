package Good.src;


public class Right {

	public static void main(String[] args) {
		System.out.println("wrong");
	}
	
	public User createUser(User userDetails)
	{
		Repo repo = new Repo();
		repo.store(userDetails);
		return userDetails;
		
	}

}
