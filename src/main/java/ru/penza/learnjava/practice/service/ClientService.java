package ru.penza.learnjava.practice.service;

import ru.penza.learnjava.practice.view.ClientView;
import java.util.List;

public interface ClientService {
    ClientView getClient(Long id);
    List<ClientView> getAllClients();
    void update(ClientView view);
    void delete(Long id);
}


