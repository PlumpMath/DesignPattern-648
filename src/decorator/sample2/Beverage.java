package decorator.sample2;
/**
 * �ǰͿ˿���  �����Ϻ͵���
 * �����Ǳ�װ����
 * ��ͬ�̳���Beverage��
 * 
 * ������װ����
 * ��ͬʵ��cost����
 * 
* @ClassName: Beverage
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����1:36:30
*
 */
public abstract class Beverage {
	protected String desc = "Unknown Beverage";
	
	public String getDescription(){
		return this.desc;
	}
	public abstract double cost();
}

