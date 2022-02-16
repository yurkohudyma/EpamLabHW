package com.epam.spring.service.repository;

import com.epam.spring.service.model.Car;
import com.epam.spring.service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Long> {

    Optional<User> findById(long id);

    boolean existsById(long id);

    //@Query("select c from car c where c.model like '?1%'")
    //Car findModelByFirstLetterPageableSorted (char firstLetter, Pageable pageable, Sort sort);

    /*@Query(nativeQuery = true)
    List<Car> findByFirstLetterAndPriceBetween(@Param("firstLetter") char firstLetter,
                                               @Param("startPriceRange") float startPriceRange,
                                               @Param("endPriceRange") float endPriceRange);
    */
    /** NamedQuery */
    //Car findMostExpensiveCar ();
}
