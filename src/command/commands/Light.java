package command.commands;
/**
 * Receiver
* @ClassName: Light
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����4:12:17
*
 */
public class Light implements ElectricAlliances{

	@Override
	public void on() {
		System.out.println("�򿪵��");
	}

	@Override
	public void off() {
		System.out.println("�رյ��");
	}
	
}
