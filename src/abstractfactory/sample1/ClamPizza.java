package abstractfactory.sample1;

import abstractfactory.sample1.factory.PizzaIngredientFactory;
/**
 * �����Ʒ��
* @ClassName: ClamPizza
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����2:53:28
*
 */
public class ClamPizza extends Pizza {
	private PizzaIngredientFactory factory;

	public ClamPizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}
	
	/**
	 * ������һ��ԭ��ȡ���ڴ����ԭ�Ϲ���������
	 * @Title: prepare
	 * @Description: TODO  
	 * @see abstractfactory.sample1.Pizza#prepare()
	 */
	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		clams = factory.createClams();
	}

}
