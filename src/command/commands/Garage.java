package command.commands;
/**
 * Receiver
* @ClassName: Garage
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����4:12:06
*
 */
public class Garage implements ElectricAlliances {

	@Override
	public void on() {
		System.out.println("�򿪳�����");
	}

	@Override
	public void off() {
		System.out.println("�رճ�����");
	}

}
