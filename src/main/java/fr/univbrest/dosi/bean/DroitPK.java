package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the droit database table.
 * 
 */
@Embeddable
public class DroitPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_EVALUATION", insertable=false, updatable=false)
	private String idEvaluation;

	@Column(name="NO_ENSEIGNANT", insertable=false, updatable=false)
	private int noEnseignant;

	public DroitPK() {
	}
	public String getIdEvaluation() {
		return this.idEvaluation;
	}
	public void setIdEvaluation(String idEvaluation) {
		this.idEvaluation = idEvaluation;
	}
	public int getNoEnseignant() {
		return this.noEnseignant;
	}
	public void setNoEnseignant(int noEnseignant) {
		this.noEnseignant = noEnseignant;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DroitPK)) {
			return false;
		}
		DroitPK castOther = (DroitPK)other;
		return 
			this.idEvaluation.equals(castOther.idEvaluation)
			&& (this.noEnseignant == castOther.noEnseignant);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idEvaluation.hashCode();
		hash = hash * prime + this.noEnseignant;
		
		return hash;
	}
}