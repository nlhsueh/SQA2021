package com.example;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

public class BinarySearchTest{
    
    Sort sort;
    BinarySearch binarysearch;
    int data1[] = {5,86,23,6,11,1};
    int data2[] = {1,5,6,11,23,86};
    
    @Before   
    public void setUp(){                
        binarysearch = new BinarySearch(data1);                  
        sort = mock(Sort.class);      
        binarysearch.setSort(sort);
    }

    @Test
    public void test1() {    
        binarysearch.setSort(sort);
        when( sort.getdata(data1) ).thenReturn (data2) ; 
        int loc = binarysearch.search(5);      
        assertEquals(2, loc);
    }
    @Test
    public void test2() {    
        binarysearch.setSort(sort);
        when( sort.getdata(data1) ).thenReturn (data2) ; 
        int loc = binarysearch.search(1);      
        assertEquals(1, loc);
    }
    @Test
    public void test3() {    
        binarysearch.setSort(sort);
        when( sort.getdata(data1) ).thenReturn (data2) ; 
        int loc = binarysearch.search(11);      
        assertEquals(4, loc);
    }
    @Test
    public void test4() {    
        binarysearch.setSort(sort);
        when( sort.getdata(data1) ).thenReturn (data2) ; 
        int loc = binarysearch.search(86);      
        assertEquals(6, loc);
    }
    @Test
    public void test6() {    
        binarysearch.setSort(sort);
        when( sort.getdata(data1) ).thenReturn (data2) ; 
        int loc = binarysearch.search(0);      
        assertEquals(-1, loc);
    }
}
