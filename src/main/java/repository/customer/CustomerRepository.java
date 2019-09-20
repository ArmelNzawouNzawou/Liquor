package repository.customer;

import domain.customerBuilder.Customer;
import factory.domain.customerFactory.CustomerFactory;

import java.sql.*;
import java.util.ArrayList;

public class CustomerRepository implements CustomerRep
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
        Customer result = findCustomer(cust.getPhone_number());
        if(result==null){
            mydb.add(result);
            return result;
        }return null;
    }

    @Override
    public Customer update(Customer cust) {
        Customer result = findCustomer(cust.getPhone_number());
        if(result!=null){
           delete(result.getCustomer_number());
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
                .filter(C -> C.getCustomer_number().equals(id))
                .findAny()
                .orElse(null);
    }



    @Override
    public int getItemNumber()
    {
       return 0;
    }
}
