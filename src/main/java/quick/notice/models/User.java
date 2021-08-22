package quick.notice.models;

public class User {
  // 클래스 안에서 사용하기 위한 변수, Private는 class 외부에서 접근할 수 없는 변수
  private Long idx;
  private String user_id;
  private String password;
  private String user_name;
  private String birth;
  private String gender;
  private String email;
  private String ms_token;
  private String user_img;

	public Long getIdx() {
		return this.idx;
	}

	public void setIdx(Long idx) {
		this.idx = idx;
	}

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

	public String getUser_name() {
		return this.user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getBirth() {
		return this.birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMs_token() {
		return this.ms_token;
	}

	public void setMs_token(String ms_token) {
		this.ms_token = ms_token;
	}

	public String getUser_img() {
		return this.user_img;
	}

	public void setUser_img(String user_img) {
		this.user_img = user_img;
	}



  // 클래스 초기화
  public User() {
    super();
  }

  // 지역변수 초기화
  public User(Long idx, String user_id, String password, String user_name, String birth, String gender, String email, String ms_token, String user_img) {
    super();
    this.idx = idx;
    this.user_id =user_id;
    this.password = password;
    this.user_name = user_name;
    this.birth = birth;
    this.gender = gender;
    this.email = email;
    this.ms_token = ms_token;
    this.user_img = user_img;
  }

  // 게터와 세터가 있어야 프라이빗 변수를 외부에서 가져다가 쓸 수 있다.
  // 겟은 데이터를 가져오는 것, 셋은 데이터를 넣어주는 것


}