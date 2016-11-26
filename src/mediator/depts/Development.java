package mediator.depts;

import mediator.Mediator;

public class Development extends Department {
	public Development(Mediator med) {
		super(med);
		med.register("development", this);
	}

	@Override
	public void selfAction() {
		System.out.println("�з���Ʒ");
	}

	@Override
	public void outAction() {
		System.out.println("�з������ܾ����������");

	}

}
