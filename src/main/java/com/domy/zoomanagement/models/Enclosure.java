package com.domy.zoomanagement.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Entity
@Builder
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "enclosure")
public class Enclosure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "habitat_id")
    private Habitat habitat;

    @Column(nullable = false)
    private String localization;

    @Column(nullable = false)
    private Float surface;

    @Column(nullable = false)
    private Float price;

    @Column
    private Boolean bought = false;


}
