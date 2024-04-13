import java.util.List;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

/**
 * Ein MedienDetailAnzeigerWerkzeug ist ein Werkzeug um die Details von Medien
 * anzuzeigen.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2024
 */
class MedienDetailAnzeigerWerkzeug
{
    private MedienDetailAnzeigerUI _ui;

    /**
     * Initialisiert ein neues MedienDetailAnzeigerWerkzeug.
     */
    public MedienDetailAnzeigerWerkzeug()
    {
        _ui = new MedienDetailAnzeigerUI();
    }

    /**
     * Setzt die Liste der Medien deren Details angezeigt werden sollen.
     * 
     * @param medien Eine Liste von Medien.
     * 
     * @require (medien != null)
     */
    public void setMedien(List<Medium> medien)
    {
        assert medien != null : "Vorbedingung verletzt: (medien != null)";
        
        
        TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
        selectedMedienTextArea.setText("");
        
        for (Medium medium : medien)
        {
        	selectedMedienTextArea.appendText(medium.getFormatiertenString());
        }
        
        	
      }
        
//   public void setMedien(List<Medium> medien)
//   {
//       assert medien != null : "Vorbedingung verletzt: (medien != null)";
//            
//            
//       TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
//       selectedMedienTextArea.setText("");
//            
//       for (Medium medium : medien)
//       {
//	     	if (medium instanceof CD) 
//       			{
//	            		CD cd = (CD) medium;
//	            		selectedMedienTextArea.setText("Titel: " +  cd.getTitel() +
//								"\nInterpret: " + cd.getInterpret() +
//								"\nSpiellänge: " + cd.getSpiellaenge() +
//								"\nKommentar: " + cd.getKommentar() + "\n");
//	        		} 
//        			else if (medium instanceof DVD) 
//        			{
//	            		DVD dvd = (DVD) medium;
//	            		selectedMedienTextArea.setText("Titel: " +  dvd.getTitel() +
//								"\nRegisseur: " + dvd.getRegisseur() +
//								"\nLaufzeit: " + dvd.getLaufzeit() +
//								"\nKommentar: " + dvd.getKommentar() + "\n");
//	       			} 
//        			else if (medium instanceof Videospiel) 
//        			{
//	            		Videospiel videospiel = (Videospiel) medium;
//	            		selectedMedienTextArea.setText("Titel: " +  vs.getTitel() +
//								"\nSystem: " + vs.getSystem() +
//								"\nKommentar: " + vs.getKommentar() + "\n");
//	        		}
//            	
//            }
//		}

    /**
     * Gibt das Panel dieses Subwerkzeugs zurück.
     * 
     * @ensure result != null
     */
    public Pane getUIPane()
    {
        return _ui.getUIPane();
    }
}
