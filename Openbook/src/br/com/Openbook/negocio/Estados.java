package br.com.Openbook.negocio;

public enum Estados {
	 	AC("Acre"),  
	    AL("Alagoas"),  
	    AM("Amazonas"),  
	    AP("Amap�"),  
	    BA("Bahia"),  
	    CE("Cear�"),  
	    DF("Distrito Federal"),  
	    ES("Espirito Santo"),  
	    GO("Goias"),  
	    MA("Maranh�o"),  
	    MG("Minas Gerais"),  
	    MS("Mato Grosso Sul"),  
	    MT("Mato Grosso"),  
	    PA("Par�"),  
	    PB("Paraiba"),  
	    PE("Pernanbuco"),  
	    PI("Piaui"),  
	    PR("Parana"),  
	    RJ("Rio de Janeiro"),  
	    RN("Rio Grande do Norte"),  
	    RO("Rond�nia"),  
	    RR("Roraima"),  
	    RS("Rio Grande do Sul"),  
	    SC("Santa Catarina"),  
	    SE("Sergipe"),  
	    SP("S�o Paulo"),  
	    TO("Tocantins");  
	    
	    private String estado;  
	    private static String[] elementos = null;
	    
	    public static String[] names() {
	    	
	    	if(elementos != null)
	    		return elementos;
	    	
	    	Estados[] states = values();
	        elementos = new String[states.length];

	        for (int i = 0; i < states.length; i++) {
	            elementos[i] = states[i].name();
	        }

	        return elementos;
	    }
	    
	    Estados(String estado) {  
	        this.estado = estado; 
	    }  
	  
	    public String getEstado() {  
	        return estado;  
	    }  
	  
	    @Override  
	    public String toString() {  
	        return estado;  
	    }  

	    
	    public static Estados getValueOf(String str){
	    	Estados[] ci = values();
	    	Estados ret = null;
		    	 for (int i = 0; i < ci.length; i++) {
		    		 if(str.equalsIgnoreCase(ci[i].toString()))
		    		{
		    			 ret= ci[i];
		    			 break;
		    		}
		    	 }
				return ret;
		    }
}
