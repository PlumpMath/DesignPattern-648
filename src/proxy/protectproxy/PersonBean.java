package proxy.protectproxy;
/**
 * �������Ҫ��ԣ�ÿ���˿����޸��Լ������ԣ������ܶ��Լ�����
 * �����˿��Զ��Լ�����
* @ClassName: PersonBean
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����9:29:44
*
 */
public interface PersonBean {
	String getName();
	String getGender();
	String getInterests();
	int getHotOrNotRating();
	
	void setName(String name);
	void setGender(String gender);
	void setInterests(String interests);
	void setHotOrNotRating(int rating);
}
