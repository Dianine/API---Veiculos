package com.apirest.veiculo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data /*Cria Getters e Setters*/
@Entity /*Informaque é uma entidade*/
@Builder /*Construtor Personalizado*/
@NoArgsConstructor /*Construtor sem paramentro*/
@AllArgsConstructor /*Construtor com paramentro*/

public class Veiculo implements Serializable {
    public static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fabricante;
    private String modelo;
    private String placa;
    private String ano;
}
