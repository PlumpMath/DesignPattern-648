package factorymethod.sample;
/**
 * ���崴������
* @ClassName: ChicagoPizzaStore
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����2:20:47
*
 */
public class ChicagoPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new ChicagoStyleCheesePizza();
		}else{
			return null;
		}
	}

}
