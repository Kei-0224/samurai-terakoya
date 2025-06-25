package kadai_018;

public  abstract class Kato_Chapter18 {
	
	public String familyName;
	
	public String givenName;
	
	public String addresName;
	
	 public void setGivenName(String name) {
	        this.givenName = name;
	    }
	
	 
	public void  commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + addresName  + "です");
			 
	}
		public abstract void eachIntroduce();
		
	    public void execIntroduce() {
	    	
	     commonIntroduce();
	     
	     eachIntroduce();
	     
	    }
	 
	    	 
	     }
	     
	     

