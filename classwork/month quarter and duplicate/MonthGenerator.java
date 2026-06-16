public class MonthGenerator {

    public static int getMonthQuarter(int month) {
        if (month < 1 || month > 12) {
            return -1;
        }

        switch (month) {
            case 1: case 2: case 3:
                return 1;

            case 4: case 5: case 6:
                return 2;

            case 7: case 8: case 9:
                return 3;

            case 10: case 11: case 12:
                return 4;

            default:
                return 0;
        }
    }
	
	
//  			or 

	public static int quarterOf(int month) {
		if (month < 1 || month > 12) {
        	    return 0;
        	}
    	return (month  - 1 )/ 3 + 1;
    }

}