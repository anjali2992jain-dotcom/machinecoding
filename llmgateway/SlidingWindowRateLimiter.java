public class SlidingWindowRateLimiter implements RateLimiter {
    Queue<Integer> slidingWindow = new LinkedList<>();
    int allowedRequests;
    int windowSec;

    public Integer rateLimit(Request request) {
        //implements the sliding window algorithm
    }
}