package µÇÂ¼½çÃæ;

public class UserDAO {
	private DBUtil db;
	String userName;
	String userPassword;
	public void findUser (String userName,String userPassword) {
		this.userName=userName;
		this.userPassword=userPassword;
	}
}

