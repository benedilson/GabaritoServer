package br.com.infosolo.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GabaritoImpl extends UnicastRemoteObject implements Gabarito {

	protected GabaritoImpl() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 9074475875739453368L;

	@Override
	public String mensagem(String mensagem) throws RemoteException {
		System.out.println("############## OPS , CHEGOU UMA MENSAGEM !!!");
		System.out.println(mensagem);
		System.out.println("############## QUE LEGAL FUNFA...");
		return mensagem;
	}
	
}
