package com.numetry.bugtrackingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.numetry.bugtrackingsystem.entity.Bug;
import com.numetry.bugtrackingsystem.service.BugService;

@RestController
@RequestMapping("/bugs")
public class BugController {
	 @Autowired
	    private BugService bugService;

	    @GetMapping
	    public List<Bug> getAllBugs() {
	        return bugService.getAllBugs();
	    }
	    @PostMapping
	    public Bug createBug(@RequestBody Bug bug) {
	        return bugService.createBug(bug);
	    }
}
