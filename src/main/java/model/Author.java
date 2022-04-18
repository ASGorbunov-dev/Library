package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Author {

    private Long id;
    private String surname;
    private String name;
    private String middleName;

    @Override
    public String toString() {
        return surname + " " + name + " " + middleName;
    }
}