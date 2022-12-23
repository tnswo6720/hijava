package hijava.practice;

public class N {

	int x= 10;
	int y= 20;
	
	public void swap() {
		int t =x;
		x= y;
		y= t;
		//t에 x를 담고 t는 10이 됐다
		// x에는 y를 담는다 x가 10이 20으로 바뀌었다
		//y는 아직 20이다
		//y에는 10이 담겨있는 10을 담는다
	}
	public static void main(String[] args) {
		N n = new N();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
		n.swap();
		System.out.println("-----------------------");
		System.out.println("x +" + n.x);
		System.out.println("y + " + n.y);
//x에 메모리 공간이 있고 y에도 메모리 공간이 있고 이거는 N이라고 하는 명패를 달고 있는 N 클래스의 타입이다
		//이거를 값을 바꾸고 싶으면 x는 10 y는 20 되어 있는데 y값을 x에 줘버리면 10이 손실되니 10을 어디에 담아놔야한다
		//그래서 a에 x를 하면 a=x;가 되고 a가 10이 되고 y를 x에 담으면 x는 10이 없어지고 20이 된다
		//y는 아직 20이 남아있고 y에 a를 주면 y가 10이 된다
		
		//컵이 두 개가 있는데 x에는 물이 있고 y에는 우유가 들어있고 물과 우유를 바꾸고 싶으면 중간에 하나의 컵이 더 필요하다
		//물이든 우유든 뭔가를 하나의 컵에 담아놓은 상태로 해서 하면 바뀐다 현실세계랑 똑같다
	}

}
