package nullcheck.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class AnnotationTest {

    @Spy
    private DummyCustomerServiceImpl service;

    @Test
    public void testAnnotation() throws Exception {
        service.addCustomer("istanbul");
    }
}
