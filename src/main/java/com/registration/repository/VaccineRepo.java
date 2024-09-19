package com.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registration.model.Vaccine;
@Repository
public interface VaccineRepo extends JpaRepository<Vaccine,String>{

}
