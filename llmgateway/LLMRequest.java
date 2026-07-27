public class LLMRequest {
    String prompt;
    long estimated_tokens;
    List<ModelCapabilities> capabilitiesRequired;

    public List<ModelCapabilities> getCapabilitiesRequired() {
        return capabilitiesRequired;
    }
}