package company.com.repository.customer;

import company.com.domain.customerBuilder.Customer;
import company.com.repository.Irepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface CustomerRep extends JpaRepository<Customer, String>
{

}
