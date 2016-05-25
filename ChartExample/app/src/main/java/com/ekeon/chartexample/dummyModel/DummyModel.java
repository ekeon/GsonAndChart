package com.ekeon.chartexample.dummyModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Ekeon on 2016. 5. 23..
 */
public class DummyModel {
  @SerializedName("dummy")
  @Expose
  private DummyDataModel dummy;

  public DummyDataModel getDummy() {
    return dummy;
  }

  public void setDummy(DummyDataModel dummy) {
    this.dummy = dummy;
  }
}
