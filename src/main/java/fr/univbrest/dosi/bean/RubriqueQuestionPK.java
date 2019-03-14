package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the rubrique_question database table.
 * 
 */
@Embeddable
public class RubriqueQuestionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_RUBRIQUE", insertable=false, updatable=false)
	private String idRubrique;

	@Column(name="ID_QUESTION", insertable=false, updatable=false)
	private String idQuestion;

	public RubriqueQuestionPK() {
	}
	public String getIdRubrique() {
		return this.idRubrique;
	}
	public void setIdRubrique(String idRubrique) {
		this.idRubrique = idRubrique;
	}
	public String getIdQuestion() {
		return this.idQuestion;
	}
	public void setIdQuestion(String idQuestion) {
		this.idQuestion = idQuestion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RubriqueQuestionPK)) {
			return false;
		}
		RubriqueQuestionPK castOther = (RubriqueQuestionPK)other;
		return 
			this.idRubrique.equals(castOther.idRubrique)
			&& this.idQuestion.equals(castOther.idQuestion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idRubrique.hashCode();
		hash = hash * prime + this.idQuestion.hashCode();
		
		return hash;
	}
}