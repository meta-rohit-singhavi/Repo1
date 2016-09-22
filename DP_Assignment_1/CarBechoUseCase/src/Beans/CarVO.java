package Beans;

public class CarVO {

	
	private int vehicleVO_ID;
	private boolean ac;
	private boolean powerSteering;
	private boolean accessoryKit;
	
	public int getVehicleVO_ID() {
		return vehicleVO_ID;
	}
	public void setVehicleVO_ID(int vehicleVO_ID) {
		this.vehicleVO_ID = vehicleVO_ID;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public boolean isPowerSteering() {
		return powerSteering;
	}
	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}
	public boolean isAccessoryKit() {
		return accessoryKit;
	}
	public void setAccessoryKit(boolean accessoryKit) {
		this.accessoryKit = accessoryKit;
	}
	
}
