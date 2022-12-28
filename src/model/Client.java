package model;

public class Client {

    private int clientID;
    private String clientName;

    private String address;
    private String phone;
    private String postal;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }



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



}
