package dataobject;

import java.util.ArrayList;

// et interface er altid abstract!
public interface DataObject extends Comparable<DataObject> {

  // Interface attributes are by default public, static and final


  // behøver ikke skrive public abstract!
  //	All methods of an interface must be public.

  int getId();
  String getName();
  ArrayList<DataObject> getData();

}
