
/*
You are given a license key represented as a string S which consists only alphanumeric character and dashes. The string is separated into N+1 groups by N dashes.

Given a number K, we would want to reformat the strings such that each group contains exactly K characters, except for the first group which could be shorter than K, but still must contain at least one character. Furthermore, there must be a dash inserted between two groups and all lowercase letters should be converted to uppercase.

Given a non-empty string S and a number K, format the string according to the rules described above.
 */

public class LicenseKeyFormatting {

    public static void main(String[] args) {
        String S = "1-2-d-2345-3-4354345-5F3Z-2e-9-w";
        int K=4;
        System.out.println(licenseKeyFormatting(S,K));
    }
    public static String licenseKeyFormatting(String S, int K) {
        int length = S.length();
        StringBuilder formattedLicenseKey = new StringBuilder(length);
        int counter=0;
        int i=length-1;
        while(i>=0){
            if(S.charAt(i) == '-') {
                i--;
                continue;
            }

            if(counter == K){
                formattedLicenseKey.append('-');
                counter= 0;
            }else{
                formattedLicenseKey.append(S.charAt(i));
                counter++;
                i--;
            }
        }
        return formattedLicenseKey.reverse().toString().toUpperCase();
    }
}
