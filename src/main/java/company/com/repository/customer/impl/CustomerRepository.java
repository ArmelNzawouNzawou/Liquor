package company.com.repository.customer.impl;

import company.com.domain.customerBuilder.Customer;
import company.com.repository.customer.CustomerRep;

import java.util.ArrayList;

public class CustomerRepository{}/** implements CustomerRep
{
    private int highValeu;
    private static CustomerRepository rep =null;
    private Customer customerProduct;

    private ArrayList<Customer>mydb=new ArrayList<>();



    private CustomerRepository() {}

    public static CustomerRepository getInstance(){

        if(rep==null){
            rep=new CustomerRepository();
        }return rep;
    }


    @Override
    public Customer create(Customer cust) {
        Customer result = findCustomer(cust.getEmail());
        if(result==null){
            mydb.add(result);
            return result;
        }return null;
    }

    @Override
    public Customer update(Customer cust) {
        Customer result = findCustomer(cust.getEmail());
        if(result!=null){
           delete(result.getEmail());
            return create(cust);
        }return null;


    }

    @Override
    public void delete(String s) {
        Customer result = findCustomer(s);
        if(result!=null){mydb.remove(result);}
    }

    @Override
    public Customer read(String s) {
        Customer result = findCustomer(s);
        if(result!=null){return result;
        }return null;
    }

    @Override
    public ArrayList<Customer> readAll() {
       return mydb;
    }

    public Customer findCustomer(String id){
        return mydb.stream()
                .filter(C -> C.getEmail().equals(id))
                .findAny()
                .orElse(null);
    }



}
*/