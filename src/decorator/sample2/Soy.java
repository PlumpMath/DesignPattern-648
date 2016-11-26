package decorator.sample2;
/**
 * ����װ����
* @ClassName: Soy
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����1:44:21
*
 */
public class Soy extends CondimentDecorator {
	private Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()+",Soy";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}
}
