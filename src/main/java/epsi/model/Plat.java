package epsi.model;

// Generated 6 mai 2015 11:18:39 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Plat generated by hbm2java
 */
@Entity
@Table(name = "plat", catalog = "bdd_lpdc")
public class Plat implements java.io.Serializable {

	private long idProduit;
	private Produit produit;
	private TypeCuisine typeCuisine;
	private int nbPersonne;
	private boolean estChaud;
	private Float prix;
	private String designation;
	private String description;
	private String posterPath;

	public Plat() {
	}

	public Plat(Produit produit, TypeCuisine typeCuisine, int nbPersonne,
			boolean estChaud) {
		this.produit = produit;
		this.typeCuisine = typeCuisine;
		this.nbPersonne = nbPersonne;
		this.estChaud = estChaud;
	}

	public Plat(Produit produit, TypeCuisine typeCuisine, int nbPersonne,
			boolean estChaud, Float prix, String designation, String description) {
		this.produit = produit;
		this.typeCuisine = typeCuisine;
		this.nbPersonne = nbPersonne;
		this.estChaud = estChaud;
		this.prix = prix;
		this.designation = designation;
		this.description = description;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "produit"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id_Produit", unique = true, nullable = false)
	public long getIdProduit() {
		return this.idProduit;
	}

	public void setIdProduit(long idProduit) {
		this.idProduit = idProduit;
	}

	@OneToOne(fetch = FetchType.EAGER)
	@PrimaryKeyJoinColumn
	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_Type_Cuisine", nullable = false)
	public TypeCuisine getTypeCuisine() {
		return this.typeCuisine;
	}

	public void setTypeCuisine(TypeCuisine typeCuisine) {
		this.typeCuisine = typeCuisine;
	}

	@Column(name = "nb_Personne", nullable = false)
	public int getNbPersonne() {
		return this.nbPersonne;
	}

	public void setNbPersonne(int nbPersonne) {
		this.nbPersonne = nbPersonne;
	}

	@Column(name = "est_Chaud", nullable = false)
	public boolean isEstChaud() {
		return this.estChaud;
	}

	public void setEstChaud(boolean estChaud) {
		this.estChaud = estChaud;
	}

	@Column(name = "prix", precision = 12, scale = 0)
	public Float getPrix() {
		return this.prix;
	}

	public void setPrix(Float prix) {
		this.prix = prix;
	}

	@Column(name = "designation", length = 50)
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Column(name = "description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name = "poster_path", length = 250)
	public String getPosterPath(){
		return this.posterPath;
	}
	
	public void setPosterPath(String posterPath){
		this.posterPath = posterPath;
	}

}
