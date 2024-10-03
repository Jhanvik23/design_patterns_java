package Structural_Pattern.Decorator_Pattern;

public class MLModelPipeline {

    public static void main(String[] args) {
       
        MLModel model = new DecisionTreeModel();

        
        model = new FeatureScalingDecorator(model);  
        model = new FeatureSelectionDecorator(model);  
        model = new PolynomialFeaturesDecorator(model);  

        
        model.train();
    }
}
