package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the rubrique_evaluation database table.
 * 
 */
@Entity
@Table(name="rubrique_evaluation")
@NamedQuery(name="RubriqueEvaluation.findAll", query="SELECT r FROM RubriqueEvaluation r")
public class RubriqueEvaluation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_RUBRIQUE_EVALUATION")
	private String idRubriqueEvaluation;

	private String designation;

	private byte ordre;

	//uni-directional many-to-one association to Evaluation
	@ManyToOne
	@JoinColumn(name="ID_EVALUATION")
	private Evaluation evaluation;

	//uni-directional many-to-one association to Rubrique
	@ManyToOne
	@JoinColumn(name="ID_RUBRIQUE")
	private Rubrique rubrique;

	public RubriqueEvaluation() {
	}

	public String getIdRubriqueEvaluation() {
		return this.idRubriqueEvaluation;
	}

	public void setIdRubriqueEvaluation(String idRubriqueEvaluation) {
		this.idRubriqueEvaluation = idRubriqueEvaluation;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public byte getOrdre() {
		return this.ordre;
	}

	public void setOrdre(byte ordre) {
		this.ordre = ordre;
	}

	public Evaluation getEvaluation() {
		return this.evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

	public Rubrique getRubrique() {
		return this.rubrique;
	}

	public void setRubrique(Rubrique rubrique) {
		this.rubrique = rubrique;
	}

}