package hijava.practice;

public class Cbvr {
	int m = 2;
	

	public static void main(String[] args) {
//		int i = 1;
	//	System.out.println("i1=" + i);
        
		//change1(i);
	//	System.out.println("i2=" + i);
		
		Cbvr cb1 =new Cbvr();
		System.out.println("cb1=" + cb1.m);
		
		change2(cb1);
		System.out.println("cb2=" + cb1.m);
	}
	//Call by reference를 해보고 로봇의 이름은 Cbvr이고 클래스는 new 라고 해야 한다. 메모리에 만들고 싶을 때는 로봇을 살아나게 하고 싶을 때는 new라고한다
		//클래스를 로봇이라고 생각하자
		//어쨌든 int로 부르면 그릇이 전달되는 것이 아니고 그릇이 전달되는 것처럼 보여도 속지 말고 여기도 2가 날라간 것으로 생각하자
		//그리고 change2를 불러보자
		//그리고 출력을 해본다. m에 2가 들어가있어서 2가 찍힐 거 같다
		//m을 100으로 바꿀 것이다. 우유를 다시 담을 것이다
		//아까같이 value가 전달됐다면 2가 그대로 남아있지만 그릇이 같다면 바뀌어있을 것이다.
		//change2를 불렀을 때 얘가 그릇이 같구나라고 보면 되고 m이 int라고 해서 무조건 프리미티브타입이라고 생각하면 안 되고
		//뭐라고 생각해야 하냐면 Cbvr에 있는 그릇 속에 있는 m이라는 컵이다
		//Cbvr의 m이라는 놈은 new 해서 메모리 어딘가에 만들어졌다. 이름은 cb1이다 cb1에 그릇이 생긴 것이다. 클래스
		//그릇 속에 m이 있는 것이고 m은 cb1 속에 있는 것이고 m이 2이다. change2에 cb1을 전달했다는 건 클래스 타입이니
	   //뭐가 전달되냐면 그릇이 전달되는 것이다. 그릇 속에 있는 건 딸려가는 것이다. 큰 맥주 컵 안에 소주컵이 있으면 같이 딸려가는 것처럼
	   //소주컵에다가 100이라고 담은 것이다. 그리고 나서 cb1의 m에 100을 찍었으면 m이 100이 된다
	   //그래서 값이 전달되는 걸 Call By Value , 메모리에 어떤 주소가 전달되는 걸 Call By Reference라고 한다
	
	public static void change1(int x) {
		System.out.println("x=" +x);
		x= 100;
		
		//1이 온 것이고
	}
	
	public static void change2(Cbvr cb) {
		cb.m = 100;
	}

//1은 물이고 100은 우유로 가정 i은 물을 담는 컵
	//change1로 전달할 때 컵을 전달을 했다 x자리에 i가 들어왔으니까
	//컵에다 100을 넣었으니 i가 100이 되어 있어야 되는 안 바뀌었다
	//i라는 값은 물이라고 해서 선언을 한 것이다 i는 컵이 전달된 게 아니고 1이 전달되었다
	//왜냐면 int 니까 , 소문자로 시작하는 건 다 Primitive 타입이니까
	//Primitive 타입은 값이 간다 그래서 Call by Value이다.
	//그래서 1이 간다
	//그래서 처음에 i는 물이었고 1이었고
	//그래서 x는 물을 받았고
	//그래서 i2도 물을 받았다
	
	
}
