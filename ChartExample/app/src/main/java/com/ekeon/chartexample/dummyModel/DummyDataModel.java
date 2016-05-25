package com.ekeon.chartexample.dummyModel;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ekeon on 2016. 5. 23..
 */
public class DummyDataModel {
  @SerializedName("dummydata")
  public DummyListModel dummydata;

  public DummyListModel getDummydata() {
    return dummydata;
  }

  public void setDummydata(DummyListModel dummydata) {
    this.dummydata = dummydata;
  }
}
