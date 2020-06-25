package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("timer")
//@Scope(scopeName = "singleton")
public class Timer {

    private Timer timer;


    public Timer() {
    }


    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }


    public void setNanoTime(Long nanoTime) { //установим зависимость с помощью сеттера
        this.nanoTime = nanoTime;
    }
}
