package com.spartaglobal.restassuredPostcodes;

import static org.junit.Assert.assertTrue;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class singlePostcodeTest
{
  @BeforeClass
  public static void setup(){
      baseURI = "https://api.postcodes.io";
      basePath = "/postcodes/";
  }

    @Test
    public void postCodeRequestIsSuccessful(){
      get("se120nb")
              .then()
              .statusCode(200)
              .body("result.postcode", equalTo("SE12 0NB"));

    }
}
