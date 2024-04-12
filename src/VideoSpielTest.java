import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VideoSpielTest {
	private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Video Spiel";
    private static final String STUDIO = "Game Studio";
    private static final String KONSOLE = "Game Konsole";
    private static final String KATEGORIE = "Kategorie";
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

    
    private Videospiel getMedium()
    {
    	return new Videospiel(TITEL, KONSOLE, STUDIO, KATEGORIE, KOMMENTAR);
    }
}
