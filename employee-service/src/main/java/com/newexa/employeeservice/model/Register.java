package com.newexa.employeeservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;
	private String accessToken;
    private String role;

	public int getId() {
		return id;
	}

    public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
