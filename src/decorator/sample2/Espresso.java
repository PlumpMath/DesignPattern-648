package decorator.sample2;
/**
 * ����������
* @ClassName: Espresso
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����1:40:09
*
 */
public class Espresso extends Beverage {
	public Espresso() {
		this.desc = "Espresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}
	

}
