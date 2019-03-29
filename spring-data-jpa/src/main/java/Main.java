import com.springjpa.config.PersistenceContext;
import com.springjpa.entity.Person;
import com.springjpa.repositories.PersonRepo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersistenceContext.class);
        PersonRepo personRepo = (PersonRepo) context.getBean("personRepo");
        personRepo.save(new Person("Siddharth", "Gupta", 15100, 22));
        personRepo.save(new Person("Yatin", "Ajmani", 12200, 23));
        personRepo.save(new Person("Vishakha", "Sharma", 10100, 25));
        personRepo.save(new Person("Peter", "Parker", 101200, 25));
        System.out.println(personRepo.findAll());
//        personRepo.findAll().forEach(System.out::println);
//        List<Person> people= (List<Person>) personRepo.findAll();
//        people.forEach(System.out::println);
        System.out.println();
        System.out.println("Record exists: " + personRepo.exists(2));
        System.out.println();
        personRepo.delete(2);
        System.out.println("Deleting the record");
        System.out.println();
        System.out.println("Record exists: " + personRepo.exists(2));
        System.out.println();

        System.out.println(personRepo.findById(3));
        System.out.println(personRepo.findByFirstName("Siddharth"));
        System.out.println(personRepo.findByLastName("Gupta"));
        System.out.println(personRepo.findFirstNameWithAge25());
        System.out.println(personRepo.findPersonRecordWithAge25());
        System.out.println(personRepo.findNameOfAge25());
        System.out.println(personRepo.countByName("Siddharth"));

        System.out.println(personRepo.countById(2));
        System.out.println(personRepo.findFirst3ByFirstName("Vishakha"));
        System.out.println(personRepo.findDistinctByFirstName("Siddharth"));
        System.out.println(personRepo.findByFirstNameOrAge("Siddharth",25));
        System.out.println(personRepo.findByFirstNameAndAge("Siddharth",25));
        System.out.println(personRepo.findByAgeBetween(22,25));
        System.out.println(personRepo.findByAgeLessThan(24));
        System.out.println(personRepo.findByAgeGreaterThanEqual(22));
        System.out.println(personRepo.findByFirstNameLike("%kha"));
        System.out.println(personRepo.findByFirstNameNot("Yatin"));
        System.out.println(personRepo.findByAgeIn(Arrays.asList(22,25)));
        System.out.println(personRepo.findByFirstNameIgnoreCase("siddharth"));

        System.out.println(personRepo.findByAgeGreaterThanEqualOrderByIdDesc(24));

        System.out.println(personRepo.findAll(new Sort(Sort.Direction.DESC,"Id")));

        Page<Person> personPage=personRepo.findAll(new PageRequest(0,2,new Sort(Sort.Direction.DESC,"id")));
        System.out.println(Arrays.asList(personPage.getContent()));
    }
}
