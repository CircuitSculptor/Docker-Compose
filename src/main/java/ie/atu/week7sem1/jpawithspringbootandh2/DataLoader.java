package ie.atu.week7sem1.jpawithspringbootandh2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final PersonRepository personRepository;

    public DataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Address a1 = new Address("H91XX00", "Galway");
        Person testData = new Person("Paul", "paul@atu.ie", "1234", "Lecturer", "Electronics", a1);
        // Address 2
        Address a2 = new Address("F23X123", "Mayo");
        Person testData2 = new Person("Pat", "pat@atu.ie", "1234", "Lecturer", "Electronics", a2);
        Address a3 = new Address("H91XX00", "Galway");
        Person testData3 = new Person("Saul", "saul@atu.ie", "1234", "Lecturer", "Electronics", a3);
        personRepository.save(testData);
        personRepository.save(testData2);
        personRepository.save(testData3);
    }
}
