package com.midway.edu.mockito;

/**
 * Created by oracle on 10/23/17.
 */

import com.midway.edu.jersey.Customer;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;


public class ArrayListTest {
    //private ArrayList testInstance;

    @Mock
    private Customer customerMock;
    @Mock
    private List listMock;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        //testInstance = new ArrayList();
    }

    @Test
    public void shouldTestAdd() {
        listMock.add("one");
        listMock.clear();
        verify(listMock).add("one");
        verify(listMock).clear();
    }

    @Test
    public void shouldTestAdd1() {
        when(listMock.get(0)).thenReturn(customerMock);
        assertEquals(customerMock, listMock.get(0));
    }

    @Test
    public void shouldUseArgumentCaptor() {
        Customer customer = new Customer();
        customer.setName("Jersey");

        ArgumentCaptor<Customer> argument = ArgumentCaptor.forClass(Customer.class);
        listMock.add(customer);
        verify(listMock).add(argument.capture());
        assertEquals("Jersey", argument.getValue().getName());
    }

}
