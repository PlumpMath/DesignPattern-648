package flyweight;

public class Client {
	public static void main(String[] args) {
		Chess c1 = ChessFactory.createChess("��");
		Chess c2 = ChessFactory.createChess("��");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1 == c2);
		//��ͬ����
		c1.display(new Coordinate(10, 10));
		c2.display(new Coordinate(20, 20));
	}

}
