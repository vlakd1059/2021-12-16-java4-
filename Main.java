import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		MemberVO m1 = new MemberVO("박건하", 26, 188.5, false);
		MemberVO m2 = new MemberVO("박건하", 26, 188.5, false);
		MemberVO m3 = new MemberVO("박건하", 26, 188.5, false);
		MemberVO m4 = new MemberVO("박건하", 26, 188.5, false);
		MemberVO m5 = new MemberVO("박건하", 26, 188.5, false);
		MemberVO m6 = new MemberVO("박건하", 26, 188.5, false);
		MemberVO m7 = new MemberVO("박건하", 26, 188.5, false);
		MemberVO m8 = new MemberVO("박건하", 26, 188.5, false);
		MemberVO m9 = new MemberVO("박건하", 26, 188.5, false);

		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		list.add(m7);
		list.add(m8);
		list.add(m9);

		System.out.println(m1.toString());
		// set->데이터가 변할때 사용

	}

}
