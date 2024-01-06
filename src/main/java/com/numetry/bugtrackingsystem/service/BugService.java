package com.numetry.bugtrackingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numetry.bugtrackingsystem.entity.Bug;
import com.numetry.bugtrackingsystem.repository.BugRepository;

@Service
public class BugService {
	 @Autowired
	    private BugRepository bugRepository;

	    public List<Bug> getAllBugs() {
	        return bugRepository.findAll();
}
	    public Bug createBug(Bug bug) {
	        return bugRepository.save(bug);
	    }
}