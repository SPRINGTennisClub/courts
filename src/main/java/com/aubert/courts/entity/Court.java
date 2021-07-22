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
    private boolean couvert;
    @Column
    private String typeSurface;

    public Court(int numCourt, boolean couvert, String typeSurface) {
        this.numCourt = numCourt;
        this.couvert = couvert;
        this.typeSurface = typeSurface;
    }
}
