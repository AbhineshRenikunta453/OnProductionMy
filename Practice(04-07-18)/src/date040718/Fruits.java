package date040718;

public class Fruits {

	private String fruitname;
	private int cost;
	private String store_name;

	public Fruits(String fruitname, int cost, String store_name) {
		super();
		this.fruitname = fruitname;
		this.cost = cost;
		this.store_name = store_name;
	}

	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getFruitname() {
		return fruitname;
	}

	public int getCost() {
		return cost;
	}

	public String getStore_name() {
		return store_name;
	}

	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cost;
		result = prime * result + ((fruitname == null) ? 0 : fruitname.hashCode());
		result = prime * result + ((store_name == null) ? 0 : store_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruits other = (Fruits) obj;
		if (cost != other.cost)
			return false;
		if (fruitname == null) {
			if (other.fruitname != null)
				return false;
		} else if (!fruitname.equals(other.fruitname))
			return false;
		if (store_name == null) {
			if (other.store_name != null)
				return false;
		} else if (!store_name.equals(other.store_name))
			return false;
		return true;
	}

	
}
