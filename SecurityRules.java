package transport;

public final class SecurityRules {
	  private SecurityRules() {
	  }

	    public static boolean canFly  (String place ) {
	        if ("ExamCell".equals(place))
	        		return false;
	        else
	        	return true ;
	       
	    }
	}


