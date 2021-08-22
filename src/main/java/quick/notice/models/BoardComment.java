package daily.coding.models;

public class BoardComment  {
  // 클래스 안에서 사용하기 위한 변수, Private는 class 외부에서 접근할 수 없는 변수
  private Long idx;
  private Long b_idx;
  private String user_id;
  private String content;
  private String writer;

	public Long getIdx() {
		return this.idx;
	}

	public void setIdx(Long idx) {
		this.idx = idx;
	}

	public Long getB_idx() {
		return this.b_idx;
	}

	public void setB_idx(Long b_idx) {
		this.b_idx = b_idx;
	}

	public String getUser_id() {
		return this.user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return this.writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}


  // 클래스 초기화
  public BoardComment () {
    super();
  }

  // 지역변수 초기화
  public BoardComment (Long idx, Long b_idx, String user_id, String content, String writer) {
    super();
    this.idx = idx;
    this.b_idx =b_idx;
    this.user_id = user_id;
    this.content = content;
    this.writer = writer;
  }

}