package decorator.sample2;
/**
 * ����װ����
* @ClassName: Mocha
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����1:41:43
*
 */
public class Mocha extends CondimentDecorator {
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+" ,Mocha";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
