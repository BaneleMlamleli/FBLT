package FBLT.controller;


import FBLT.domain.advert.Advert;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;

import static org.springframework.test.web.client.ExpectedCount.manyTimes;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

/**
 * Created by kraluk01 on 12/7/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class AdvertControllerTest {
    @Test
    public void singleAdvert() {
        RestTemplate restTemplate = new RestTemplate();
        MockRestServiceServer server = MockRestServiceServer.bindTo(restTemplate).build();
        server.expect(manyTimes(), requestTo("/advert-controller/1")).andExpect(method(HttpMethod.GET))
                .andRespond(withSuccess("{ \"id\" : \"1\"}", MediaType.APPLICATION_JSON));
        Advert advert = restTemplate.getForObject("/advert-controller/{id}",Advert.class,1);
        server.verify();
        Assert.assertEquals("1",advert.getId());
    }

    @Test
    public void multipleadverts() {
        RestTemplate restTemplate = new RestTemplate();
        MockRestServiceServer server = MockRestServiceServer.bindTo(restTemplate).build();
        server.expect(manyTimes(), requestTo("/advert-controller")).andExpect(method(HttpMethod.GET))
                .andRespond(withSuccess("{ \"id\" : \"1\"}", MediaType.APPLICATION_JSON));
        Advert advert = restTemplate.getForObject("/advert-controller",Advert.class);
        server.verify();

        Assert.assertNotNull(advert);
    }

}
