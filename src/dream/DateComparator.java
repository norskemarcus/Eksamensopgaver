package dream;

import java.util.Comparator;

public class DateComparator<D> implements Comparator<Dream> {

  @Override
  public int compare(Dream o1, Dream o2) {
    return o1.getDate().compareTo(o2.getDate());
  }

}
