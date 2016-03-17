	 public void run() {
		 	turnLeft();
		 	buildWallOne();
		 	move();
		 	move();
		 	move();
		 	turnRight();
		 	buildWallTwo();
		 	buildWallTwo();
		 	move();
		 	move();
		 	move();
		 	turnLeft();
		 	buildWallOne();
		 	move();
		 	move();
		 	move();
		 	turnRight();
		 	buildWallTwo();
		 	buildWallOne();
		 	buildWallOne();
	 }
	 
	 private void buildWallOne() {
	    	
         while(noBeepersPresent()) {
             putBeeper();
             move(); 
         }
       
         while(beepersPresent()) {
        	 if (frontIsBlocked()) {
	        	 turnRight();
        	 }
        	 else {
	        	 move();
        	 }
         }
	 }
         private void buildWallTwo() {
 	    	
	         while(noBeepersPresent()) {
	             putBeeper();
	             move(); 
	         }
	       
	         while(beepersPresent()) {
	        	 if (frontIsBlocked()) {
		        	 turnLeft();
		         } else{
		        	 move();
		         }
	         }
	     }
	
}

