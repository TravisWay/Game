package Game;

public class PlayerOne extends Character{

	public PlayerOne() {
		super();
	}

	

	public PlayerOne(int health, int damage) {
		setDamage(damage);
		setHealth(health);
		// TODO Auto-generated constructor stub
	}



	
	public int takehit(int damagedone) {
		// TODO Auto-generated method stub
		
		System.out.println(
				"You were hit. " + damagedone + "pts taken away. You have " + (health - damagedone) + " remaining");

		health = health - damagedone;
		setHealth(health);
		return health;

	}



	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return damage;
	}



}
