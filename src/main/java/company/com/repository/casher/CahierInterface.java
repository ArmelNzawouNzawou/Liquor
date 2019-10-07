package company.com.repository.casher;


import company.com.domain.cashierBuilderPack.Cashier;
import company.com.repository.Irepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CahierInterface extends JpaRepository<Cashier,String> {

}
