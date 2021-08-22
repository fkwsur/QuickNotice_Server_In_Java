package daily.coding.models;

public class Board  {
  // 클래스 안에서 사용하기 위한 변수, Private는 class 외부에서 접근할 수 없는 변수
  private Long idx;
  private String title;
  private String desc;
  private String user_id;
  private String group_idx;
  private String notice;
  private String writer;

  
  // 게터와 세터가 있어야 프라이빗 변수를 외부에서 가져다가 쓸 수 있다.
  // 겟은 데이터를 가져오는 것, 셋은 데이터를 넣어주는 것
	public Long getIdx() {
		return this.idx;
	}

	public void setIdx(Long idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getUser_id() {
		return this.user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getGroup_idx() {
		return this.group_idx;
	}

	public void setGroup_idx(String group_idx) {
		this.group_idx = group_idx;
	}

	public String getNotice() {
		return this.notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getWriter() {
		return this.writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

  // 클래스 초기화
  public Board () {
    super();
  }

  // 지역변수 초기화
  public Board (Long idx, String title, String desc, String user_id, String group_idx, String notice, String writer) {
    super();
    this.idx = idx;
    this.title =title;
    this.desc = desc;
    this.user_id = user_id;
    this.group_idx = group_idx;
    this.notice = notice;
    this.writer = writer;
  }

}