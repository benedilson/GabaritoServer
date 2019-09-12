package br.com.infosolo.server;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Gabarito {
	
	protected Server() throws RemoteException {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		try {
			java.rmi.registry.LocateRegistry.createRegistry(1099);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		runServer ();
	}

	public static void runServer () {
        //Cria e instala o security manager
        //System.setSecurityManager(new RMISecurityManager() );
        try {
        	Server servidor = new Server();
        	String localizacao = "//localhost/servico";
        	
            Naming.rebind(localizacao, servidor);
            System.out.println("Gabarito Server pronto.");
        } catch(Exception e) {
            System.out.println("Gabarito erro"+ e.getMessage());
            e.printStackTrace();
        }
    }

	@Override
	public String mensagem(String mensagem) throws RemoteException {
		return mensagem;
	}
	
}
