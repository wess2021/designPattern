package com.Pattern.AbstractFactory;

public abstract class Automobile {
	String couleur;
	String puissance;
	String modele;
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getPuissance() {
		return puissance;
	}
	public void setPuissance(String puissance) {
		this.puissance = puissance;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	
	public abstract void featuresDisplay();
}
