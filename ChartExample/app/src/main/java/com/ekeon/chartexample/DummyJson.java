package com.ekeon.chartexample;

import com.ekeon.chartexample.dummyModel.DummyModel;
import com.google.gson.Gson;

/**
 * Created by Ekeon on 2016. 5. 23..
 */
public class DummyJson {

  /*
{
  "dummy": {
    "dummydata": {
      "dummylist": {
        "one": 42.87,
        "two": 42.16,
        "three": 42.45,
        "four": 39.16,
        "five": 37.25,
        "six": 38.02
      },
      "dummycount": 40.32,
      "dummydummy": 0
    }
  }
}
   */
  private final static String dummyjson = "{\"dummy\": {\"dummydata\": {\"dummylist\": {\"one\": 42.87,\"two\": 42.16,\"three\": 42.45,\"four\": 39.16,\"five\": 37.25,\"six\": 38.02},\"dummycount\": 40.32,\"dummydummy\": 0}}}";

  public DummyModel getDummyModel() {
    Gson gson = new Gson();
    DummyModel dummyModel = gson.fromJson(dummyjson, DummyModel.class);

    return dummyModel == null ? null : dummyModel;
  }
}
