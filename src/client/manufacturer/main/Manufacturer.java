package client.manufacturer.main;

import util.Constants;
import util.NetworkUtil;

import java.io.IOException;
import java.util.List;

public class Manufacturer {

    public static Manufacturer instance=null;
    private NetworkUtil networkUtil;
    private Listener listener;
    private ManufacturerInterface manufacturerInterface;

    private Manufacturer() throws IOException {
        networkUtil = new NetworkUtil(Constants.SERVER_ADDRESS, Constants.SERVER_PORT);
        listener=new Listener(networkUtil);
    }

    public static synchronized Manufacturer getInstance() throws IOException {
        if(instance==null)
            instance=new Manufacturer();
        return instance;
    }

    public void login(String userName,String password){
        try {
            new Login(networkUtil,userName,password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setManufacturerInterface(ManufacturerInterface manufacturerInterface){
        this.manufacturerInterface=manufacturerInterface;
        listener.setManufacturerInterface(manufacturerInterface);
    }

}
