package abstractfactory.sample1;
/**
 * �����߳�����
* @ClassName: PizzaStore
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����2:10:45
*
 */
public abstract class PizzaStore {
	public Pizza orderPizza(String type){
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	protected abstract Pizza createPizza(String type);
}
