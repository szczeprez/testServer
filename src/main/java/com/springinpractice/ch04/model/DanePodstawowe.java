package com.springinpractice.ch04.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name = "findDanePodstawoweByName", query = "from DanePodstawowe where name= :name")
public class DanePodstawowe {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "Imie")
	private String imie;
	@OneToOne
	private Wojewodztwo wojewodztwo;
	@OneToOne
	private Miejscowosc miejscowosc;
	@OneToOne
	private StatusZwiazku statusZwiazku;
	@OneToOne
	private Sylwetka sylwetka;
	@OneToOne
	@JoinColumn(name = "statusMieszkiowy")
	private Mieszkam mieszkam;
	@OneToOne
	private DodatkowaInformacja dodatkowaInformacja; 
	
	@OneToOne
	private Preferencje preferencje; 
	
	
	

	public DanePodstawowe(String imie, Wojewodztwo wojewodztwo, Miejscowosc miejscowosc, StatusZwiazku statusZwiazku,
			Sylwetka sylwetka, Mieszkam mieszkam, DodatkowaInformacja dodatkowaInformacja, Preferencje preferencje) {
		super();
		this.imie = imie;
		this.wojewodztwo = wojewodztwo;
		this.miejscowosc = miejscowosc;
		this.statusZwiazku = statusZwiazku;
		this.sylwetka = sylwetka;
		this.mieszkam = mieszkam;
		this.dodatkowaInformacja = dodatkowaInformacja;
		this.preferencje = preferencje;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public Wojewodztwo getWojewodztwo() {
		return wojewodztwo;
	}

	public void setWojewodztwo(Wojewodztwo wojewodztwo) {
		this.wojewodztwo = wojewodztwo;
	}

	public Miejscowosc getMiejscowosc() {
		return miejscowosc;
	}

	public void setMiejscowosc(Miejscowosc miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public StatusZwiazku getStatusZwiazku() {
		return statusZwiazku;
	}

	public void setStatusZwiazku(StatusZwiazku statusZwiazku) {
		this.statusZwiazku = statusZwiazku;
	}

	public Sylwetka getSylwetka() {
		return sylwetka;
	}

	public void setSylwetka(Sylwetka sylwetka) {
		this.sylwetka = sylwetka;
	}

	public Mieszkam getMieszkam() {
		return mieszkam;
	}

	public void setMieszkam(Mieszkam mieszkam) {
		this.mieszkam = mieszkam;
	}
	

	public DodatkowaInformacja getDodatkowaInformacja() {
		return dodatkowaInformacja;
	}

	public void setDodatkowaInformacja(DodatkowaInformacja dodatkowaInformacja) {
		this.dodatkowaInformacja = dodatkowaInformacja;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DanePodstawowe [id=");
		builder.append(id);
		builder.append(", imie=");
		builder.append(imie);
		builder.append(", wojewodztwo=");
		builder.append(wojewodztwo);
		builder.append(", miejscowosc=");
		builder.append(miejscowosc);
		builder.append(", statusZwiazku=");
		builder.append(statusZwiazku);
		builder.append(", sylwetka=");
		builder.append(sylwetka);
		builder.append(", mieszkam=");
		builder.append(mieszkam);
		builder.append(", dodatkowaInformacja=");
		builder.append(dodatkowaInformacja);
		builder.append("]");
		return builder.toString();
	}

}
