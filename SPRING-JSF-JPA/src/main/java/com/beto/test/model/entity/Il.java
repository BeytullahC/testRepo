package com.beto.test.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by BeytullahCaliskan on 30.09.2014.
 */
@Entity
@Table(name = "il")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Il.findAll", query = "SELECT i FROM Il i"),
    @NamedQuery(name = "Il.findByIlId", query = "SELECT i FROM Il i WHERE i.ilId = :ilId"),
    @NamedQuery(name = "Il.findByPlaka", query = "SELECT i FROM Il i WHERE i.plaka = :plaka"),
    @NamedQuery(name = "Il.findByIlAdiBuyuk", query = "SELECT i FROM Il i WHERE i.ilAdiBuyuk = :ilAdiBuyuk"),
    @NamedQuery(name = "Il.findByIlAdi", query = "SELECT i FROM Il i WHERE i.ilAdi = :ilAdi"),
    @NamedQuery(name = "Il.findByIlAdiKucuk", query = "SELECT i FROM Il i WHERE i.ilAdiKucuk = :ilAdiKucuk")})
public class Il implements Serializable{
     private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IL_ID")
    private Long ilId;
    @Size(max = 50)
    @Column(name = "PLAKA")
    private String plaka;
    @Size(max = 50)
    @Column(name = "IL_ADI_BUYUK")
    private String ilAdiBuyuk;
    @Size(max = 50)
    @Column(name = "IL_ADI")
    private String ilAdi;
    @Size(max = 50)
    @Column(name = "IL_ADI_KUCUK")
    private String ilAdiKucuk;

    public Il() {
    }

    public Il(Long ilId) {
        this.ilId = ilId;
    }

    public Long getIlId() {
        return ilId;
    }

    public void setIlId(Long ilId) {
        this.ilId = ilId;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getIlAdiBuyuk() {
        return ilAdiBuyuk;
    }

    public void setIlAdiBuyuk(String ilAdiBuyuk) {
        this.ilAdiBuyuk = ilAdiBuyuk;
    }

    public String getIlAdi() {
        return ilAdi;
    }

    public void setIlAdi(String ilAdi) {
        this.ilAdi = ilAdi;
    }

    public String getIlAdiKucuk() {
        return ilAdiKucuk;
    }

    public void setIlAdiKucuk(String ilAdiKucuk) {
        this.ilAdiKucuk = ilAdiKucuk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ilId != null ? ilId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Il)) {
            return false;
        }
        Il other = (Il) object;
        return !((this.ilId == null && other.ilId != null) || (this.ilId != null && !this.ilId.equals(other.ilId)));
    }

    @Override
    public String toString() {
        return "com.beto.test.Il[ ilId=" + ilId + " ]";
    }
}
