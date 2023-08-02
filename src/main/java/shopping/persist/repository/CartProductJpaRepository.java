package shopping.persist.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import shopping.persist.entity.CartEntity;
import shopping.persist.entity.CartProductEntity;

public interface CartProductJpaRepository extends JpaRepository<CartProductEntity, Long> {

    @Query("select cp from CartProductEntity cp join fetch cp.cartEntity c where c.userId = :userId")
    List<CartProductEntity> findAllByUserId(@Param("userId") long userId);

    List<CartProductEntity> findAllByCartEntity(CartEntity cartEntity);
}