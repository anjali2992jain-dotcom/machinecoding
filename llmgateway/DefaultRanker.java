public class DefaultRanker implements ModelRanker {
    public List<Model> rank(List<Model> inputModels) {
        //perform default ranking based on 1. cheapest model and then 2. p95 latency
        //and return the list of ranked models
    }
}