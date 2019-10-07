package company.com.repository.user;

import company.com.domain.users.Login;
import company.com.repository.Irepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepInt extends JpaRepository<Login,String> {
}
