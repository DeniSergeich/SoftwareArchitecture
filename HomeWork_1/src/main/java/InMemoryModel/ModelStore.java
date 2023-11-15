package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> models;
    public List<Camera> cameras;
    public List<Flash> flashes;
    public List<Scene> scenes;
    private IModelChangedObserver[] changedObserver;

    public ModelStore(IModelChangedObserver[] changedObserver) {
        this.changedObserver = changedObserver;
        this.models = new ArrayList<>();
        this.cameras = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.scenes = new ArrayList<>();
    }

    public Scene getScene(int id) {
        return this.scenes.get(id);
    }


    @Override
    public void notifyChange(IModelChanger sender) {
    }
}
