package com.example.exchangemicroservice.entity;

import lombok.Data;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Data
@Entity
@Where(clause = "is_deleted = false")
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_currency")
    @SequenceGenerator(name = "s_currency", allocationSize = 1)
    private Long id;

    private Boolean isDeleted = Boolean.FALSE;

    private String currencyName;

    private String shortName;
}
