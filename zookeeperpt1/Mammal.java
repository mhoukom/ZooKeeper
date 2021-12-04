package zookeeperpt1;

public class Mammal {
	private int energyLevel;

	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
	
	public void adjustEnergyLevel(int valueToAdjust) {
		this.energyLevel += valueToAdjust;
	}
}

	