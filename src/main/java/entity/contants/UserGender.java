package entity.contants;

import java.util.Arrays;

public enum UserGender {
    MALE("M"),
    FEMALE("F");

    private final String code;

    UserGender(String code) {
        this.code = code;
    }

    public UserGender fromCode(String code) {
        return Arrays.stream(UserGender.values())
                .filter(n -> n.code.equals(code))
                .findFirst()
                .orElse(null);
    }
}
