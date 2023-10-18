package crud;

import crud.dao.TicketDao;
import entity.Client;
import entity.Planet;
import entity.Ticket;

public class TicketCrudService {
    private TicketDao ticketDao = new TicketDao();

    //Create
    public void saveTicket(Ticket ticket) {
        ClientCrudService clientCrudService = new ClientCrudService();
        PlanetCrudService planetCrudService = new PlanetCrudService();

        Client client = ticket.getClient();
        Planet fromPlanet = ticket.getFromPlanet();
        Planet toPlanet = ticket.getToPlanet();

        if (client == null || fromPlanet == null || toPlanet == null) {
            throw new IllegalArgumentException("Client and planets must be specified");
        }

        if (clientCrudService.findPlanetById(client.getId()) == null) {
            throw new IllegalArgumentException("Client does not exist in the database");
        }
        if (planetCrudService.findPlanetById(fromPlanet.getId()) == null) {
            throw new IllegalArgumentException("From planet does not exist in the database");
        }
        if (planetCrudService.findPlanetById(toPlanet.getId()) == null) {
            throw new IllegalArgumentException("To planet does not exist in the database");
        }

        ticketDao.save(ticket);
    }

    //Read
    public Ticket findPlanetById(long id) {
        return ticketDao.findById(id);
    }

    //Update
    public void updateClient(Ticket ticket) {
        ticketDao.update(ticket);
    }

    //Delete
    public void deleteClient(Ticket ticket) {
        ticketDao.delete(ticket);
    }
}

