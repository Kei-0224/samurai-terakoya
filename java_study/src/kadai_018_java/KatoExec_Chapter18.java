package kadai_018;

public class KatoExec_Chapter18 {

	public class Main {
	    public static void main(String[] args) {
	    	KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
	    	KatoIchiro_Chapter18 Ichiro = new KatoIchiro_Chapter18();
	    	KatoHanako_Chapter18 Hanako = new KatoHanako_Chapter18();
	        
	       
	        taro.setGivenName();
	        Ichiro.setGivenName();
	        Hanako.setGivenName();
	        
	        
	        taro.execIntroduce(); 
	        System.out.println();
	        Ichiro.execIntroduce(); 
	        System.out.println();
	        Hanako.execIntroduce(); 
	        
	       }
	}
	
	
	

}
