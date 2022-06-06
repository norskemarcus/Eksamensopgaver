package dataobject;

import java.util.ArrayList;

public interface DataObject extends Comparable<DataObject> {

  int getId();
  String getName();
  ArrayList<DataObject> getData();

}
