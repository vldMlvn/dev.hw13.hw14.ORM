package crud;

import crud.dao.PlanetDao;
import entity.Planet;

public class PlanetCrudService {
    private PlanetDao planetDao = new PlanetDao();

    //Create
    public void savePlanet(Planet planet) {
        planetDao.save(planet);
    }

    //Read
    public Planet findPlanetById(String id) {
        return planetDao.findById(id);
    }

    //Update
    public void updatePlanet(Planet planet) {
        planetDao.update(planet);
    }

    //Delete
    public void deletePlanet(Planet planet) {
        planetDao.delete(planet);
    }
}
