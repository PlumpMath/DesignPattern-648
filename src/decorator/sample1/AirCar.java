package decorator.sample1;
/**
 * ����װ����
* @ClassName: AirCar
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����1:32:10
*
 */
public class AirCar extends SuperCar {

	public AirCar(ICar car) {
		super(car);
	}
	//��������
	public void fly(){
		System.out.println(this.getClass().getSimpleName()+" ����");
	}
	@Override
	public void move() {
		super.move();
		fly();
	}
}
