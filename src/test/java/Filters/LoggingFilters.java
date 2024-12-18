package Filters;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingFilters implements Filter {

    private static final Logger logger = LogManager.getLogger(LoggingFilters.class);


    @Override
    public Response filter(FilterableRequestSpecification filterableRequestSpecification,
                           FilterableResponseSpecification filterableResponseSpecification, FilterContext filterContext) {
        logRequest(filterableRequestSpecification);
        Response response = filterContext.next(filterableRequestSpecification,filterableResponseSpecification);
        logResponse(response);
        return response;
    }

    public void logRequest(FilterableRequestSpecification requestSpecification){
        logger.info("Base URI: " + requestSpecification.getBaseUri());
        logger.info("Request Headers: " + requestSpecification.getHeaders());
        logger.info("Request PayLoad: " + requestSpecification.getBody());

    }
    public void logResponse(Response response){
        logger.info("Response Status Code: " + response.getStatusCode());
        logger.info("Response Body: " + response.getBody().prettyPrint());
        logger.info("Response Headers: " + response.getHeaders().toString());

    }
}
