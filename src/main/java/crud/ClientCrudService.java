package crud;

import crud.dao.ClientDao;
import entity.Client;

public class ClientCrudService {
    private ClientDao clientDao = new ClientDao();


    //Create
    public void saveClient(Client client) {
        clientDao.save(client);
    }

    //Read
    public Client findPlanetById(long id) {
        return clientDao.findById(id);
    }

    //Update
    public void updateClient(Client client) {
        clientDao.update(client);
    }

    //Delete
    public void deleteClient(Client client) {
        clientDao.delete(client);
    }
}