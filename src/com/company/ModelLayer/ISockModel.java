package com.company.ModelLayer;

import java.util.List;


public interface ISockModel {
    List<ISock> getAllSocks();

    void addSock(ISock sock);

    ISock updateSock(ISock sock);

    boolean deleteSock(int id);

    ISock getSockById(int id);

    List<ISock> getSockByCondition(String fieldName, String condition, String value);
}
