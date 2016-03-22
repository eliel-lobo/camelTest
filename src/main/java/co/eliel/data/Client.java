package co.eliel.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by eliel on 21/03/16.
 */
public class Client {
    @JsonProperty("name") private String name;
    @JsonProperty("email") private String email;
    @JsonProperty("address") private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
