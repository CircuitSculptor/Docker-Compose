package ie.atu.week7sem1.jpawithspringbootandh2;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address, Long> {
    Optional<Address> findById(Long id);
}
