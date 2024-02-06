package com.example.demo.repo;

import com.example.demo.model.Book;
import com.example.demo.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop, Integer> {
}
