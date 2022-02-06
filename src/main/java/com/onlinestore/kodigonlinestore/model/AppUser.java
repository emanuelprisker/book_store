package com.onlinestore.kodigonlinestore.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
    public abstract class  AppUser {
    private int userId;
    private String name;
    private String lastName;
    private String email;
    private boolean isAdmin;
    private String password;


    public AppUser(int userId,
                String name,
                String lastName,
                String email,
                boolean isAdmin,
                String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.isAdmin = isAdmin;
        this.password = password;
    }

        public AppUser(int userId) {
            this.userId = userId;
        }
}
