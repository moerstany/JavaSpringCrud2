package models;

public class Buyers {
    public Integer id;
    public String strifirst_name;
    public String last_name;
    public String email;
    public String city;
    public String country;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStrifirst_name() {
        return strifirst_name;
    }

    public void setStrifirst_name(String strifirst_name) {
        this.strifirst_name = strifirst_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



    public Buyers(Integer id, String strifirst_name, String last_name, String email, String city, String country) {
        this.id = id;
        this.strifirst_name = strifirst_name;
        this.last_name = last_name;
        this.email = email;
        this.city = city;
        this.country = country;
    }

    public Buyers() {
        this.id = null;
        this.strifirst_name = "strifirst_name";
        this.last_name = "last_name";
        this.email = "email";
        this.city = "city";
        this.country = "country";
    }
}
