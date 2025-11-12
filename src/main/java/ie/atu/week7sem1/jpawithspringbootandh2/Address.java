package ie.atu.week7sem1.jpawithspringbootandh2;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "addresses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String county;

    @NotBlank
    private String eircode;

    public Address(String eircode, String county) {
        this.county = county;
        this.eircode = eircode;
    }
}
