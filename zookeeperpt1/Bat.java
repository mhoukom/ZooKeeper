package zookeeperpt1;

public class Bat extends Mammal {
	
	public Bat() {
		this.adjustEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("Flap Flap Flap!");
		this.adjustEnergyLevel(-50);
	}
	
	public void eatHumans() {
		this.adjustEnergyLevel(25);
	}
	
	public void attackTown() {
		System.out.println("Snap Crackle Pop!");
		this.adjustEnergyLevel(-100);
	}

}
