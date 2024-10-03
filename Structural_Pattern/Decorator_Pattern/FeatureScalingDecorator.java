package Structural_Pattern.Decorator_Pattern;

public class FeatureScalingDecorator extends ModelDecorator {

    public FeatureScalingDecorator(MLModel model) {
        super(model);
    }

    @Override
    public void train() {
        applyFeatureScaling();
        super.train();
    }

    private void applyFeatureScaling() {
        System.out.println("Applying feature scaling...");
    }
}
