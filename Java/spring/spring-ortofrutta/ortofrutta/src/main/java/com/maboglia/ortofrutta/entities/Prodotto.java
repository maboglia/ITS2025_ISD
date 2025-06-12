package com.maboglia.ortofrutta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "prodotti")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prodotto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String categoria;
    private String origine;
    private String prezzoKg;
    private String disponibilita;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getOrigine() {
        return origine;
    }
    public void setOrigine(String origine) {
        this.origine = origine;
    }
    public String getPrezzoKg() {
        return prezzoKg;
    }
    public void setPrezzoKg(String prezzoKg) {
        this.prezzoKg = prezzoKg;
    }
    public String getDisponibilita() {
        return disponibilita;
    }
    public void setDisponibilita(String disponibilita) {
        this.disponibilita = disponibilita;
    }


}
