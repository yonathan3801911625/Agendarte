package edu.grupo05.agendarte.entity;

// Importing required classes
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

// Annotations
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

//// Adding the table name
//@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userCedula;
    private String userName;
    private String userLastName;
    private String userAddress;
    private String userTelephone;
    private String userMail;
    private String userGender;


    // Mapping to the other table
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Event> event;
    public long getUserId() { return userId; }

//    public User() {}

//    public User(Long userId, String userCedula, String userName, String userLastName, String userAddress, String userTelephone, String userMail, String userGender) {
//        this.userId = userId;
//        this.userCedula = userCedula;
//        this.userName = userName;
//        this.userLastName = userLastName;
//        this.userAddress = userAddress;
//        this.userTelephone = userTelephone;
//        this.userMail = userMail;
//        this.userGender = userGender;
//    }


//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }
//
//    public String getUserCedula() {
//        return userCedula;
//    }
//
//    public void setUserCedula(String userCedula) {
//        this.userCedula = userCedula;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getUserLastName() {
//        return userLastName;
//    }
//
//    public void setUserLastName(String userLastName) {
//        this.userLastName = userLastName;
//    }
//
//    public String getUserAddress() {
//        return userAddress;
//    }
//
//    public void setUserAddress(String userAddress) {
//        this.userAddress = userAddress;
//    }
//
//    public String getUserTelephone() {
//        return userTelephone;
//    }
//
//    public void setUserTelephone(String userTelephone) {
//        this.userTelephone = userTelephone;
//    }
//
//    public String getUserMail() {
//        return userMail;
//    }
//
//    public void setUserMail(String userMail) {
//        this.userMail = userMail;
//    }
//
//    public String getUserGender() {
//        return userGender;
//    }
//
//    public void setUserGender(String userGender) {
//        this.userGender = userGender;
//    }

//    public Set<edu.grupo05.agendarte.entity.Event> getEvent() {
//        return event;
//    }
//
//    public void setEvent(Set<edu.grupo05.agendarte.entity.Event> event) {
//        this.event = event;
//    }
}
