package gki.org.onetorulethemall.service.models;

import java.util.List;

public class UserServiceModel extends BaseServiceModel {

    private String username;

    private String password;

    private String email;

    private String gender;

    private List<RoleServiceModel> authorities;

    public UserServiceModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<RoleServiceModel> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<RoleServiceModel> authorities) {
        this.authorities = authorities;
    }
}
