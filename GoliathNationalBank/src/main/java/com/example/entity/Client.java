package com.example.entity;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "Clients")

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_client;
    private int tipeIdentification;
    private int number_Identification;
    private String name_Client;
    private String lastNameClient;
    private String email_Client;
    private Date client_bornDate;
    private Date creation_date;
    private String creation_user;
    private Date modification_dateTime;
    private String user_modification;
    private String client_Direction;

    /**
     * 
     */
    public Client() {
        /* constructor empty */ }

    /**
     * @return int return the id_client
     */
    public int getId_client() {
        return id_client;
    }

    /**
     * @param id_client the id_client to set
     */
    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    /**
     * @return int return the tipeIdentification
     */
    public int getTipeIdentification() {
        return tipeIdentification;
    }

    /**
     * @param tipeIdentification the tipeIdentification to set
     */
    public void setTipeIdentification(int tipeIdentification) {
        this.tipeIdentification = tipeIdentification;
    }

    /**
     * @return int return the number_Identification
     */
    public int getNumber_Identification() {
        return number_Identification;
    }

    /**
     * @param number_Identification the number_Identification to set
     */
    public void setNumber_Identification(int number_Identification) {
        this.number_Identification = number_Identification;
    }

    /**
     * @return String return the name_Client
     */
    public String getName_Client() {
        return name_Client;
    }

    /**
     * @param name_Client the name_Client to set
     */
    public void setName_Client(String name_Client) {
        this.name_Client = name_Client;
    }

    /**
     * @return String return the lastNameClient
     */
    public String getLastNameClient() {
        return lastNameClient;
    }

    /**
     * @param lastNameClient the lastNameClient to set
     */
    public void setLastNameClient(String lastNameClient) {
        this.lastNameClient = lastNameClient;
    }

    /**
     * @return String return the email_Client
     */
    public String getEmail_Client() {
        return email_Client;
    }

    /**
     * @param email_Client the email_Client to set
     */
    public void setEmail_Client(String email_Client) {
        this.email_Client = email_Client;
    }

    /**
     * @return Date return the client_bornDate
     */
    public Date getClient_bornDate() {
        return client_bornDate;
    }

    /**
     * @param client_bornDate the client_bornDate to set
     */
    public void setClient_bornDate(Date client_bornDate) {
        this.client_bornDate = client_bornDate;
    }

    /**
     * @return Date return the creation_date
     */
    public Date getCreation_date() {
        return creation_date;
    }

    /**
     * @param creation_date the creation_date to set
     */
    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    /**
     * @return String return the creation_user
     */
    public String getCreation_user() {
        return creation_user;
    }

    /**
     * @param creation_user the creation_user to set
     */
    public void setCreation_user(String creation_user) {
        this.creation_user = creation_user;
    }

    /**
     * @return Date return the modification_dateTime
     */
    public Date getModification_dateTime() {
        return modification_dateTime;
    }

    /**
     * @param modification_dateTime the modification_dateTime to set
     */
    public void setModification_dateTime(Date modification_dateTime) {
        this.modification_dateTime = modification_dateTime;
    }

    /**
     * @return String return the user_modification
     */
    public String getUser_modification() {
        return user_modification;
    }

    /**
     * @param user_modification the user_modification to set
     */
    public void setUser_modification(String user_modification) {
        this.user_modification = user_modification;
    }

    /**
     * @return String return the client_Direction
     */
    public String getClient_Direction() {
        return client_Direction;
    }

    /**
     * @param client_Direction the client_Direction to set
     */
    public void setClient_Direction(String client_Direction) {
        this.client_Direction = client_Direction;
    }

}
