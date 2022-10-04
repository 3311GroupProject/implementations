
public abstract class Login {
	
	public static LoginService instance;
	
	public String username;
	public String password;

	public abstract LoginService getInstance();
	public abstract void LoginService();
	public abstract boolean Validate();
}
