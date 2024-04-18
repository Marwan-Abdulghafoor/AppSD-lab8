package com.example.springjwt.repo;


import com.example.springjwt.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
    public Address findByZip(String zip);
}
