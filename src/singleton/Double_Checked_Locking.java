package singleton;
/**
 * ˫�ؼ�����
* @ClassName: Double_Checked_Locking
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����3:55:57
* ʹ����volatile�����󣬾��ܱ�֤���з�����ϵ��happens-before relationship����
* ����volatile����_instance�����е�д��write���������з����ڶ���read��
 */
public class Double_Checked_Locking {
	private static volatile Double_Checked_Locking instance;
	private Double_Checked_Locking(){
		
	}
	
	public static Double_Checked_Locking getInstance(){
		if(instance == null){
			synchronized (Double_Checked_Locking.class) {
				if(instance == null){
					instance = new Double_Checked_Locking();
				}
			}
		}
		return instance;
	}
	
	
}
