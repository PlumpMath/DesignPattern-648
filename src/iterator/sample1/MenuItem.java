package iterator.sample1;
/**
 * ��ͺ���͵Ĳ˵����ò�ͬ�����ݽṹ�洢������ʹ���ߣ��д���ϣ����ͳһ�ķ�ʽ������˵�
 * 
* @ClassName: MenuItem
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����5:17:13
*
 */
public class MenuItem {
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
