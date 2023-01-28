import programs.foxandhounds.player.Player;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;


public class PlayerTest {
    @Mock
    Player jatekos = new Player();

    @Test
    void setName(){
        jatekos.setName("smth");
        assertEquals(jatekos.getName(),"smth");
    }



}
