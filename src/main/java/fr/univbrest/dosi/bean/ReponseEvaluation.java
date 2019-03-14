package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the reponse_evaluation database table.
 * 
 */
@Entity
@Table(name="reponse_evaluation")
@NamedQuery(name="ReponseEvaluation.findAll", query="SELECT r FROM ReponseEvaluation r")
public class ReponseEvaluation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_REPONSE_EVALUATION")
	private String idReponseEvaluation;

	private String commentaire;

	private String nom;

	private String prenom;

	//uni-directional many-to-one association to Etudiant
	@ManyToOne
	@JoinColumn(name="NO_ETUDIANT")
	private Etudiant etudiant;

	//uni-directional many-to-one association to Evaluation
	@ManyToOne
	@JoinColumn(name="ID_EVALUATION")
	private Evaluation evaluation;

	public ReponseEvaluation() {
	}

	public String getIdReponseEvaluation() {
		return this.idReponseEvaluation;
	}

	public void setIdReponseEvaluation(String idReponseEvaluation) {
		this.idReponseEvaluation = idReponseEvaluation;
	}

	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Etudiant getEtudiant() {
		return this.etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Evaluation getEvaluation() {
		return this.evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

}