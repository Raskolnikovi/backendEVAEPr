package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the authentification database table.
 * 
 */
@Entity
@Table(name="authentification")
@NamedQuery(name="Authentification.findAll", query="SELECT a FROM Authentification a")
public class Authentification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_CONNECTION")
	private int idConnection;

	@Column(name="LOGIN_CONNECTION")
	private String loginConnection;

	@Column(name="MOT_PASSE")
	private String motPasse;

	@Column(name="NO_ENSEIGNANT")
	private int noEnseignant;

	@Column(name="NO_ETUDIANT")
	private String noEtudiant;

	@Column(name="PSEUDO_CONNECTION")
	private String pseudoConnection;

	private String role;

	public Authentification() {
	}

	public Authentification(int idConnection, String loginConnection, String motPasse) {
		this.idConnection = idConnection;
		this.loginConnection = loginConnection;
		this.motPasse = motPasse;
	}
	
	public int getIdConnection() {
		return this.idConnection;
	}

	public void setIdConnection(int idConnection) {
		this.idConnection = idConnection;
	}

	public String getLoginConnection() {
		return this.loginConnection;
	}

	public void setLoginConnection(String loginConnection) {
		this.loginConnection = loginConnection;
	}

	public String getMotPasse() {
		return this.motPasse;
	}

	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}

	public int getNoEnseignant() {
		return this.noEnseignant;
	}

	public void setNoEnseignant(int noEnseignant) {
		this.noEnseignant = noEnseignant;
	}

	public String getNoEtudiant() {
		return this.noEtudiant;
	}

	public void setNoEtudiant(String noEtudiant) {
		this.noEtudiant = noEtudiant;
	}

	public String getPseudoConnection() {
		return this.pseudoConnection;
	}

	public void setPseudoConnection(String pseudoConnection) {
		this.pseudoConnection = pseudoConnection;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}