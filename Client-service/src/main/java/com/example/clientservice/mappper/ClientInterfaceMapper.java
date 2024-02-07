package com.example.clientservice.mappper;

import com.example.clientservice.dto.ClientRequest;
import com.example.clientservice.dto.ClientResponses;
import com.example.clientservice.entities.Client;

public interface ClientInterfaceMapper {

    public Client ClientRequest_To_Client(ClientRequest req);

    public ClientResponses Client_To_ClientResponses(Client c);

}
