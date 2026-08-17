package mk.ukim.finki.wp.jan2025g2.repository;
import mk.ukim.finki.wp.jan2025g2.model.NationalPark;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NationalParkRepository extends JpaSpecificationRepository<NationalPark, Long> {
//    List<Product> findByNameContainingIgnoreCase(String text);
}