package company.com.repository.orderRepository;

import company.com.domain.orderBuilder.Orders;
import company.com.repository.Irepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepositoryIn extends JpaRepository<Orders,String>
{

    //ArrayList<OrderClass>orderList();
}
