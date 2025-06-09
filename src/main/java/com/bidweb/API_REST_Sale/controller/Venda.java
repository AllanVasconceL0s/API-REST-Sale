package com.bidweb.API_REST_Sale.controller;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "vendas")
public class Venda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Nome do produto é obrigatório")
    @Column(name = "nome_produto", nullable = false)
    private String nomeProduto;
    
    @NotNull(message = "Quantidade é obrigatória")
    @Min(value = 1, message = "Quantidade deve ser maior que zero")
    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;
    
    @NotNull(message = "Data da venda é obrigatória")
    @Column(name = "data_venda", nullable = false)
    private LocalDateTime dataVenda;
    
    @NotNull(message = "Valor total é obrigatório")
    @DecimalMin(value = "0.01", message = "Valor total deve ser maior que zero")
    @Column(name = "valor_total", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorTotal;
    
    // Construtores
    public Venda() {}
    
    public Venda(String nomeProduto, Integer quantidade, LocalDateTime dataVenda, BigDecimal valorTotal) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
    }
    
    // Getters e Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNomeProduto() {
        return nomeProduto;
    }
    
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    
    public Integer getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    public LocalDateTime getDataVenda() {
        return dataVenda;
    }
    
    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", quantidade=" + quantidade +
                ", dataVenda=" + dataVenda +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
