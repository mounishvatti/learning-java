package encapsulation;

public class Variables {
	private String private_var = "Private Variable";
	protected String protected_var = "Protected Variable";
	String default_var = "Default Variable";
	public String public_var = "Public variable";
	
	public String getPrivate_var() {
		return private_var;
	}
	public void setPrivate_var(String private_var) {
		this.private_var = private_var;
	}
}

