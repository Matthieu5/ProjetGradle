package ProjetGradel;

import ProjetGradle.Model.IModel;
import ProjetGradle.controller.Controller;
import ProjetGradle.Model.Model;
import ProjetGradle.view.IView;
import ProjetGradle.view.View;

public class ProjetGradle {
    public static void main(String[] args) {
        Controller c = new Controller((IView) new Model(), (IModel) new View());
        c.run();
    }
}


