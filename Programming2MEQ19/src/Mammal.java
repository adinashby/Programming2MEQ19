
public class Mammal extends Animal {
	private String furType;
	
	public Mammal() {
		
	}
	
	public Mammal(String furType) {
		super("P", "Male");
		this.furType = furType;
	}
	
	public Mammal(String name, String gender, String furType) {
		super(name, gender);
		this.furType = furType;
	}

	public String getFurType() {
		return furType;
	}

	public void setFurType(String furType) {
		this.furType = furType;
	}
}
