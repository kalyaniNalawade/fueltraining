package com.example.onetomanydemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Items, Integer>{

}
