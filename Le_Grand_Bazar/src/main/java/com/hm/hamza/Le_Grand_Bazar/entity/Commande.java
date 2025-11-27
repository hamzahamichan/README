package com.hm.hamza.Le_Grand_Bazar.entity;

import com.hm.hamza.Le_Grand_Bazar.Enum.StatutCommande;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;


    private LocalDateTime dateCommande;


    private BigDecimal total;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "commande_id")
    private List<Commandes> items;


    @Enumerated(EnumType.STRING)
    private StatutCommande statut;
}
