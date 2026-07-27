public class ModelValidator {
    Model model;
    RateLimiter rateLimiter;
    TokenBudgetTracker tokenBudgetTracker;

    public ValidationResponse validate(Request request) {
        //check for ratelimit for the given model and given client
        //check for the token budget
        //create response and accordingly return the same
    }
}