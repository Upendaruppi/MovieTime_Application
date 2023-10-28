package com.movietime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movietime.model.Admin;
import com.movietime.service.AdminJpaService;

@RestController
@RequestMapping("/admin")
public class AdminController {


    @Autowired
    private AdminJpaService adminJpaService;


    @PostMapping("/login")
    public Admin adminLogin(@RequestParam String email, @RequestParam String password, @RequestParam String role) {
        return adminJpaService.adminLogin(email, password, role);
    }

    @PostMapping("/add")
    public void addAdmin(@RequestBody Admin admin) {
    	adminJpaService.addAdmin(admin);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAdmin(@PathVariable int id) {
    	adminJpaService.deleteAdmin(id);

    }





}
