package com.scarlet.backscarlet.model.beans;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "categoria")
public class Categoria {
    @Id
    private String nome;
}