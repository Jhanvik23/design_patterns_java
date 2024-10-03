package Structural_Pattern.Decorator_Pattern;

public class FeatureSelectionDecorator extends ModelDecorator {

    public FeatureSelectionDecorator(MLModel model) {
        super(model);
    }

    @Override
    public void train() {
        selectImportantFeatures();
        super.train();
    }

    private void selectImportantFeatures() {
        System.out.println("Selecting important features...");
    }
}
