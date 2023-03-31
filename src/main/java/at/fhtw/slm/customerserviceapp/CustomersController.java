package at.fhtw.slm.customerserviceapp;

import at.fhtw.slm.customerserviceapp.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomersController {
    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Anton", "Bauer", LocalDate.of(2000,4,1)));
        customers.add(new Customer("Berta", "Suttner", LocalDate.of(1950,6,1)));
        customers.add(new Customer("Cäsar", "Laplane", LocalDate.of(1,2,3)));
        return customers;
    }
}
