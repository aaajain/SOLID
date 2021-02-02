package Good;

public class DBFactory {
	public static Repo getDB(String dbType)
	{
		if(dbType == "Oracle")
		{
			return new OracleRepo();
		}
		if(dbType == "Mongo")
		{
			return new MongoDBRepo();
		}
		else
			return null;
	}

}
