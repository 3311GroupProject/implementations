package LoginPackage;

public class LoginSubject implements Login{

	LoginProxy proxy = new LoginProxy();
	@Override
	public void validate(String uname, String pass) {
		// TODO Auto-generated method stub
		proxy.validate(uname, pass);
		
	}

	public void launch() {
		// TODO Auto-generated method stub
		
	}

}
