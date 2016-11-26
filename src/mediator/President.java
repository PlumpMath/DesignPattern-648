package mediator;

import java.util.HashMap;
import java.util.Map;

import mediator.depts.Department;

public class President implements Mediator {

	private Map<String, Department> map = new HashMap<>();

	// ������жԷ�����
	@Override
	public void register(String dname, Department dept) {
		map.put(dname, dept);
	}

	// ���Դ����������������ݲ������øò��ŵĲ�ͬ����
	@Override
	public void command(String dname) {
		Department dept = map.get(dname);
		dept.selfAction();
	}

}
