package mediator.depts;

import mediator.Mediator;

public abstract class Department {
	protected Mediator med;
	public Department(Mediator med) {
		this.med = med;
	}
	//�Լ���
	public abstract void selfAction();
	//������
	public abstract void outAction();
}
