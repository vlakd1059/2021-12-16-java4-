
public class MemberVO {
	// class의 구조는 크게 두가지로 정의
	// 필드 : 데이터를 저장할 수 있는 변수
	// 건하의 정보를 저장해보자(이름, 나이, 키, 결혼유무)
	private String name;
	private int age;
	private double height;
	private boolean marriage;

	// 기본생성자
	// 특징 1. 리턴타입X, 2. 클래스이름과 같음 3.객체를 호출
	public MemberVO(String name, int age, double height, boolean marriage) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.marriage = marriage;
	}

	// 메소드 : 기능을 실행하는 녀석
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public boolean isMarriage() {
		return marriage;
	}

	// 호출문 ->toString()
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", height=" + height + ", marriage=" + marriage + "]";
	}

}