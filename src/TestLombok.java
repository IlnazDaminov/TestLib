import lombok.Getter;
import lombok.extern.java.Log;

import java.util.logging.Level;

@Log
public class TestLombok{
    @Getter
    private int a;

    private int b;

    public void hiLog(){
        log.log(Level.WARNING,"Hello loger");
    }
}