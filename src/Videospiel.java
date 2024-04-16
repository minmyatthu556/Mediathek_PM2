
class Videospiel implements Medium 
{
	private String _kommentar;
	private String _titel;
	private String _system;
	
	public Videospiel(String titel, String kommentar, String system)
	{
		assert titel != null : "Vorbedingung verletzt: titel != null";
		assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
		assert system != null : "Vorbedingung verletzt: system != null";
		
		_kommentar = kommentar;
		_titel = titel;
		_system = system;
		
	}

	@Override
	public String getKommentar() {
		// TODO Auto-generated method stub
		return _kommentar;
	}
	
	@Override
	public String getTitel()
	{
		return _titel;
	}
	
	public String getSystem()
	{
		return _system;
	}

	@Override
	public String getMedienBezeichnung() {
		// TODO Auto-generated method stub
		return "Videospiel";
	}

	@Override
	public String getFormatiertenString() {
		// TODO Auto-generated method stub
		return "Titel: " +  getTitel() +
        		"\nSystem: " + getSystem() +
        		"\nKommentar: " + getKommentar() + "\n" +
        		"--------------------\n";
	}

	// hadia hat hier was geändert.

}
