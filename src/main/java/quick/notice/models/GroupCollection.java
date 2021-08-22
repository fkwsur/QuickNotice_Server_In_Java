package quick.notice.models;

public class GroupCollection {
  // 클래스 안에서 사용하기 위한 변수, Private는 class 외부에서 접근할 수 없는 변수
  private Long idx;
  private String group_name;
  private String manager;
  private String invite_code;
  private String group_img;

	public Long getIdx() {
		return this.idx;
	}

	public void setIdx(Long idx) {
		this.idx = idx;
	}

	public String getGroup_name() {
		return this.group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getInvite_code() {
		return this.invite_code;
	}

	public void setInvite_code(String invite_code) {
		this.invite_code = invite_code;
	}

	public String getGroup_img() {
		return this.group_img;
	}

	public void setGroup_img(String group_img) {
		this.group_img = group_img;
	}


  // 클래스 초기화
  public GroupCollection() {
    super();
  }

  // 지역변수 초기화
  public GroupCollection(Long idx, String group_name, String manager, String invite_code, String group_img) {
    super();
    this.idx = idx;
    this.group_name =group_name;
    this.manager = manager;
    this.invite_code = invite_code;
    this.group_img = group_img;
  }

  // 게터와 세터가 있어야 프라이빗 변수를 외부에서 가져다가 쓸 수 있다.
  // 겟은 데이터를 가져오는 것, 셋은 데이터를 넣어주는 것


}