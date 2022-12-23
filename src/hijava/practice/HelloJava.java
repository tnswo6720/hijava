package hijava.practice;

/**
 * 첫번째 자바 실습
 * @author ghd6
 * @update say함수 추가
 * 
 */

public class HelloJava {
	String message = "Hello world";

	public static void main(String[] args) {
//		Hello 자바에게 say 라는 명령을 내림
		HelloJava.say("Hi~");
		System.out.println("Hello Java!!");

	}

	public static void say(String msg) {
		System.out.println(msg);
	}

}
