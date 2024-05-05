package myMapTop;

import java.util.Objects;

public class StudentExercise2 {
	private String name;
	private int place;
	public StudentExercise2(String name, int place) {
		super();
		this.name = name;
		this.place = place;
	}
	public StudentExercise2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPlace() {
		return place;
	}
	public void setPlace(int place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "StudentExercise2 [name=" + name + ", place=" + place + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, place);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentExercise2 other = (StudentExercise2) obj;
		return Objects.equals(name, other.name) && place == other.place;
	}
	
	
}
