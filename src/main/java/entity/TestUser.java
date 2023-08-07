package entity;

import entity.contants.UserGender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor
public class TestUser {

    private Integer id;
    private String name;
    private LocalDate birth;
    private UserGender gender;

}
