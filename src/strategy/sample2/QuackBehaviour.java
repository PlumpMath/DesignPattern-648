package strategy.sample2;
/**
 * ��Ϊ�ӿ�
* @ClassName: QuackBehaviour
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����12:41:32
*
 */
public interface QuackBehaviour {
	void quack();
}
/**
 * ��Ϊʵ����
* @ClassName: Quack
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����12:41:41
*
 */
class Quack implements QuackBehaviour{
	@Override
	public void quack() {
		System.out.println("����!");
	}
}
class MuteQuack implements QuackBehaviour{
	@Override
	public void quack() {
		System.out.println("�����~~~~");
	}
}
