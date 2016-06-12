package com.springinpractice.ch04.domain;

import java.util.List;


public class Danepodstawowe {

	String imie;

	List<Wojewodztwo> wojewodztwo;

	List<City> miejscowosc;

	List<String> statusZwiazku;

	List<String> sylwetka;

	List<String> mieszkam;

	String dodatkowaInformacja;

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public List<Wojewodztwo> getWojewodztwo() {
		return wojewodztwo;
	}

	public void setWojewodztwo(List<Wojewodztwo> wojewodztwo) {
		this.wojewodztwo = wojewodztwo;
	}
 

	public void setMiejscowosc(List<City> miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public List<String> getStatusZwiazku() {
		return statusZwiazku;
	}

	public void setStatusZwiazku(List<String> statusZwiazku) {
		this.statusZwiazku = statusZwiazku;
	}

	public List<String> getSylwetka() {
		sylwetka.add("tajemnica");
		sylwetka.add("szczupła");
		sylwetka.add("średniej budowy");
		sylwetka.add("tęga");
		sylwetka.add("umięśniona");
		sylwetka.add("seksowna");
		return sylwetka;
	}

	public void setSylwetka(List<String> sylwetka) {
		this.sylwetka = sylwetka;
	}

	public List<String> getMieszkam() {
		mieszkam.add("sam/a");
		mieszkam.add("z rodzicami");
		mieszkam.add("w akademiku");
		mieszkam.add("z przyjacielem");
		mieszkam.add("z przyjaciółką");

		return mieszkam;
	}

	public void setMieszkam(List<String> mieszkam) {
		this.mieszkam = mieszkam;
	}

	public String getDodatkowaInformacja() {
		return dodatkowaInformacja;
	}

	public void setDodatkowaInformacja(String dodatkowaInformacja) {
		this.dodatkowaInformacja = dodatkowaInformacja;
	}

}
