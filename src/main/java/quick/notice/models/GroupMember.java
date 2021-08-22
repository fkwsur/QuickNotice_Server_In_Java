package quick.notice.models;

public class GroupMember {
  // 클래스 안에서 사용하기 위한 변수, Private는 class 외부에서 접근할 수 없는 변수
  private Long idx;
  private String group_code;
  private String member;

	public Long getIdx() {
		return this.idx;
	}

	public void setIdx(Long idx) {
		this.idx = idx;
	}

	public String getGroup_code() {
		return this.group_code;
	}

	public void setGroup_code(String group_code) {
		this.group_code = group_code;
	}

	public String getMember() {
		return this.member;
	}

	public void setMember(String member) {
		this.member = member;
	}



  // 클래스 초기화
  public GroupMember() {
    super();
  }

  // 지역변수 초기화
  public GroupMember(Long idx, String group_code, String member) {
    super();
    this.idx = idx;
    this.group_code =group_code;
    this.member = member;
  }

  // 게터와 세터가 있어야 프라이빗 변수를 외부에서 가져다가 쓸 수 있다.
  // 겟은 데이터를 가져오는 것, 셋은 데이터를 넣어주는 것


}