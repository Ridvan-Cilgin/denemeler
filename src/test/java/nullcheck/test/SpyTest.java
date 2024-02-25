package nullcheck.test;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class SpyTest {

    @Test
    public void testSpy() throws Exception {

        DummyCustomerService service = spy(new DummyCustomerServiceImpl());

//        doNothing().when(service).addCustomer(eq("istanbul"));
//        doThrow(new IllegalStateException()).when(service).removeCustomer(anyString());
//

        doNothing().when(service).removeCustomer(eq("istanbul1"));
        doNothing().when(service).removeCustomer(eq("istanbul2"));
      //  doCallRealMethod().when(service).removeCustomer(eq("istanbul3"));

        service.removeCustomer("istanbul1");
        service.removeCustomer("istanbul2");
        service.removeCustomer("istanbul3");


    }
}
