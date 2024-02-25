package nullcheck.test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class OnAsama {
    @Test
    public void testWhen() throws Exception {

        DummyCustomerService service = mock(DummyCustomerService.class);

       // when(service.getCustomer(anyString())).thenReturn("customerIstanbul");

        when(service.getCustomer(eq("istanbul"))).thenReturn("customerIstanbul");

        String customer = service.getCustomer("istanbul");
        Assert.assertEquals(customer, "customerIstanbul");

    }

    @Test
    public void testWhen2() throws Exception {

        DummyCustomerService service = mock(DummyCustomerService.class);

         when(service.getCustomer(anyString())).thenReturn("customerIstanbul");

        when(service.getCustomer(eq("ankara"))).thenThrow(new RuntimeException());

        String customer = service.getCustomer("ankara");
      //  Assert.assertEquals(customer, "customerIstanbul");

    }
    @Test
    public void testWhen3() throws Exception {

        DummyCustomerService service = mock(DummyCustomerService.class);

        doNothing().when(service).addCustomer(anyString());
        doThrow(new RuntimeException()).when(service).addCustomer(anyString());

        doReturn("ankara").when(service).getCustomer("istanbul");


    }
}
