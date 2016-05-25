package com.ekeon.chartexample.dummyModel;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by Ekeon on 2016. 5. 24..
 */
public class DummyListModel {
  @SerializedName("dummylist")
  private TreeMap<String, Float> dummylist;
  @SerializedName("dummycount")
  private float dummycount;
  @SerializedName("dummydummy")
  private Integer dummydummy;

  public TreeMap<String, Float> getDummylist() { //자동 으로 맵에들어올떄 정렬시켜줌
    return dummylist;
  }

  public void setDummylist(TreeMap<String, Float> dummylist) {
    this.dummylist = dummylist;
  }

  public float getDummycount() {
    return dummycount;
  }

  public void setDummycount(float dummycount) {
    this.dummycount = dummycount;
  }

  public Integer getDummydummy() {
    return dummydummy;
  }

  public void setDummydummy(Integer dummydummy) {
    this.dummydummy = dummydummy;
  }
}
