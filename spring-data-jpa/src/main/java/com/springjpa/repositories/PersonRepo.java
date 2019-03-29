package com.springjpa.repositories;

import com.springjpa.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepo extends CrudRepository<Person, Integer> {

    Page<Person> findAll(Pageable pageable);

    List<Person> findAll(Sort sort);

    @Query("SELECT p from Person p where id=:id")
    Person findById(@Param("id") Integer id);

    @Query("SELECT p from Person p where firstName=:firstName")
    Person findByFirstName(@Param("firstName") String firstName);

    @Query("SELECT p from Person p where lastName=:lastName")
    Person findByLastName(@Param("lastName") String lastName);

    @Query("SELECT firstName from Person where id=25")
    String findFirstNameWithAge25();

    @Query("SELECT firstName,lastName from Person where id=25")
    List<Object[]> findNameOfAge25();

    @Query("SELECT p from Person p where id=25")
    Person findPersonRecordWithAge25();

    @Query(value = "SELECT Count(*) from Person where firstName=:name",nativeQuery = true)
    Integer countByName(@Param("name") String name);

    int countById(Integer id);

    List<Person> findFirst3ByFirstName(String firstName);

    Person findDistinctByFirstName(String firstName);

    List<Person> findByFirstNameOrAge(String firstName, Integer age);

    List<Person> findByFirstNameAndAge(String firstName, Integer age);

    List<Person> findByAgeBetween(Integer min,Integer max);

    List<Person> findByAgeLessThan(Integer age);

    List<Person> findByAgeGreaterThanEqual(Integer age);

    List<Person> findByFirstNameLike(String firstName);

    List<Person> findByFirstNameNot(String firstName);

    List<Person> findByAgeIn(List<Integer> ageList);

    List<Person> findByFirstNameIgnoreCase(String firstName);

    List<Person> findByAgeGreaterThanEqualOrderByIdDesc(Integer age);


}
