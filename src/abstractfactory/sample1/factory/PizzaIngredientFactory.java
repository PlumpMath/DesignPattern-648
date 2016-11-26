package abstractfactory.sample1.factory;

import abstractfactory.sample1.product.product1.Dough;
import abstractfactory.sample1.product.product2.Clams;
import abstractfactory.sample1.product.product3.Sauce;

/**
 * ���󹤳�
* @ClassName: PizzaIngredientFactory
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����2:42:40
*
 */
public interface PizzaIngredientFactory {
	Dough createDough();
	Sauce createSauce();
	Clams createClams();
}
