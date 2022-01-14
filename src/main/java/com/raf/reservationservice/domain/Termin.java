package com.raf.reservationservice.domain;

import javax.persistence.*;

@Entity
public class Termin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer dan;

    public Termin(){}
    public Termin(Integer dan){
        this.dan=dan;
    }

    public Integer getDan() {
        return dan;
    }

    public void setDan(Integer dan) {
        this.dan = dan;
    }
}
