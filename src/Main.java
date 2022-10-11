import MVC.Cars;
import MVC.CarsController;
import MVC.CarsView;

public class Main {
    public static void main(String[] args) {
        Cars model = retriveCars();
        CarsView view = new CarsView();
        CarsController controller = new CarsController(model,view);
        controller.updateView();
        controller.setModelName("Spring");
        controller.updateView();
    }
    private static Cars retriveCars(){
        Cars model = new Cars();
        model.setModel("Logan");
        model.setFirm("Dacia");
        model.setID(1);
        return model;
    }
}
