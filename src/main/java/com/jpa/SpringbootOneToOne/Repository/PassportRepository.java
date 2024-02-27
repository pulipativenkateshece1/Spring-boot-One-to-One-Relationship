package com.jpa.SpringbootOneToOne.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.SpringbootOneToOne.Entity.Passport;
@Repository
public interface PassportRepository extends JpaRepository<Passport, Long> {

}
