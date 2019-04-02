package nl.rabobank.modular.monolith.example.customer;
import nl.rabobank.modular.monolith.example.customer.domain.Customer;

public interface CustomerComponent {

    Customer getCustomer();

    void save(final Customer customer);
}
