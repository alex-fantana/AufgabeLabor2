package MVC;
public class Cars {
    private String Model;
    private String Firm;
    private int ID;

    public String getModel() {
        return Model;
    }

    public int getID() {
        return ID;
    }

    public String getFirm() {
        return Firm;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFirm(String firm) {
        Firm = firm;
    }

    public void setModel(String model) {
        Model = model;
    }
}
