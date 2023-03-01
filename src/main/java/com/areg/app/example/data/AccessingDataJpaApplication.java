package com.areg.app.example.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class AccessingDataJpaApplication {
    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    @Autowired
    private CustomerService customerService;

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository repository) {
        return (args) -> {

            Customer c = new Customer("Jack", "Bauer");
            repository.save(c);
            repository.save(new Customer("", "Repino"));
            repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));
            repository.save(new Customer("David", "Palmer"));
            repository.save(new Customer("Michelle", "Dessler"));
            repository.save(new Customer("Masha", "Kender"));


            long l = customerService.deleteByFirstName("Kim");
            long l1 = customerService.deleteByFirstName("aa");

            List<Customer> list = repository.findAllByFirstNameStartingWithAndLastNameEndingWithOrderByLastNameAsc("M", "er");
            long lCountRepository = repository.countByLastNameStartingWith("Bauer");

            boolean b = repository.existsByFirstName("Chloe");
            boolean b1 = repository.existsByFirstName("ere");


            repository.deleteById(3L);


            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Customer customer : repository.findAll()) {
                log.info(customer.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Customer customer = repository.findById(1L);
            log.info("Customer found with findById(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");

            // fetch customers by last name
            log.info("Customer found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByLastName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            // for (Customer bauer : repository.findByLastName("Bauer")) {
            //  log.info(bauer.toString());
            // }
            log.info("");




            //repository.findAllByFirstNameStartingWithAndLastNameEndingWithOrderByLastNameAsc()
        };
    }

}
