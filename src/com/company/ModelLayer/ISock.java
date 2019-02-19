package com.company.ModelLayer;


public interface ISock extends Comparable {

    void setType(String type);
    void setSize(int size);
    void setColor(String color);
    void setOwner(IOwnerData owner);

    String getType();
    int getSize();
    String getColor();
    int getId();
    IOwnerData getOwner();
}
