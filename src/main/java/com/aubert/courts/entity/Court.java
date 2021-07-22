package com.aubert.courts.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity(name = "court")
public class Court {
    @Id
    private int numCourt;
    @Column
    private boolean estCouvert;
    @Column
    private String typeSurface;

    public Court(int numCourt, boolean estCouvert, String typeSurface) {
        this.numCourt = numCourt;
        this.estCouvert = estCouvert;
        this.typeSurface = typeSurface;
    }
}
