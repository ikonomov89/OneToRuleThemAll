package gki.org.onetorulethemall.service.models;

import gki.org.onetorulethemall.data.models.bankit.Bill;
import gki.org.onetorulethemall.data.models.bankit.Card;
import gki.org.onetorulethemall.data.models.foodbar.Drink;
import gki.org.onetorulethemall.data.models.foodbar.Food;
import gki.org.onetorulethemall.data.models.moviehub.Movie;
import gki.org.onetorulethemall.data.models.musicroom.Musician;

import java.util.List;

public class UserServiceModel extends BaseServiceModel {

    private String username;

    private String password;

    private String email;

    private String gender;

    private List<Musician> musicians;

    private List<Bill> bills;

    private List<Card> cards;

    private List<Movie> movies;

    private List<Food> foods;

    private List<Drink> drinks;

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

    public List<Musician> getMusicians() {
        return musicians;
    }

    public void setMusicians(List<Musician> musicians) {
        this.musicians = musicians;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }
}
