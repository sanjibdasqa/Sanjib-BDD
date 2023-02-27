package bdd.Nissan.Utils;

import bdd.Nissan.Objects.GetAQuotePage;

public class AutoData {
	private String firstname;
	private String phoneno;
	private String gettitle;
	
	public  AutoData (String gettitle1,String firstname1, String phoneno) {
		
		if( gettitle1==null|| firstname1==null || phoneno==null ||
				gettitle1.length() == 0 ||  firstname1.length() == 0|| phoneno.length() == 0) {
			throw new NullPointerException();
			}else {
				gettitle = gettitle1;
				firstname = firstname1;
				this.phoneno = phoneno;
				
		}
			
	}

	public String getGettitle() {
		return gettitle;
	}	
		
	public String getFirstName() {
		return firstname;
	}
	
	public String getPhoneno() {
		return phoneno;
	}

	
	
	
	

}
