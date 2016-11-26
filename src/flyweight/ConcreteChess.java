package flyweight;
/**
 * ������Ԫ��(���Թ���Ĳ���)
* @ClassName: ConcreteChess
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����10:24:33
*
 */
public class ConcreteChess implements Chess{
	private String color;
	public ConcreteChess(String color) {
		this.color = color;
	}
	
	@Override
	public void display(Coordinate c) {
		System.out.println("��"+color+"����"+c.getX()+","+c.getY());
	}

	@Override
	public String getColor() {
		return color;
	}

}
