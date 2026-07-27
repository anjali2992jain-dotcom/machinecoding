public class RankerFactory {
    static Map<String, String> customerRankingConfig;

    //customerRankingConfig injected in Constructor

    public static ModelRanker getRanker(String customerId) {
        //fetch the ranking config
        String config = customerRankingConfig.get(customerId);
        //add switch case when more rankers are available
        return new DefaultRanker();
    }
}   