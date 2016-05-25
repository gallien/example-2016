package de.htwberlin.mae.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Nutzer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long nutzerId;

	private String name;
	
	@OneToMany(mappedBy = "nutzer")
	private List<Warenkorb> warenkorb;
	
	public Nutzer() {}
	
	public Nutzer(String name) {
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNutzerId() {
		return nutzerId;
	}

	public void setNutzerId(long nutzerId) {
		this.nutzerId = nutzerId;
	}
	
	public List<Warenkorb> getWarenkorb() {
		return warenkorb;
	}

	public void setWarenkorb(List<Warenkorb> warenkorb) {
		this.warenkorb = warenkorb;
	}
	
}

