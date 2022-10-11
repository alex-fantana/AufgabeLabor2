package MVC;

public class CarsController {
    private Cars model;
    private CarsView view;
    public CarsController(Cars model,CarsView view){
        this.model = model;
        this.view = view;
    }

    public void setModelName(String Model) {
        model.setModel(Model);
    }
    public void setModelFirm(String name){
        model.setFirm(name);
    }
    public void setModelID(int number){
        model.setID(number);
    }
    public String getCarName(){
        return model.getModel();
    }
    public String getCarFirm(){
        return model.getFirm();
    }
    public int getCarID(){
        return model.getID();
    }
    public void updateView(){
        view.printCars(model.getModel(), model.getFirm(), model.getID());
    }
}
