public class StringOperations {
    public static void main(String[] args) {
        // print name
        String myName = "Alfredo";
        System.out.println(myName);
        // print name with A at the beginning and Z at the end 
        myName = myName.substring(0,0) + 'A' + myName.substring(0+1); // ?  why the 
        myName = myName.substring(0,6) + 'Z' + myName.substring(6+1);

        System.out.println(myName);

        // print link without appended hyperlink identifiers
        String myLink = "www.stackoverflow.com";
        System.out.println(myLink);
        int myNum = 1331; // provided by assignment
        String myLinkres = myLink.substring(4, 17) + myNum;
        System.out.println(myLinkres);

    }
}
