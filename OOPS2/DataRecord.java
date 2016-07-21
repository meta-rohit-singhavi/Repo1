package OOPS2;

public class DataRecord {
	
	    int rating;
	    String areaOfImp;
	    String feedback;

	    public DataRecord(int rating, String area, String feedback) {
	        this.rating = rating;
	        this.areaOfImp = area;
	        this.feedback = feedback;
	    }

	    public int getRating() {
	        return rating;
	    }

	    public String getAreaOfImp() {
	        return areaOfImp;
	    }

	    public String getFeedback() {
	        return feedback;
	    }
	}