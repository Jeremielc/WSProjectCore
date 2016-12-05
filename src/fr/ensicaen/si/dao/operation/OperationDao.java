package fr.ensicaen.si.dao.operation;

import java.util.List;

import fr.ensicaen.si.model.Operation;
import fr.ensicaen.si.model.Resultat;

public class OperationDao implements IOperationDao {

	public static OperationDao instance;
	private IOperationDao delegate;

	private OperationDao() {

	}

	public static OperationDao getInstance() {
		if (instance == null) {
			instance = new OperationDao();
		}

		return instance;
	}
	
	public boolean isDelegated() {
		return !(delegate == null);
	}

	public void setDelegate(IOperationDao delegate) {
		this.delegate = delegate;
	}

	@Override
	public List<Operation> getById(int id) {
		return delegate.getById(id);
	}

	@Override
	public Resultat getByName(String name) {
		return delegate.getByName(name);
	}

	@Override
	public Resultat getByFullname(String surname, String name) {
		return delegate.getByFullname(surname, name);
	}
}
