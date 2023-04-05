public class Commander {
    protected int health;
    protected int leadership;
    protected int building_speed;
	// protected int shield;
	// protected int people_trust;

	// public int getShield() {
	// 	return this.shield;
	// }

	// public void setShield(int shield) {
	// 	this.shield = shield;
	// }

	// public int getPeople_trust() {
	// 	return this.people_trust;
	// }

	// public void setPeople_trust(int people_trust) {
	// 	this.people_trust = people_trust;
	// }

	public int getHealth() {
		return this.health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLeadership() {
		return this.leadership;
	}

	public void setLeadership(int leadership) {
		this.leadership = leadership;
	}

	public int getBuilding_speed() {
		return this.building_speed;
	}

	public void setBuilding_speed(int building_speed) {
		this.building_speed = building_speed;
	}


    //사령관의 체력, 리더쉽, 건설 속도 능력치
    public Commander(int health, int leadership, int building_speed){
        this.health = health;
        this.leadership = leadership;
        this.building_speed = building_speed;
	
    }
}