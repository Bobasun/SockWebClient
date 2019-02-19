package com.company.ModelLayer.SearchForFileDAO;

import com.company.ModelLayer.ISock;

import java.util.List;


public interface ISearch {
    List<ISock> search(Object searchParam, List<ISock> data);
}
