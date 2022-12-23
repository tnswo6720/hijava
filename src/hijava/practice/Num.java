package hijava.practice;

public class Num {

	public static void main(String[] args) {
	    byte b= 1;
		short s= 1;
		int i= 1;
		//int i= 21474836478 // Out Of Range이다, Long으로 가야 된다
		long l = 1;
		
		System.out.println("0.1 + 0.2=" + (0.1+0.2));
		//0.1을 만나는 순간 더블로 바꾸고 0.2도 더블이고 괄호 전체가 더블이고 0.3이 나오면 좋겠는데
		//출력해보면 0.30000000000000으로 출력이 된다
		
		//long l= 21474836478 으로 해도 에러가 난다
		//자바는 숫자가 있으면 오른쪽을 숫자면은 int로 생각한다. int로 만든 다음에 long에 집어넣는다
		//그래서 이거를 4바이트로 만들지 말고 8바이트로 만들어주면 된다
		//long i =2147486478L;
		//L을 붙여준다
		
		//이렇게 해서 찍어보면 나온다
		//인트의 클래스형은 Integer이고 
		//롱의 클래스형은 Long dlrh 대문자를 쓰면 클래스형이 된다
		// Long의 제일 큰 값과 작은 값을 찍어보면 안 다.
		//찍어보고 나온 숫자보다 커지거나 작아지면 오버플로우라고 한다
		//느낌표가 뜨는 건 선언해놓고 안 썼다라는 표시이다
		//오버플로우가 뜨면 컴파일 자체가 안 된다
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		

	}

}
