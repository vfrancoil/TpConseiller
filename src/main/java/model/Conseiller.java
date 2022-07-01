package model;

import java.time.LocalDate;

public class Conseiller {
	private int id;
	private String name;
	private String firstName;
	private LocalDate dob;
	private int salary;
	private String numConsiller;
	private LocalDate dateCreation;

	public Conseiller(int id, String name, String firstName, LocalDate dob, int salary, String numConsiller,
			LocalDate dateCreation) {
		super();
		this.id = id;
		this.name = name;
		this.firstName = firstName;
		this.dob = dob;
		this.salary = salary;
		this.numConsiller = numConsiller;
		this.dateCreation = dateCreation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getNumConsiller() {
		return numConsiller;
	}

	public void setNumConsiller(String numConsiller) {
		this.numConsiller = numConsiller;
	}

	public LocalDate getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}

}
