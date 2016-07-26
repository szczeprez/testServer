package com.springinpractice.ch04.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore; 


@Entity
@NamedQuery(name = "findDanePodstawoweByName", query = "from DanePodstawowe where imie= :name")
public class DanePodstawowe implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "imie")
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
	private Mieszkam mieszkam;
	
	@OneToOne
	private DodatkowaInformacja dodatkowaInformacja; 
	
	@OneToOne
	private Preferencje preferencje; 
	
	
	public DanePodstawowe() {
	}

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

	
	public Preferencje getPreferencje() {
		return preferencje;
	}

	public void setPreferencje(Preferencje preferencje) {
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
		return "DanePodstawowe [id=" + id + ", imie=" + imie + ", wojewodztwo=" + wojewodztwo + ", miejscowosc="
				+ miejscowosc + ", statusZwiazku=" + statusZwiazku + ", sylwetka=" + sylwetka + ", mieszkam=" + mieszkam
				+ ", dodatkowaInformacja=" + dodatkowaInformacja + ", preferencje=" + preferencje + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dodatkowaInformacja == null) ? 0 : dodatkowaInformacja.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((imie == null) ? 0 : imie.hashCode());
		result = prime * result + ((miejscowosc == null) ? 0 : miejscowosc.hashCode());
		result = prime * result + ((mieszkam == null) ? 0 : mieszkam.hashCode());
		result = prime * result + ((preferencje == null) ? 0 : preferencje.hashCode());
		result = prime * result + ((statusZwiazku == null) ? 0 : statusZwiazku.hashCode());
		result = prime * result + ((sylwetka == null) ? 0 : sylwetka.hashCode());
		result = prime * result + ((wojewodztwo == null) ? 0 : wojewodztwo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DanePodstawowe other = (DanePodstawowe) obj;
		if (dodatkowaInformacja == null) {
			if (other.dodatkowaInformacja != null)
				return false;
		} else if (!dodatkowaInformacja.equals(other.dodatkowaInformacja))
			return false;
		if (id != other.id)
			return false;
		if (imie == null) {
			if (other.imie != null)
				return false;
		} else if (!imie.equals(other.imie))
			return false;
		if (miejscowosc == null) {
			if (other.miejscowosc != null)
				return false;
		} else if (!miejscowosc.equals(other.miejscowosc))
			return false;
		if (mieszkam == null) {
			if (other.mieszkam != null)
				return false;
		} else if (!mieszkam.equals(other.mieszkam))
			return false;
		if (preferencje == null) {
			if (other.preferencje != null)
				return false;
		} else if (!preferencje.equals(other.preferencje))
			return false;
		if (statusZwiazku == null) {
			if (other.statusZwiazku != null)
				return false;
		} else if (!statusZwiazku.equals(other.statusZwiazku))
			return false;
		if (sylwetka == null) {
			if (other.sylwetka != null)
				return false;
		} else if (!sylwetka.equals(other.sylwetka))
			return false;
		if (wojewodztwo == null) {
			if (other.wojewodztwo != null)
				return false;
		} else if (!wojewodztwo.equals(other.wojewodztwo))
			return false;
		return true;
	}

}
