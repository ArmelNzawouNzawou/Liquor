package company.com.service.orderLine;

import company.com.domain.orderLine.OrderLine;
import company.com.service.Iservice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface OrderLineServiceInt extends Iservice<OrderLine,String> {
}
