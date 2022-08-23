package com.codevui.onetomany;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    public List<Person> findByFirstName(String firstName);

    public List<Person> findByFirstNameContainingAndLastNameContaining(String firstName, String lastName);

    @Query("SELECT p from Person p where p.firstName like ?1 or p.lastName like?1")
    // @Query(value = "select * from person p where p.first_name like ?1 and
    // p.last_name like ?1", nativeQuery = true) native query
    public List<Person> findByFirstNameOrLastNameContaining(String keyword);
}
