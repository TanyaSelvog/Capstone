package model;

public class Client {

    private int clientID;

    private void setClientID(int clientID){
        this.clientID = clientID;
    }

    private int getClientID(){
        return clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    private String clientName;

}
