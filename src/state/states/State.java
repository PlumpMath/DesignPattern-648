package state.states;
/**
 * ʵ��һ���ǹ���
 * û��25�� --Ͷ��--> ��25��Ǯ --ת������--> �۳��ǹ� --�����ǹ�-->�ǹ�����<0  �ǹ�����
 * 		  <--�˻�25��Ǯ--		                                                                 �ǹ�����>0  û��25��Ǯ
 * 	  	  
* @ClassName: State
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����8:42:04
*
 */
public interface State {
	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
}
