package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	Sort sort;
	int data[];
	
	public BinarySearch(int[] data) {
		super();
		this.data = data;
	}

	public Sort getSort() {
		return sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}


	public int search(int num)
    {
        int left = 0, right = (sort.getdata(data)).length - 1;
        while (left <= right)
        {
            int middle = (right + left) / 2;
 
            if (sort.getdata(data)[middle] == num)
                return middle+1;
 
            if (sort.getdata(data)[middle] > num)
                right = middle - 1;
            else
                left = middle + 1;
        }
        return -1;
    }
}

