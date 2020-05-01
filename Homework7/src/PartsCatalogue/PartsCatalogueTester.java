package PartsCatalogue;

public class PartsCatalogueTester {
    public static void main(String[] args) {
        PartsCatalogue partsCatalogue=new PartsCatalogue();
        partsCatalogue.addPart(new Part("aba","bab",121));
        partsCatalogue.addPart(new Part("aaa","bbb",122));
        partsCatalogue.addPart(new Part("ccc","ddd",123));
        partsCatalogue.addPart(new Part("eee","fff",124));
        partsCatalogue.addPart(new Part("ggg","hhh",125));
        partsCatalogue.addPart(new Part("iii","jjj",126));
        System.out.println(partsCatalogue.getPart(121));
        System.out.println(partsCatalogue.getPart(125));

    }
}
