package fr.ensicaen.si.model;

import java.util.List;

public class Resultat {
	private List<Client> clientList;
	private List<Operation> operationList;
	
	public Resultat() {
		
	}

	public List<Client> getClientList() {
		return clientList;
	}

	public List<Operation> getOperationList() {
		return operationList;
	}

	public void setClientList(List<Client> clientList) {
		this.clientList = clientList;
	}

	public void setOperationList(List<Operation> operationList) {
		this.operationList = operationList;
	}
}
