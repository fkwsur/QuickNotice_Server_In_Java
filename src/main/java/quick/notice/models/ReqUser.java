package quick.notice.models;

public class ReqUser {

  private String id;
  private String password;

  public ReqUser() {
    super();
  }

  public ReqUser(String id, String password) {
    super();
    this.id = id;
    this.password = password;
  }


  public String getId() {
    return id;
  }

  public String getPassword() {
    return password;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  

}