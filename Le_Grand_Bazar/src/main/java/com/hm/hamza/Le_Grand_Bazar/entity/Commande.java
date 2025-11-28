package com.hm.hamza.Le_Grand_Bazar.entity;

import com.hm.hamza.Le_Grand_Bazar.Enum.StatutCommande;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "commande")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private LocalDateTime dateCommande;

    private BigDecimal total;

    @OneToMany(mappedBy = "commande", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Commandes> items;

    @Enumerated(EnumType.STRING)
    private StatutCommande statut;
}
