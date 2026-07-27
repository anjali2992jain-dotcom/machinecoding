/**
 * RateLimiter
 */
public interface RateLimiter {
    public Integer rateLimit(LLMRequest request);//returns the retry after in ms, if null means that req is allowed
}