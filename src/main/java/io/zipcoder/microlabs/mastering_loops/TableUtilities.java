package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        StringBuilder result = new StringBuilder();
        // space space # space |
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                // formatting -- is there a better way to do this? ********
                if(j*i < 10) {
                    result.append("  ").append(j * i).append(" |");
                }
                else{
                    result.append(" ").append(j * i).append(" |");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder result = new StringBuilder();
        // space space # space |
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                // formatting -- is there a better way to do this? ********
                if(j*i < 10) {
                    result.append("  ").append(j * i).append(" |");
                }
                else if(j*i < 100){
                    result.append(" ").append(j * i).append(" |");
                }
                else{
                    result.append(j * i).append(" |");
                }
            }
            result.append("\n");
        }

        return result.toString();
    }

    public static String getMultiplicationTable(int tableSize) {

        // for this one, see if you can limit what input you get so that the
        // squares don't go past 3 digits.
        StringBuilder result = new StringBuilder();
        // space space # space |
        for(int i = 1; i <= tableSize; i++){
            for(int j = 1; j <= tableSize; j++){
                // formatting -- is there a better way to do this? ********
                if(j*i < 10) {
                    result.append("  ").append(j * i).append(" |");
                }
                else if(j*i < 100){
                    result.append(" ").append(j * i).append(" |");
                }
                else{
                    result.append(j * i).append(" |");
                }
            }
            result.append("\n");
        }

        return result.toString();
    }
}
