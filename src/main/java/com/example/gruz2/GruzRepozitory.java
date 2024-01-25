package com.example.gruz2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.lang.String;


public interface GruzRepozitory extends JpaRepository<Gruz, Long> {
    @Query(value = "select p from Gruz p where concat(p.name, '', p.cargo_contents, '',  p.city_out, '', p.city_in) like %:keyword%", nativeQuery = false )
    List<Gruz> search(@Param("keyword") String keyword);


    @Query("select  new com.example.gruz2.GruzStatistic( COUNT(g), g.date_in)  from Gruz g group by g.date_in order by g.date_in")
    List<GruzStatistic> dateGroup();
}