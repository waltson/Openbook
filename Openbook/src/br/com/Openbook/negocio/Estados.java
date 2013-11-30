package br.com.Openbook.negocio;

public enum Estados {
	 	AC("Acre"),  
	    AL("Alagoas"),  
	    AM("Amazonas"),  
	    AP("Amapá"),  
	    BA("Bahia"),  
	    CE("Ceará"),  
	    DF("Distrito Federal"),  
	    ES("Espirito Santo"),  
	    GO("Goias"),  
	    MA("Maranhão"),  
	    MG("Minas Gerais"),  
	    MS("Mato Grosso Sul"),  
	    MT("Mato Grosso"),  
	    PA("Pará"),  
	    PB("Paraiba"),  
	    PE("Pernanbuco"),  
	    PI("Piaui"),  
	    PR("Parana"),  
	    RJ("Rio de Janeiro"),  
	    RN("Rio Grande do Norte"),  
	    RO("Rondônia"),  
	    RR("Roraima"),  
	    RS("Rio Grande do Sul"),  
	    SC("Santa Catarina"),  
	    SE("Sergipe"),  
	    SP("São Paulo"),  
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
