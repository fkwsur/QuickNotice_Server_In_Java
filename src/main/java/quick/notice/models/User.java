package quick.notice.models;

public class User {
  // 클래스 안에서 사용하기 위한 변수, Private는 class 외부에서 접근할 수 없는 변수
  private Long idx;
  private String id;
  private String password;


  // 클래스 초기화
  public User() {
    super();
  }

  // 지역변수 초기화
  public User(Long idx, String id, String password) {
    super();
    this.idx = idx;
    this.id =id;
    this.password = password;
  }

  // 게터와 세터가 있어야 프라이빗 변수를 외부에서 가져다가 쓸 수 있다.
  // 겟은 데이터를 가져오는 것, 셋은 데이터를 넣어주는 것
  public Long getIdx() {
    return idx;
  }

  public String getId() {
    return id;
  }

  public String getPassword() {
    return password;
  }
  // void 리턴값을 반환하지 않는 것
  public void setIdx(Long idx){
    this.idx = idx;
  }

  public void setId(String id){
    this.id = id;
  }

  public void setPassword(String password){
    this.password = password;
  }

}