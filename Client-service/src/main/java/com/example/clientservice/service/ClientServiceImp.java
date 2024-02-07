package com.example.clientservice.service;

import com.example.clientservice.dto.ClientRequest;
import com.example.clientservice.dto.ClientResponses;
import com.example.clientservice.entities.Client;
import com.example.clientservice.mappper.ClientInterfaceMapper;
import com.example.clientservice.repository.ClientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service


@Transactional
public class ClientServiceImp implements  ClientInterfaceService{

@Autowired
    ClientRepository clientRepository;

@Autowired
ClientInterfaceMapper clientMapperImp;
    @Override
    public ClientResponses getById(Integer id) {

        Client client=clientRepository.findById(id).get();
        ClientResponses res= clientMapperImp.Client_To_ClientResponses(client);
        return  res;


    }

    @Override
    public List<ClientResponses> getAll() {

        List<Client> lc=new ArrayList<Client>();
        lc=clientRepository.findAll();
        List<ClientResponses> lr=new ArrayList<ClientResponses>();
        for(Client c:lc){

            ClientResponses cc=new ClientResponses();
           cc =clientMapperImp.Client_To_ClientResponses(c);

            lr.add(cc);
        }
        return lr;



    }

    @Override
    public void add(ClientRequest req) {

      Client c=  clientMapperImp.ClientRequest_To_Client(req);
      clientRepository.save(c);
    }

    @Override
    public void modifier(Integer id, ClientRequest res) {

        Client c=clientRepository.findById(id).get();

        if(res.getName()!=null)
            c.setName(res.getName());
        if(res.getAdresse()!=null)
            c.setAdresse(res.getAdresse());
        if(res.getEmail()!=null)
            c.setEmail(res.getEmail());

        clientRepository.save(c);
    }

    @Override
    public void supprimer(Integer id) {
        clientRepository.deleteById(id);

    }
}
