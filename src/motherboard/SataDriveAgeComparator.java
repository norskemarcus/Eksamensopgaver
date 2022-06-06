package motherboard;

import java.util.Comparator;

public class SataDriveAgeComparator implements Comparator<SataDrive>{

  @Override
  public int compare(SataDrive o1, SataDrive o2) {
    return o1.getNumber() - o2.getNumber();
  }
}

