package Beans;

import java.sql.Date;

public class Car {
	private int vehicleVO_ID;
	private String Created_By;
	private Date Created_Time;
	private String Updated_By;
	private Date Updted_By;
	
	
	public int getVehicleVO_ID() {
		return vehicleVO_ID;
	}
	public void setVehicleVO_ID(int vehicleVO_ID) {
		this.vehicleVO_ID = vehicleVO_ID;
	}
	public String getCreated_By() {
		return Created_By;
	}
	public void setCreated_By(String created_By) {
		Created_By = created_By;
	}
	public Date getCreated_Time() {
		return Created_Time;
	}
	public void setCreated_Time(Date created_Time) {
		Created_Time = created_Time;
	}
	public String getUpdated_By() {
		return Updated_By;
	}
	public void setUpdated_By(String updated_By) {
		Updated_By = updated_By;
	}
	public Date getUpdted_By() {
		return Updted_By;
	}
	public void setUpdted_By(Date updted_By) {
		Updted_By = updted_By;
	}
	
	
}
