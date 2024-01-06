package com.numetry.bugtrackingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.numetry.bugtrackingsystem.entity.Bug;

@Repository
public interface BugRepository extends JpaRepository<Bug, Long>{

}
