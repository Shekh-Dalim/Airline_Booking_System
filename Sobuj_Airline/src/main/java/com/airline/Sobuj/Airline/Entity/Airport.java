package com.airline.Sobuj.Airline.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "airports")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 10)
    private String airportCode;

    @Column(nullable = false)
    private String airportName;

    @Column(nullable = false)
    private String city;

    @OneToMany(mappedBy = "sourceAirport")
    @Builder.Default
    private List<Flight> departureFlights = new ArrayList<>();

    @OneToMany(mappedBy = "destinationAirport")
    @Builder.Default
    private List<Flight> arrivalFlights = new ArrayList<>();
}