package zookeeperpt1;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		this.adjustEnergyLevel(100);
	}
	
	public void throwSomething() {
		System.out.println("I am a Gorilla and I threw something!");
		this.adjustEnergyLevel(-5);
	}
	
	public void eatBananas() {
		System.out.println("I am a Gorilla and I am satisfied!");
		this.adjustEnergyLevel(10);
	}
	
	public void climb() {
		System.out.println("I am a Gorilla and I have climbed a tree!");
		this.adjustEnergyLevel(-10);
	}
}
