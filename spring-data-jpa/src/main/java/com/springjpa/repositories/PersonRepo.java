package com.springjpa.repositores;

import com.springjpa.enitity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person,Integer> {
}
