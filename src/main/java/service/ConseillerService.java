package service;

import java.util.List;

import model.Conseiller;
import persistence.ConseillerDao;
import persistence.IDao;

public class ConseillerService implements IConseillerService {

	private IDao dao = new ConseillerDao();
	
	@Override
	public boolean addConseiller(Conseiller c) {
		return dao.add(c);
	}

	@Override
	public Conseiller getConseiller(int id) {
		return dao.findById(id);
	}

	@Override
	public boolean updateConseiller(Conseiller c, int id) {
		return dao.update(c, id);
	}

	@Override
	public boolean deleteConseiller(int id) {
		return dao.delete(id);
	}

	@Override
	public List<Conseiller> getAllConseiller() {
		return  dao.findAll();
	}

}
