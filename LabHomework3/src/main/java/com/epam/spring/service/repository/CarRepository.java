package com.epam.spring.service.repository;

import com.epam.spring.service.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    boolean existsById(int id);

    Car findById(int id);

    List<Car> findByModel(String model);

    /**
     * TODO
     *
     * Optional<User> findById(int id);

     List<Car> findbyCarclass(Carclass carclass);


     @Query("select c from car c where c.model like '?1%'")
     Car findModelByFirstLetterPageableSorted (char firstLetter, Pageable pageable, Sort sort);

     @Query(nativeQuery = true)
     List<Car> findByFirstLetterAndPriceBetween(@Param("firstLetter") char firstLetter,
     @Param("startPriceRange") float startPriceRange,
     @Param("endPriceRange") float endPriceRange);

     //NamedQuery
     Car findMostExpensiveCar ();
     */
}
