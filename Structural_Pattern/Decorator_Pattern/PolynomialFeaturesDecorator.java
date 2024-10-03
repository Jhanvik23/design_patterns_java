package Structural_Pattern.Decorator_Pattern;

public class PolynomialFeaturesDecorator extends ModelDecorator {

    public PolynomialFeaturesDecorator(MLModel model) {
        super(model);
    }

    @Override
    public void train() {
        createPolynomialFeatures();
        super.train();
    }

    private void createPolynomialFeatures() {
        System.out.println("Creating polynomial features...");
    }
}
