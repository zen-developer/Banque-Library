/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mariam_B
 */
@Entity
@Table(name = "card")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Card.findAll", query = "SELECT c FROM Card c"),
    @NamedQuery(name = "Card.findByNumCarte", query = "SELECT c FROM Card c WHERE c.numCarte = :numCarte"),
    @NamedQuery(name = "Card.findByTypeCarte", query = "SELECT c FROM Card c WHERE c.typeCarte = :typeCarte"),
    @NamedQuery(name = "Card.findByDateExp", query = "SELECT c FROM Card c WHERE c.dateExp = :dateExp"),
    @NamedQuery(name = "Card.findByNomCarte", query = "SELECT c FROM Card c WHERE c.nomCarte = :nomCarte"),
    @NamedQuery(name = "Card.findByCvv", query = "SELECT c FROM Card c WHERE c.cvv = :cvv"),
    @NamedQuery(name = "Card.findBySolde", query = "SELECT c FROM Card c WHERE c.solde = :solde")})
public class Card implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "num_carte")
    private Integer numCarte;
    @Basic(optional = false)
    @Column(name = "type_carte")
    private String typeCarte;
    @Basic(optional = false)
    @Column(name = "date_exp")
    @Temporal(TemporalType.DATE)
    private Date dateExp;
    @Basic(optional = false)
    @Column(name = "nom_carte")
    private String nomCarte;
    @Basic(optional = false)
    @Column(name = "CVV")
    private int cvv;
    @Basic(optional = false)
    @Column(name = "solde")
    private float solde;

    public Card() {
    }

    public Card(Integer numCarte) {
        this.numCarte = numCarte;
    }

    public Card(Integer numCarte, String typeCarte, Date dateExp, String nomCarte, int cvv, float solde) {
        this.numCarte = numCarte;
        this.typeCarte = typeCarte;
        this.dateExp = dateExp;
        this.nomCarte = nomCarte;
        this.cvv = cvv;
        this.solde = solde;
    }

    public Integer getNumCarte() {
        return numCarte;
    }

    public void setNumCarte(Integer numCarte) {
        this.numCarte = numCarte;
    }

    public String getTypeCarte() {
        return typeCarte;
    }

    public void setTypeCarte(String typeCarte) {
        this.typeCarte = typeCarte;
    }

    public Date getDateExp() {
        return dateExp;
    }

    public void setDateExp(Date dateExp) {
        this.dateExp = dateExp;
    }

    public String getNomCarte() {
        return nomCarte;
    }

    public void setNomCarte(String nomCarte) {
        this.nomCarte = nomCarte;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numCarte != null ? numCarte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Card)) {
            return false;
        }
        Card other = (Card) object;
        if ((this.numCarte == null && other.numCarte != null) || (this.numCarte != null && !this.numCarte.equals(other.numCarte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.Card[ numCarte=" + numCarte + " ]";
    }
    
}
