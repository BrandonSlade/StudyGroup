package SS040919;

public class Assassin extends Warrior{
	
	private String weapon;

	public Assassin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Assassin(String name, String clan, String weapon) {
		super(name,clan);
		this.weapon = weapon;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((weapon == null) ? 0 : weapon.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Assassin other = (Assassin) obj;
		if (weapon == null) {
			if (other.weapon != null)
				return false;
		} else if (!weapon.equals(other.weapon))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "Assassin [weapon=" + weapon + "]";
	}
	
	
	

}
