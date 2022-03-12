package note220307;

public class Example002 {

	public static void main(String[] args) {
		/*
		 * 상수: 변하지 않는 값 자바 프로그램에서는 한 번 초기화를 한 후에는 변경되지 않는 것을 의미
		 */
		final int number = 1;// final은 최종값임을 의미
//		number=2;-->err

		/*
		 * 지역 변수 사용시 주의사항-->반드시 초기화가 돼야함.
		 * 변수명 규칙
		 * 		1. 한글X(가능은 하나 비추)
		 * 		2. 언더바
		 * 		3. 숫자는 영문자 뒤
		 * 		4. 특수문자X($예외)
		 * 		5. 예약어 사용X
		 * 		+상수명은 대문자로 작명
		 */
		
		String str1="기차"+123+45+"출발";//-->기차12345출발
		String str2=123+45+"기차"+"출발";//-->168기차출발
		String str3="기차"+"출발"+(123+45);//-->기차출발168
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
