package service;

import java.util.List;

import model.Conseiller;

public interface IConseillerService {
	boolean addConseiller(Conseiller c);
	Conseiller getConseiller(int id);
	boolean updateConseiller(int id);
	boolean deleteConseiller(int id);
	List<Conseiller> getAllConseiller();
}
