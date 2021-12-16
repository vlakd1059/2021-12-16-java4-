
public class MemberVO {
	// class�� ������ ũ�� �ΰ����� ����
	// �ʵ� : �����͸� ������ �� �ִ� ����
	// ������ ������ �����غ���(�̸�, ����, Ű, ��ȥ����)
	private String name;
	private int age;
	private double height;
	private boolean marriage;

	// �⺻������
	// Ư¡ 1. ����Ÿ��X, 2. Ŭ�����̸��� ���� 3.��ü�� ȣ��
	public MemberVO(String name, int age, double height, boolean marriage) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.marriage = marriage;
	}

	// �޼ҵ� : ����� �����ϴ� �༮
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

	// ȣ�⹮ ->toString()
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", height=" + height + ", marriage=" + marriage + "]";
	}

}