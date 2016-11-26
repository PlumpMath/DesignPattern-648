package mediator.depts;

import mediator.Mediator;

public class Market extends Department {
	public Market(Mediator med) {
		super(med);
		med.register("market", this);
	}

	@Override
	public void selfAction() {
		System.out.println("�����г�");
	}

	@Override
	public void outAction() {
		System.out.println("�г������ܾ����������");
		med.command("development");
	}

}
