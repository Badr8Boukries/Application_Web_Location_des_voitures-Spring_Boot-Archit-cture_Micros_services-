package com.example.clientservice.mappper;

import com.example.clientservice.dto.ClientRequest;
import com.example.clientservice.dto.ClientResponses;
import com.example.clientservice.entities.Client;
import com.example.clientservice.repository.ClientRepository;
import org.springframework.stereotype.Component;

@Component
public class ClientMapperImp implements ClientInterfaceMapper{

    ClientRepository clientRepository;
    @Override
    public Client ClientRequest_To_Client(ClientRequest req) {

        Client c=new Client();

        c.setName(req.getName());
        c.setEmail(req.getEmail());
        c.setAdresse(req.getAdresse());



        return c;
    }

    @Override
    public ClientResponses Client_To_ClientResponses(Client c) {

        ClientResponses res=new ClientResponses();

        res.setName(c.getName());
        res.setAdresse(c.getAdresse());
        res.setIdC(c.getIdC());
        res.setEmail(c.getEmail());

        return res;
    }
}
