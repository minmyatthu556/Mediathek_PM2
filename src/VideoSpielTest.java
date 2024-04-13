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
    public void testGetTitel()
    {
    	String titel = TITEL;
    	assertEquals(titel, _vs1.getTitel());
    }
    
    @Test
    public void testGetKommentar()
    {
    	String kommentar = KOMMENTAR;
    	assertEquals(kommentar, _vs1.getKommentar());
    }
    
    @Test 
    public void testGetSystem()
    {
    	String system = SYSTEM;
    	assertEquals(system, _vs1.getSystem());
    }
    
    private Videospiel getMedium()
    {
    	return new Videospiel(TITEL, KOMMENTAR, SYSTEM);
    }
}
