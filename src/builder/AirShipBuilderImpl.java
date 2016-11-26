package builder;

import builder.beans.Engine;
import builder.beans.EscapeTower;
import builder.beans.OrbitalModule;

public class AirShipBuilderImpl implements AirShipBuilder {
	@Override
	public OrbitalModule createOrbitalModule() {
		System.out.println("�����������....");
		return new OrbitalModule("New Song");
	}

	@Override
	public Engine createEngine() {
		System.out.println("������������....");
		return new Engine("New Song");
	}

	@Override
	public EscapeTower createEscapeTower() {
		System.out.println("������������...");
		return new EscapeTower("New Song");
	}
}
