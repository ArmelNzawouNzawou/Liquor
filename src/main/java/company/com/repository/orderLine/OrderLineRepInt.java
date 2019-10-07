package company.com.repository.orderLine;
import company.com.domain.orderLine.OrderLine;
import company.com.repository.Irepository;
import company.com.service.Iservice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderLineRepInt extends JpaRepository<OrderLine,String> {
}
