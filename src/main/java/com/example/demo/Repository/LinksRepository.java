package com.example.demo.Repository;

import com.example.demo.Entity.Links;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinksRepository extends CrudRepository<Links, Integer> {

}
