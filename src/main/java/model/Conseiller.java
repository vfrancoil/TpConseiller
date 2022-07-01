package model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conseiller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String firstName;
	private LocalDate dob;
	private int salary;
	private String numConseiller;
	private LocalDate dateCreation;

	public Conseiller(String name, String firstName, LocalDate dob, int salary, String numConsiller,
			LocalDate dateCreation) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.dob = dob;
		this.salary = salary;
		this.numConseiller = numConsiller;
		this.dateCreation = dateCreation;
	}
	
	public Conseiller() {
		
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

	public String getNumConseiller() {
		return numConseiller;
	}

	public void setNumConseiller(String numConsiller) {
		this.numConseiller = numConsiller;
	}

	public LocalDate getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Conseiller [id=" + id + ", name=" + name + ", firstName=" + firstName + ", dob=" + dob + ", salary="
				+ salary + ", numConsiller=" + numConseiller + ", dateCreation=" + dateCreation + "]";
	}

	
}
