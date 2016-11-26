package templatemethod.sample1;

/**
 * ��Ϳ��ȶ�����CaffeineBeverage���������ǵ����������в�������ͬ�ģ������ǲ�ͬ�ģ����Ҳ�����������ͬ��
* @ClassName: CaffeineBeverage
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����4:56:51
*
 */
public abstract class CaffeineBeverage {
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	/**
	 * �����������ǲ�ͬ��
	 * @Title: brew
	 * @Description: TODO
	 * @param    
	 * @return void   
	 * @throws
	 */
	abstract void brew();
	abstract void addCondiments();
	
	
	void boilWater(){
		System.out.println("Boiling water");
	}
	
	void pourInCup(){
		System.out.println("Pouring into cup");
	}
	
}
