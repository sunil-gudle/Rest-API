package Spring.Boot.L1.cms.service;

import Spring.Boot.L1.cms.dao.CustomerDAO;
import Spring.Boot.L1.cms.exception.CustomerNotFoundException;
import Spring.Boot.L1.cms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    public Customer addCustomer(Customer customer) {
        return customerDAO.save(customer);
    }

    public List<Customer> getCustomers() {
        return customerDAO.findAll();
    }

    public Customer getCustomer(int customerId) {

        Optional<Customer> optionalCustomer = customerDAO.findById(customerId);
        if (!optionalCustomer.isPresent())
            throw new CustomerNotFoundException("Customer record is not available");
        return optionalCustomer.get();
    }

    public Customer updateCustomer(int customerId, Customer customer) {

        customer.setCustomerId(customerId);
        return customerDAO.save(customer);

    }

    public void deleteCustomer(int customerId) {
        customerDAO.deleteById(customerId);

    }
}
