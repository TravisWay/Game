package Game;

public abstract class Character {
	protected int health;
	protected int damage;

	
	
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public Character() {
		super();
	}

	public abstract int attack();
	

	public Character(int health, int damage) {
		super();
		this.health = health;
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int takehit() {
		// TODO Auto-generated method stub
		return 0;
	}

}
