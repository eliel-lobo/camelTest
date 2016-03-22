package co.eliel.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by eliel on 21/03/16.
 */
public class Address {
    @JsonProperty("country") private String country;
    @JsonProperty("state") private String state;
    @JsonProperty("streetAddress") private String streetAddress;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
}
