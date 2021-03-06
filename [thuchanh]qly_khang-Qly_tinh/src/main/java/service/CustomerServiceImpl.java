package service;

import model.Customer;
import model.Province;
import org.springframework.beans.factory.annotation.Autowired;
import repository.CustomerRepository;
import repository.ProvinceRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
   private CustomerRepository customerRepository;



    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return customerRepository.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Integer id) {
        customerRepository.delete(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }
}
