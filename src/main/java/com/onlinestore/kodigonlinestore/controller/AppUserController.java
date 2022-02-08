package com.onlinestore.kodigonlinestore.Controller;

import com.onlinestore.kodigonlinestore.Model.AppUser;
import com.onlinestore.kodigonlinestore.Repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AppUserController {

    @Autowired
    private AppUserRepository appUserRepository;

    @GetMapping("/Users")
    public List<AppUser> getAllAppUsers() {
        return appUserRepository.findAll();
    }


}
