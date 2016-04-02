package edu.saintjoe.cs.brianc.simpledotcomblc;

public class SimpleDotComBLC {
	// These next two are our instance variables
	
	// Note: arrays are objects!!  So this variable is an object reference
	// The challenge lies in understanding: where does the object come from that it references?
    int[] locationCells;
    
    // Keep track of how many times the user guessed a spot where a dot com piece is living
    int numOfHits = 0;
    
    // Data members above this one
    /* ------------------------------------------------------------------------------------*/
    // Methods below this line
    
    // Stores which cells of an imaginary larger array are occupied by our dot-com
    // The parameter is ALSO a reference to an array object--the key to understandin the puzzle above
    public void setLocationCells(int[] locs)
    {
        locationCells = locs;
    }
    
    // Checks for hit, for a miss, or a kill!!
    // Input parameter: a guess, which is a String representation of a number of an array location
    public String checkYourself(String stringGuess) {
    	
    	//Convert from String type to binary type so we can do math with it
    	// Note, too: this is a "local" variable that only lives while the method is executing
        int guess = Integer.parseInt(stringGuess);
        
        // Default thing is to miss
        String result = "miss";
        
        // This is EXACTLY a "for each" in App Inventor
        // Each element of locationCells, in turn, becomes "cell"
        for (int cell: locationCells)
        {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                // Understanding this next command is a big deal
                break;
            }
        }
        // When this condition is true, all cells have been "hit" and we're done
        if (numOfHits == locationCells.length)
        {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}

