import java.util.*;
import java.lang.*;

public class CircuitBreaker {
 State state;
 int failureThreshold;
 long windowSeconds;
 long recoveryTimeout;
Queue<Integer> queue = new LinkedList<Integer>();

public boolean execute(Request request) {

    //check the status if open 
        //if recovery time out elapsed then try 1 request
        //return with false

    //if close then try
        //if success then return true
        //if failure threshold reached then open return false;
        //otherwise just add failure then return false;

    //if half open try
        //if success set closed, reset failure count/queue and return true;
        //if failed start recovery timeout
}
    
};  