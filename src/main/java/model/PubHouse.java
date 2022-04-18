package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor


public class PubHouse {
    private Long id;
    private String pubHouseTitle;

    @Override
    public String toString() {
        return  "\nИздательство: " + pubHouseTitle;
    }
}
