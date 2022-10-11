import MVC.Cars;
import MVC.CarsController;
import MVC.CarsView;

public class Main {
    public static void main(String[] args) {
        Cars[] model = new Cars[2];
        model[0] = retriveCars();
        CarsView view = new CarsView();
        CarsController controller = new CarsController(model[0],view);
        controller.updateView();
        controller.setModelName("Spring");
        controller.updateView();
        model[1] = retriveCars2();
        CarsController controller2 = new CarsController(model[1],view);
        controller2.updateView();
    }
    private static Cars retriveCars(){
        Cars model = new Cars();
        model.setModel("Logan");
        model.setFirm("Dacia");
        model.setID(1);
        return model;
    }
    private static Cars retriveCars2(){
        Cars model = new Cars();
        model.setModel("Papuc");
        model.setFirm("Dacia");
        model.setID(2);
        return model;
    }
}
