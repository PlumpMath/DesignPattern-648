package decorator.sample1;
/**
 * ��װ�ζ���
* @ClassName: Car
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����1:30:36
*
 */
public class Car implements ICar{

	@Override
	public void move() {
		System.out.println(this.getClass().getSimpleName()+" ��½������ʻ");
	}

}
