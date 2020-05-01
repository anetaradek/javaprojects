package PartsCatalogue;

import java.util.HashMap;
import java.util.Map;

public class PartsCatalogue {
    Map<Integer,Part> partMap=new HashMap<>();
    public void addPart(Part part){
        partMap.put(part.getPartNumber(),part);
    }
    public Part getPart(int number){
       return partMap.get(number);
    }
}
