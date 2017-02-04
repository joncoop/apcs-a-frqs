
public class College {
	private String name;
	private String region;
	private int tuition;
	
	public College(String name, String region, int tuition) {
		this.name = name;
		this.region = region;
		this.tuition = tuition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getTuition() {
		return tuition;
	}

	public void setTuition(int tuition) {
		this.tuition = tuition;
	}

	public String toString() {
		return "College [name=" + name + ", region=" + region + ", tuition=" + tuition + "]";
	}
}
