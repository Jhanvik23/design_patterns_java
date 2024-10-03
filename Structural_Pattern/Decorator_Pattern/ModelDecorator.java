package Structural_Pattern.Decorator_Pattern;

public abstract class ModelDecorator implements MLModel {
    protected MLModel model;

    public ModelDecorator(MLModel model) {
        this.model = model;
    }

    @Override
    public void train() {
        model.train();
    }
}
