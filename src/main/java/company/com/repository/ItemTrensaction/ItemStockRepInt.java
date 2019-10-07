package company.com.repository.ItemTrensaction;

import company.com.domain.itemTrensaction.ItemStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemStockRepInt extends JpaRepository<ItemStock,String> {
}
