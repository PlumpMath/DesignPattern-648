package observer.sample2;
/**
 * ����վ
* @ClassName: Subject
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����1:11:12
*
 */
public interface Subject {
	void registerObserver(Observer_2 o);
	void removeObserver(Observer_2 o);
	void notifyObservers();
}
