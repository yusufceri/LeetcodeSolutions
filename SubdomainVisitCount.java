import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space,
followed by the address. An example of a count-paired domain might be "9001 discuss.leetcode.com".
We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains,
(in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.
 */
public class SubdomainVisitCount {
    public static void main(String[] args) {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};

        System.out.println(subdomainVisits(cpdomains));
    }


    public static List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> domainsTable = new HashMap<>();

        for(int i=0; i<cpdomains.length; i++){
            String[] domain = cpdomains[i].split(" ");

            int index=0, length = domain[1].length();
            while(index>-1){
                if(index!=0)
                    ++index;
                domainsTable = addToTable(domainsTable, domain[1].substring(index, length), Integer.valueOf(domain[0]));
                index = domain[1].indexOf('.', index);
            }
        }

        List<String> subdomainList = new ArrayList<>();
        for(String key:domainsTable.keySet()){
            subdomainList.add(domainsTable.get(key)+" "+key);
        }

        return subdomainList;
    }

    public static HashMap<String, Integer> addToTable(HashMap<String, Integer> domainsTable, String subdomain, int counter){
        if(domainsTable.containsKey(subdomain)){
            domainsTable.put(subdomain, domainsTable.get(subdomain)+counter);
        }else
            domainsTable.put(subdomain, counter);

        return domainsTable;
    }
}
