package com.mala.movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "Movie")
public class Movie implements Comparable<Movie>{

    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Override
    public int compareTo(Movie other) {
        return this.id.compareTo(other.id);
    }
}