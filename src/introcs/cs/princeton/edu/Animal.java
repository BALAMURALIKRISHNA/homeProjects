package introcs.cs.princeton.edu;

public abstract class Animal {
	
	private String name;

	/**
	 * @param name
	 */
	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



}
