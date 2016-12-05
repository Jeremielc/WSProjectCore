package fr.ensicaen.si.dao.operation;

import java.util.List;

import fr.ensicaen.si.model.Operation;
import fr.ensicaen.si.model.Resultat;

public interface IOperationDao {
	
	List<Operation> getById(int id);
	Resultat getByName(String name);
	Resultat getByFullname(String surname, String name);
}
