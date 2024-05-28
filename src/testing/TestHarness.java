package testing;

import BasicIO.ASCIIOutputFile;
import mappings.Lookup;
import mappings.SortedLookup;

public class TestHarness{

    public TestHarness(){
        Lookup lookup = new SortedLookup();
        lookup.add("ls", "list directory contents"); //doesn't show
        lookup.add("chmod", "change permissions of a file");
        lookup.add("cp", "copy files and directories");
        lookup.add("ls", "list directory contents");
        System.out.println("__________");
        System.out.println("Testing add method");
        System.out.println(lookup);
        System.out.println("__________");
        System.out.println("Testing lookup method");
        System.out.println(lookup.lookup("ls"));
        System.out.println("__________");
        System.out.println("Testing search method");
        System.out.println(lookup.search("list")); //doesn't work properly
        System.out.println("__________");
        System.out.println("Testing getKeys method");
        System.out.println(lookup.getKeys());
        //excerpt
        System.out.println("__________");
        System.out.println("Testing size method");
        System.out.println(lookup.size());
        System.out.println("__________");
        System.out.println("Testing listing method");
        System.out.println(lookup.listing());
        System.out.println("__________");
        System.out.println("Testing asArray method");
        System.out.println(lookup.asArray());// Not sure
        System.out.println("__________");
        System.out.println("Testing save method");
        lookup.save(new ASCIIOutputFile());//works
        }

    public static void main(String[] args) {
        TestHarness testHarness = new TestHarness();
    }
}
