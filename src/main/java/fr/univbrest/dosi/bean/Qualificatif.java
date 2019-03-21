package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the qualificatif database table.
 * 
 */
@Entity
@NamedQuery(name="Qualificatif.findAll", query="SELECT q FROM Qualificatif q")
public class Qualificatif implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_QUALIFICATIF")
	private int idQualificatif;
	
	private String maximal;

	private String minimal;

	public Qualificatif() {
	}
	
	public Qualificatif( String maximal, String minimal) {
		super();
		this.maximal = maximal;
		this.minimal = minimal;
	}
	
	public Qualificatif(int id, String maximal, String minimal) {
		super();
		this.idQualificatif = id;
		this.maximal = maximal;
		this.minimal = minimal;
	}

	public int getIdQualificatif() {
		return this.idQualificatif;
	}

	public void setIdQualificatif(int idQualificatif) {
		this.idQualificatif = idQualificatif;
	}

	public String getMaximal() {
		return this.maximal;
	}

	public void setMaximal(String maximal) {
		this.maximal = maximal;
	}

	public String getMinimal() {
		return this.minimal;
	}

	public void setMinimal(String minimal) {
		this.minimal = minimal;
	}

}