package quick.notice.models;

public class ReqUser {

  private String user_id;
  private String password;
  private String token;



	public String getUser_id() {
		return this.user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
  
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}


  public ReqUser() {
    super();
  }

  public ReqUser(String user_id, String password) {
    super();
    this.user_id = user_id;
    this.password = password;
    this.token = token;
  }


  

}