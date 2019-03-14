package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the rubrique_question database table.
 * 
 */
@Entity
@Table(name="rubrique_question")
@NamedQuery(name="RubriqueQuestion.findAll", query="SELECT r FROM RubriqueQuestion r")
public class RubriqueQuestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RubriqueQuestionPK id;

	private int ordre;

	//uni-directional many-to-one association to Question
	@ManyToOne
	@JoinColumn(name="ID_QUESTION", insertable=false, updatable=false)
	private Question question;

	//uni-directional many-to-one association to Rubrique
	@ManyToOne
	@JoinColumn(name="ID_RUBRIQUE", insertable=false, updatable=false)
	private Rubrique rubrique;

	public RubriqueQuestion() {
	}

	public RubriqueQuestionPK getId() {
		return this.id;
	}

	public void setId(RubriqueQuestionPK id) {
		this.id = id;
	}

	public int getOrdre() {
		return this.ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Rubrique getRubrique() {
		return this.rubrique;
	}

	public void setRubrique(Rubrique rubrique) {
		this.rubrique = rubrique;
	}

}