package mk.finki.ukim;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    public List<User> setList() {
        List<User> list = new ArrayList<>();

        return list;
    }

    @Test
    void multipleCondition(){
        RuntimeException ex;
        //TXX (прв услов се исполнува)
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null,setList()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //FTX (втор услов)
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(new User("darko",null,"darko@gmail.com"),setList()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //FFT (трет услов)
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(new User("darko","Darko21?!",null),setList()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //FFF (ништо не се исполнува)
        assertTrue(SILab2.function(new User("darko","Darko21?!","darko@gmail.com"),setList()));
    }
    @Test
    void everyBranch1(){
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null,setList()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    }

    @Test

    void everyBranch2(){
        User user = new User(null,"Darko21?","darko@gmail.com");
        assertFalse(SILab2.function(user,setList()));
    }

    @Test

    void everyBranch3(){
        User user = new User("darko","darko","darko@gmail.com");
        assertFalse(SILab2.function(user,setList()));
    }

    @Test

    void everyBranch4(){
        User user = new User("darko","Darko da","darko@gmail.com");
        assertFalse(SILab2.function(user,setList()));
    }

    @Test
    void everyBranch5(){
        User user = new User("darko","Darkodarko","darko@gmail.com");
        assertFalse(SILab2.function(user,setList()));
    }


}
