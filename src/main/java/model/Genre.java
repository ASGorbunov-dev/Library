package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor

@AllArgsConstructor

public class Genre {

    private Long id;
    private String genreTitle;

    @Override
    public String toString() {
        return "\nЖанр: " + genreTitle;
    }
}
