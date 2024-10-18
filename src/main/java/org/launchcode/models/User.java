package org.launchcode.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank
    @Size(min = 5, max = 15, message = "You must enter a username between 5 and 15 characters.")
    private String username;

    @Email(message = "Sorry, this field must be a valid email address format")
    private String email;

    @NotBlank(message = "You must enter a password of at least 6 characters!")
    @Min(6)
    private String password;


    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public  User(){
        //empty constructor for model methods and such
    }

    //Getter username
    public String getUsername() {
        return username;
    }

    //Setter username
    public void setUsername(String username) {
        this.username = username;
    }

    //Getter email
    public String getEmail() {
        return email;
    }

    //Setter email
    public void setEmail() {
        this.email = email;
    }

    //Getter password
    public String getPassword() {
        return password;
    }

    //Setter password
    public void setPassword(String password) {
        this.password = password;
    }
}
