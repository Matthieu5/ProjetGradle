package ProjetGradle.controller;

import ProjetGradle.Model.IModel;
import ProjetGradle.view.IView;

public class Controller {
    private IView view;
    private IModel model;

    public Controller(IView view, IModel model) {
        this.view = view;
        this.model = model;
    }
    public void run()
    {
        view.display(model.getMessage());
    }
}