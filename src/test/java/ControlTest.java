import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControlTest {

    @Test
    void deveRetornarPublicoPagante() {
        Arena arena = new Arena(
                new Viewer("Wanderlei Silva","A1", true),
                new Viewer("Anderson Silva", "B6",true),
                new Viewer("Mirko Cro Cop", "C3", false),
                new Viewer("Jon Jones","G7", true),
                new Viewer("José Aldo", "A3", false),
                new Viewer("Francis Ngannou","C4", true),
                new Viewer("Junior Cigano","D4", true),
                new Viewer("Vitor Belfort", "H3", false),
                new Viewer("Holly Holm","J2", true),
                new Viewer("Amanda Nunes", "A5", false)
        );
        assertEquals(6, Control.payingAudience(arena));
    }

    @Test
    void deveRetornarPublicoPresente() {
        Arena arena = new Arena(
                new Viewer("Wanderlei Silva","A1", true),
                new Viewer("Anderson Silva", "B6",true),
                new Viewer("Mirko Cro Cop", "C3", false),
                new Viewer("Jon Jones","G7", true),
                new Viewer("José Aldo", "A3", false),
                new Viewer("Francis Ngannou","C4", true),
                new Viewer("Junior Cigano","D4", true),
                new Viewer("Vitor Belfort", "H3", false),
                new Viewer("Holly Holm","J2", true),
                new Viewer("Amanda Nunes", "A5", false)
        );
        assertEquals(10, Control.presentAudience(arena));
    }
}