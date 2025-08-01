package za.ac.cput.repository;
/* CartRepository.java
     Cart repository class
     Author: C Smith (221242597)
     Date: 23 May 2025 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Cart;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, String> {
    List<Cart> findByCartId(String cartId);
    List<Cart> findByUserUserId(String userId);
    List<Cart> findByQuantity(int quantity);
}
