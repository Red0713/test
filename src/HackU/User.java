package j4.HackU;

import java.util.ArrayList;
import java.util.List;

public class User {
	String username, gender, color;
	ArrayList<String> Carlist;
	Boolean MiniCar, Sedan, SUV;
	long Money;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public ArrayList<String> getCarlist() {
		return Carlist;
	}
	public void setCarlist(ArrayList<String> carlist) {
		Carlist = carlist;
	}
	public Boolean getMiniCar() {
		return MiniCar;
	}
	public void setMiniCar(Boolean miniCar) {
		MiniCar = miniCar;
	}
	public Boolean getSedan() {
		return Sedan;
	}
	public void setSedan(Boolean sedan) {
		Sedan = sedan;
	}
	public Boolean getSUV() {
		return SUV;
	}
	public void setSUV(Boolean sUV) {
		SUV = sUV;
	}
	public long getMoney() {
		return Money;
	}
	public void setMoney(long money) {
		Money = money;
	}
}
