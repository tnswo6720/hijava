package hijava.practice;

public class Str {

	public static void main(String[] args) {
		
		char c = '한'; //cf. char c = 65; or char c = '\uD55C';
		byte b= 'B';
		System.out.println(c);
		System.out.println((int)c); // cf. ( char)c or (char) b
		System.out.println(b);
		
		String str= "AB";
		System.out.println(str);
		System.out.println("AB".getBytes().length);
		System.out.println("AB한".getBytes().length);
		
 
		
		//처음에 c를 찍었더니 A가 그대로 나왔다
		//c를 int로 바꿀 수 있다 아스키코드로 정의된 걸로 나온다
		//b는 정수형이기 때문에 찍으면 무조건 숫자로 찍힌다
		
		//아스키 코드는 영어와 일부 특수문자 위주로 되어 있다
		//String은 아무리 길어도 문자가 찍힌다
		//sysout 적고 컨트럴 + 스페이스 system.out.println 단축키 
		//getByte는 캐릭터나 바이트는 싱글 코테이션이고 따움표 쌍따움표로 구별이 되고 String형태는 쌍따움표로 써야 한다.
		//AB를 getBytes 하면 byte로 잘게 쪼개놓은 것이다. 쪼개놓은 후에 바이트의 개수를 구하게 되는 것이다.
		//A는 65고 B는 66 65를 이진수로 66도 이진수로 하고 각각 8비트씩 쪼개서 몇 바이트가 나오는지 구하게 되는 것이다.
		//char는 2바이트이다
		//char에 한을 넣고 찍어보면
		//54620이 나온다 1바이트가 2의 8승이고 2바이트에 16비트인 2의 16승이 65536이다 
		//2바이트로 한이라는 글자를 충분히 표현한데 왜 3바이트로 잡았을까를 생각해보면
		//한글은 3바이트다 왜 그러냐면 유니코드이기 때문에 그렇게 유니코드는 기본적으로 UTF-8이고 한글이나 한자 일본어같이 영어권이 아닌 글자가
		//들어오면 UTF-8로 바꾸고 UTF-8은 가변적이라 1부터 4바이트까지이다. 기본적으로 자바는 고정값을 좋아해서 자바는 한글은 3바이트를 정했다.
		//영어는 1바이트. 이게 규칙이다.
	}

}
