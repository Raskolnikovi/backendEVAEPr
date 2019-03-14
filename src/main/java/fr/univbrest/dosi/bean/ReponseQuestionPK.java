package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the reponse_question database table.
 * 
 */
@Embeddable
public class ReponseQuestionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_REPONSE_EVALUATION", insertable=false, updatable=false)
	private String idReponseEvaluation;

	@Column(name="ID_QUESTION_EVALUATION", insertable=false, updatable=false)
	private String idQuestionEvaluation;

	public ReponseQuestionPK() {
	}
	
	public ReponseQuestionPK(String idReponseEvaluation, String idQuestionEvaluation) {
		super();
		this.idReponseEvaluation = idReponseEvaluation;
		this.idQuestionEvaluation = idQuestionEvaluation;
	}

	public String getIdReponseEvaluation() {
		return this.idReponseEvaluation;
	}
	public void setIdReponseEvaluation(String idReponseEvaluation) {
		this.idReponseEvaluation = idReponseEvaluation;
	}
	public String getIdQuestionEvaluation() {
		return this.idQuestionEvaluation;
	}
	public void setIdQuestionEvaluation(String idQuestionEvaluation) {
		this.idQuestionEvaluation = idQuestionEvaluation;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ReponseQuestionPK)) {
			return false;
		}
		ReponseQuestionPK castOther = (ReponseQuestionPK)other;
		return 
			this.idReponseEvaluation.equals(castOther.idReponseEvaluation)
			&& this.idQuestionEvaluation.equals(castOther.idQuestionEvaluation);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idReponseEvaluation.hashCode();
		hash = hash * prime + this.idQuestionEvaluation.hashCode();
		
		return hash;
	}
}