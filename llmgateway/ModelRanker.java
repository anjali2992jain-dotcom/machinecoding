/**
 * ModelRanker
 */
public interface ModelRanker {
    public List<Model> rank(List<Model> inputModels);
}