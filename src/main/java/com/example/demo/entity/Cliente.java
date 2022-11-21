package com.example.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "O nome é obrigatorio!")
    private String endereco;
    private String cep;
    private String numero;
    private String formaDePagamento;
    private Integer parcelas;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Itens> itens;

    public Cliente(String endereco, String cep, String numero, String formaDePagamento, Integer parcelas, List<Itens> itens) {
        this.endereco = endereco;
        this.cep = cep;
        this.itens = itens;
        this.numero = numero;
        this.formaDePagamento = formaDePagamento;
        this.parcelas = parcelas;
    }

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }
}