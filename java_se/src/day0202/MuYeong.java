package day0202;

import java.util.Random;

/**
 * throw : 사용자 정의 예외처리 클래스와 함께 사용. -사용자 정의 예외처리 클래스는 Java API에서 제공하는 예외처리 클래스가
 * 내가 구현하는 업무의 성격과 같은 이름으로 존재하지 않을 때 정의하여 만든다.
 * 
 */
public class MuYeong {

	public String walk() throws Exception {

		String msg = "";
		int flag = new Random().nextInt(4);// 0-초,1-중,2-고,3-대

		String[] title = { "초딩", "중딩", "고딩", "대딩" };

		msg = title[flag] + "님 흡연중 모른척 지나간다. ('' )( '')";
		if (flag == 0) {// 초딩이 흡연중이면 예외를 발생 시킨다.
//			try {//권장하지 않음
			throw new Exception(title[flag] + "님 지나친 흡연은 간에 좋지 않습니다. 금연부탁요");
//			} catch (Exception e) {
//				e.printStackTrace();
		}
		return msg;
	}

	public String walk2() throws TabaccoException {

		String msg = "";
		int flag = new Random().nextInt(4);// 0-초,1-중,2-고,3-대

		String[] title = { "초딩", "중딩", "고딩", "대딩" };

		if (flag == 0) {// 초딩이 흡연중이면 예외를 발생 시킨다.
			throw new TabaccoException(title[flag] + "님 지나친 흡연은 간에 좋지 않습니다. 금연부탁요");
		}
		// 예외가 발생하지 않았을 때만 반환 메시지를 생성한다.
		msg = title[flag] + "님 흡연중 모른척 지나간다. ('' )( '')";
		return msg;
	}

	public static void main(String[] args) {
		MuYeong my = new MuYeong();
		try {
//			String msg = my.walk();
			// 내부에서 try~catch를 하면 밖에서 봤을 때 method내부에서 어떤 문제가 발생할지 모른다.

			String msg = my.walk2();
			System.out.println(msg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
