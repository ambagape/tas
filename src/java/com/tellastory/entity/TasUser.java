/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tellastory.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author edsgICT-WB52
 */
@Entity
public class TasUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String email;    
    private String password;
    private String lastname;
    private String firtsname;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = String.valueOf(password.hashCode());
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirtsname() {
        return firtsname;
    }

    public void setFirtsname(String firtsname) {
        this.firtsname = firtsname;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof TasUser)) {
            return false;
        }
        TasUser other = (TasUser) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tellastory.entity.User[ id=" + email + " ]";
    }
    
}
