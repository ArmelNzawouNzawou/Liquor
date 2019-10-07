package company.com.repository.drivers;



import company.com.domain.driver.Driver;
import company.com.repository.Irepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepInt extends JpaRepository<Driver, String> {
}
