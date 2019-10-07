package company.com.repository.address;


import company.com.domain.users.Address;
import company.com.repository.Irepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressInt extends JpaRepository<Address,String> {
}
