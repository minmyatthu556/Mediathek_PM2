import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VideoSpielTest {
	private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = "Game Konsole";
    private Videospiel _vs1;
    private Videospiel _vs2;
    
    public VideoSpielTest()
    {
    	_vs1 = getMedium();
    	_vs1 = getMedium();
    }
    
    @Test
    public void testGetMedienBezeichnung()
    {
        String bezeichnung = BEZEICHNUNG;
        assertEquals(bezeichnung, _vs1.getMedienBezeichnung());
    }

    @Test
    public void testKonstruktor()
    {
        assertEquals(TITEL, _vs1.getTitel());
        assertEquals(KOMMENTAR, _vs1.getKommentar());
        assertEquals(SYSTEM, _vs1.getSystem());
    }
    
    @Test
    public void testEquals()
    {
        assertFalse("Mehrere Exemplare der gleichen CD sind ungleich",
                _vs1.equals(_vs2));
        assertTrue("Dasselbe Exemplare der gleichen CD ist gleich",
                _vs1.equals(_vs1));
    }
    
    private Videospiel getMedium()
    {
    	return new Videospiel(TITEL, KOMMENTAR, SYSTEM);
    }
}
