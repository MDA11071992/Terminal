package com.springapp.mvc.domain;

import javax.persistence.*;

@Entity
@Table (name = "t_digverpcg")
public class digverpcg {

    @Id
    @Column(name = "id")
    @GeneratedValue()
    private int ID;

    @Column(name = "t_digverpcg_name")
    private String NAME;

    @Column(name = "t_digverpcg_cod")
    private String COD;

    @Column(name = "t_digverpcg_art")
    private int ART;

    @Column(name = "t_digverpcg_price")
    private String PRICE;

    @Column(name = "t_digverpcg_about")
    private String ABOUT;

    @Column(name = "t_digverpcg_charac")
    private String CHARAC;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getCOD() {
        return COD;
    }

    public void setCOD(String COD) {
        this.COD = COD;
    }

    public int getART() {
        return ART;
    }

    public void setART(int ART) {
        this.ART = ART;
    }

    public String getPRICE() {
        return PRICE;
    }

    public void setPRICE(String PRICE) {
        this.PRICE = PRICE;
    }

    public String getABOUT() {
        return ABOUT;
    }

    public void setABOUT(String ABOUT) {
        this.ABOUT = ABOUT;
    }

    public String getCHARAC() {
        return CHARAC;
    }

    public void setCHARAC(String CHARAC) {
        this.CHARAC = CHARAC;
    }
}