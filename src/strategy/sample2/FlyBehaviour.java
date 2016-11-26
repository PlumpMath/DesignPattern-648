package strategy.sample2;
/**
 * ��Ϊ�ӿ�
* @ClassName: FlyBehaviour
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����12:42:12
*
 */
public interface FlyBehaviour {
	void fly();
}
/**
 * ��Ϊʵ����
* @ClassName: FlyNoWay
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����12:42:17
*
 */
class FlyNoWay implements FlyBehaviour{
	@Override
	public void fly() {
		System.out.println("�ҷɲ�����!");
	}
}
class FlyWithWings implements FlyBehaviour{
	@Override
	public void fly() {
		System.out.println("���ó���!");
	}
}
class FlyWithRocketPowered implements FlyBehaviour{
	@Override
	public void fly() {
		System.out.println("������������Ʒ���!");
	}
	
}