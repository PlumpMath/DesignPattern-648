package bridge.dimension2;

import bridge.dimension1.Brand;
/**
 * �ڶ���ά�ȣ����е�һ��ά�ȵ�����
* @ClassName: Computer
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����10:01:47
*
 */
public class Computer {
	protected Brand brand;
	public Computer(Brand brand) {
		this.brand = brand;
	}
	
	public void sale() {
		brand.sale();
	}

}
