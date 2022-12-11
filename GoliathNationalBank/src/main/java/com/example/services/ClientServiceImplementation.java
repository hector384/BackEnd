package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repository.ClientRepository;
import com.example.entity.Client;

@Service

public class ClientServiceImplementation implements ClientService {
    @Autowired
    ClientRepository ClientRepository;

    @Override
    public Client createClient(Client client) {
        // TODO Auto-generated method stub
        return ClientRepository.save(client);
    }

    @Override
    public List<Client> getAllClients() {
        // TODO Auto-generated method stub
        return ClientRepository.findAll();
    }

    @Override
    public Optional<Client> getClientById(int id) {
        // TODO Auto-generated method stub
        return ClientRepository.findById(id);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.example.services.ClientService#deleteClientId(int)
     */
    @Override
    public boolean deleteClientId(int id) {
        // TODO Auto-generated method stub
        return getClientById(id).map(client -> {
            ClientRepository.deleteById(id);
            return true;
        }).orElse(false);
    }

}
