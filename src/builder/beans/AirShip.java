package builder.beans;

public class AirShip {
	private OrbitalModule orbitalModule;
	private Engine engine;
	private EscapeTower escapeTower;
	
	public AirShip(OrbitalModule orbitalModule, Engine engine, EscapeTower escapeTower) {
		super();
		this.orbitalModule = orbitalModule;
		this.engine = engine;
		this.escapeTower = escapeTower;
	}
	
	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}

	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public EscapeTower getEscapeTower() {
		return escapeTower;
	}

	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}

	public void launch() {
		System.out.println("���䣡");
	}

}
