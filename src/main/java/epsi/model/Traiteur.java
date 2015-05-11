package epsi.model;

// Generated 6 mai 2015 11:18:39 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Traiteur generated by hbm2java
 */
@Entity
@Table(name = "traiteur", catalog = "bdd_lpdc")
public class Traiteur implements java.io.Serializable {

	private Integer idTraiteur;
	private String nomTraiteur;
	private String adresse;
	private String telTraiteur;
	private String posterPath;
	private Set<Produit> produits = new HashSet<Produit>(0);

	public Traiteur() {
	}

	public Traiteur(String nomTraiteur, String adresse, String telTraiteur) {
		this.nomTraiteur = nomTraiteur;
		this.adresse = adresse;
		this.telTraiteur = telTraiteur;
	}

	public Traiteur(String nomTraiteur, String adresse, String telTraiteur,
			Set<Produit> produits) {
		this.nomTraiteur = nomTraiteur;
		this.adresse = adresse;
		this.telTraiteur = telTraiteur;
		this.produits = produits;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_Traiteur", unique = true, nullable = false)
	public Integer getIdTraiteur() {
		return this.idTraiteur;
	}

	public void setIdTraiteur(Integer idTraiteur) {
		this.idTraiteur = idTraiteur;
	}

	@Column(name = "nom_Traiteur", nullable = false, length = 30)
	public String getNomTraiteur() {
		return this.nomTraiteur;
	}

	public void setNomTraiteur(String nomTraiteur) {
		this.nomTraiteur = nomTraiteur;
	}

	@Column(name = "adresse", nullable = false, length = 100)
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Column(name = "tel_Traiteur", nullable = false, length = 12)
	public String getTelTraiteur() {
		return this.telTraiteur;
	}

	public void setTelTraiteur(String telTraiteur) {
		this.telTraiteur = telTraiteur;
	}
	
	@Column(name = "poster_path", nullable = false, length = 250)
	public String getPosterPath(){
		return this.posterPath;
	}
	
	public void setPosterPath(String posterPath){
		this.posterPath = posterPath;
	}

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "fabrique", catalog = "bdd_lpdc", joinColumns = { @JoinColumn(name = "id_Traiteur", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "id_Produit", nullable = false, updatable = false) })
	public Set<Produit> getProduits() {
		return this.produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}

}