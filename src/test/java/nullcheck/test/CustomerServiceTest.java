package nullcheck.test;

import org.junit.Test;

import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;


public class CustomerServiceTest {

    @Test
    public void testCustomer() throws Exception {

        DummyCustomerService dummyCustomerService = Mockito.mock(DummyCustomerService.class);

        dummyCustomerService.addCustomer("İstanbul");
        dummyCustomerService.addCustomer("izmir");

        verify(dummyCustomerService).addCustomer("İstanbul");
        verify(dummyCustomerService).addCustomer("izmir");

    }

    @Test
    public void testKacKere() throws Exception {

        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);

        customerService.addCustomer("İstanbul");
        customerService.addCustomer("izmir");
        customerService.addCustomer("İstanbul");
        customerService.addCustomer("ankara");

        verify(customerService, times(2)).addCustomer("İstanbul");
        verify(customerService, times(1)).addCustomer("izmir");

        verify(customerService, never()).removeCustomer(anyString());
        // verify(customerService, never()).addCustomer(anyString());

        verify(customerService, atLeastOnce()).addCustomer("Mersin");
        // verify(customerService, atLeast(2)).addCustomer("İstanbul");

    }


    @Test
    public void testSirasiniKontrolEt() throws Exception {

        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);

        customerService.addCustomer("İstanbul");
        customerService.addCustomer("izmir");
        customerService.addCustomer("ankara");


        InOrder inOrder = inOrder(customerService);
        inOrder.verify(customerService).addCustomer("İstanbul");
        inOrder.verify(customerService).addCustomer("izmir");
        inOrder.verify(customerService).addCustomer("ankara");


    }

    @Test
    public void testSBaskaKontrolYok() throws Exception {

        DummyCustomerService customerService = Mockito.mock(DummyCustomerService.class);
        DummyCustomerService customerService2 = Mockito.mock(DummyCustomerService.class);

       // customerService2.addCustomer("İstanbul");
        customerService.removeCustomer("izmir");
        customerService.addCustomer("ankara");

        verify(customerService).addCustomer("İstanbul");
        verify(customerService).removeCustomer("izmir");

        verifyNoMoreInteractions(customerService);

//        verifyZeroInteractions(customerService2);
        //verifyZeroInteractions(customerService);
    }
}
