package persistence;

import java.util.List;

import model.Conseiller;

public interface IDao {
	boolean add(Conseiller c);
	Conseiller findById(int id);
	boolean update(Conseiller c, int id);
	boolean delete(int id);
	List<Conseiller> findAll();
}
