public class TokenBudgetTracker {
    String clientId;
    int availableTokens;
    
    public boolean allowed(int requiredTokens) {
        //implement threadsafe algorithm to check if the requested tokens are allowed or not
        return false; //in reality return the outcom based on the evaluation
    }
}