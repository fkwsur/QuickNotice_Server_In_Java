package quick.notice.models;

public class Calendar {
  // 클래스 안에서 사용하기 위한 변수, Private는 class 외부에서 접근할 수 없는 변수
  private Long idx;
  private String event_day;
  private String user_id;
  private String title;
  private String content;
  private String category;
  private String time;
  private String alarm;
  private String color;
  private String group_code;

	public Long getIdx() {
		return this.idx;
	}

	public void setIdx(Long idx) {
		this.idx = idx;
	}

	public String getEvent_day() {
		return this.event_day;
	}

	public void setEvent_day(String event_day) {
		this.event_day = event_day;
	}

	public String getUser_id() {
		return this.user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAlarm() {
		return this.alarm;
	}

	public void setAlarm(String alarm) {
		this.alarm = alarm;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGroup_code() {
		return this.group_code;
	}

	public void setGroup_code(String group_code) {
		this.group_code = group_code;
	}



  // 클래스 초기화
  public Calendar() {
    super();
  }

  // 지역변수 초기화
  public Calendar(Long idx, String event_day, String user_id, String title, String content, String category, String time, String alarm, String color, String group_code) {
    super();
    this.idx = idx;
    this.event_day =event_day;
    this.user_id = user_id;
    this.title = title;
    this.content = content;
    this.category = category;
    this.time = time;
    this.alarm = alarm;
    this.color = color;
    this.group_code = group_code;
  }

  // 게터와 세터가 있어야 프라이빗 변수를 외부에서 가져다가 쓸 수 있다.
  // 겟은 데이터를 가져오는 것, 셋은 데이터를 넣어주는 것


}