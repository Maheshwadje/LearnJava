package encapsulation;

class Auth
{
	private String username = "";
	private String password = "method@321";
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
public class Facebook_login 
{

	public static void main(String[] args) 
	{
		Auth a1 = new Auth();
		a1.setUsername("contact@gmail.com");
		a1.setPassword("mahesh!123");
		System.out.println(a1.getUsername());
		System.out.println(a1.getPassword());

	}

}
