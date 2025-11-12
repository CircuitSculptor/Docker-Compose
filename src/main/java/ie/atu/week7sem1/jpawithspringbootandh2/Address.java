package ie.atu.week7sem1.jpawithspringbootandh2;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String county;

    @NotBlank
    private String eircode;

    public Address(String eircode) {
        this.county = county;
        this.eircode = eircode;
    }
}
