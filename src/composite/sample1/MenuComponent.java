package composite.sample1;
/**
 * �в˵��Ͳ˵�����ǵĹ�ͬ������MenuComponent
 * Waitress����ͬ����ʽ�����ݲ˵��Ͳ˵���
* @ClassName: MenuComponent
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����7:49:51
* 
 */
public abstract class MenuComponent {
	
	/**
	 * �������������ڽ�㣨�������Ҷ���Ĳ���
	 * @Title: add
	 * @Description: TODO
	 * @param @param menuComponent   
	 * @return void   
	 * @throws
	 */
	public void add(MenuComponent menuComponent){
		
	}
	
	public void remove(MenuComponent menuComponent){
		
	}
	
	public MenuComponent getChild(int index){
		return null;
	}
	
	/**
	 * ����������Ҷ�ӵĲ���
	 * @Title: getName
	 * @Description: TODO
	 * @param @return   
	 * @return String   
	 * @throws
	 */
	
	public String getName(){
		return null;
	}
	
	public String getDescription(){
		return null;
	}
	
	public double getPrice(){
		return 0;
	}
	
	public boolean isVegetarian(){
		return false;
	}
	
	public void print(){
		
	}
	
}
