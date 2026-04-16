package tarasb.springframework.petclinic.model.util;

import tarasb.springframework.petclinic.model.Specialty;

import java.util.Comparator;

public class PropertyComparator implements Comparator<Specialty> {
  @Override
  public int compare(Specialty o1, Specialty o2) {
    return o1.getName().compareTo(o2.getName());
  }
}
