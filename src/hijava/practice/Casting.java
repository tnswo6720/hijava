package hijava.practice;

public class Casting {

	public static void main(String[] args) {
		byte b = 1;
		int i = b;
		long l = 1234567;
		//b가 1바이트고 int가 4바이트라 에러없이 된다
		
		System.out.println( i + l);
		//i는 int로 잡혔다
		//b= i;
		
		//큰 놈이 작아져서 에러가 난다

	}

}
