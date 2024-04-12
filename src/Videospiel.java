
class Videospiel implements Medium 
{
	private String _kommentar;
	private String _titel;
	private String _konsole;
	private String _kategorie;
	private String _studio;
	
	public Videospiel(String titel, String konsole, String studio, String kategorie, String kommentar)
	{
		_kommentar = kommentar;
		_titel = titel;
		_konsole = konsole;
		_kategorie = kategorie;
		_studio = studio;
		
	}

	@Override
	public String getKommentar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMedienBezeichnung() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitel() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
