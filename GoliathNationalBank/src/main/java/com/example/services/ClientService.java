package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entity.Client;

public interface ClientService {

    public Client createClient(Client Client);

    public List<Client> getAllClients();

    public Optional<Client> getClientById(int id);

    public boolean deleteClientId(int id);
}
