package decorator.sample1;
/**
 * װ�νӿ�
* @ClassName: SuperCar
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����1:30:57
*
 */
public class SuperCar implements ICar {
	private ICar car;
	public SuperCar(ICar car) {
		this.car = car;
	}
	
	@Override
	public void move() {
		car.move();
	}
}
