package improveAlgo.MockTest;

public class LicenseKeyFormat {
    public String licenseKeyFormatting(String s, int k) {
        String replace= s.replace("-","").toUpperCase();
        StringBuilder sb = new StringBuilder();
        for(int i=replace.length();i>=1;i-=k){
            if(i-k<=0) {
                sb.insert(0,replace, 0, i);
                break;
            }
            sb.insert(0,replace, i-k, i);
            sb.insert(0,"-");
        }
        return sb.toString();
    }
}
