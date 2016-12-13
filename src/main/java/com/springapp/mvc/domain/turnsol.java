package com.springapp.mvc.domain;

import javax.persistence.*;

@Entity
@Table (name = "t_turnsol")
public class turnsol {

    @Id
    @Column(name = "id")
    @GeneratedValue()
    private int ID;

    @Column(name = "t_turnsol_name")
    private String NAME;

    @Column(name = "t_turnsol_cod")
    private String COD;

    @Column(name = "t_turnsol_art")
    private int ART;

    @Column(name = "t_turnsol_price")
    private String PRICE;

    @Column(name = "t_turnsol_about")
    private String ABOUT;

    @Column(name = "t_turnsol_charac")
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
