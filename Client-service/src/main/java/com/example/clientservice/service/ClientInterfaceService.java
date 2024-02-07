package com.example.clientservice.service;

import com.example.clientservice.dto.ClientRequest;
import com.example.clientservice.dto.ClientResponses;

import java.util.List;

public interface ClientInterfaceService {


    //GET ID

    public ClientResponses getById(Integer id);

    //GET

    public List<ClientResponses> getAll();

    //PUT

    public void add(ClientRequest req);

    //Post

    public void modifier(Integer id,ClientRequest res);

    // Delete

    public void supprimer(Integer id);



}
