package company.com.controller.address;

import company.com.domain.users.Address;
import company.com.factory.domain.address.AddressFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class AddressControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL ="http://localhost:8080/address";

    @Test
    public void create() {
        //
        Address address= AddressFactory.getAddress("email","40 Reabeik");
        ResponseEntity<Address> postResponse=restTemplate.postForEntity(baseURL +"/create",address,Address.class);
        assertNotNull(postResponse);
        System.out.println(postResponse.toString());
    }

    @Test
    public void read() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void readAll() {
    }
}