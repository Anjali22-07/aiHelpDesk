package com.springai.heldesk.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springai.heldesk.entity.Mentor;



public interface MentorRepository extends JpaRepository<Mentor, Integer> {

    Optional<Mentor>  findByCategory(String Category);

}
