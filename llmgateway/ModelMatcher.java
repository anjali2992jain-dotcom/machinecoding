public class ModelMatcher {
    Map<String, Model> modelRegistry;

    ModelMatcher(Map<String, Model> modelRegistry) {
        this.modelRegistry = modelRegistry;
    }

    public List<Model> matchModel(List<ModelCapabilities> capabilitiesRequired) {
        //perform matching based on the requirements from the request and return the list of matched models
    }
}