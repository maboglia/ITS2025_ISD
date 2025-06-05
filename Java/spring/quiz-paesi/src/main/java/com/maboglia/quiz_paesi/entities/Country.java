package com.maboglia.quiz_paesi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "countries")
public class Country {

    @Id
    @Column(name = "alpha2Code")
    private String alphaCode;

    private String name;
    private String region;
    private String capital;

    @Transient
    private String flag;

    public String getFlag(){
        return "flags/" + alphaCode.toLowerCase() + ".png";
    }

}
