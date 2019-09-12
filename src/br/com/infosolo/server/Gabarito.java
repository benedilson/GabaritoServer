package br.com.infosolo.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Gabarito extends Remote{

	String mensagem(String mensagem) throws RemoteException;
	
}
