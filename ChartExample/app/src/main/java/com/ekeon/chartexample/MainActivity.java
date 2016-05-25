package com.ekeon.chartexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.db.chart.model.LineSet;
import com.db.chart.view.LineChartView;
import com.ekeon.chartexample.dummyModel.DummyModel;

import java.util.ArrayList;
import java.util.Set;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

  @BindView(R.id.linechart) LineChartView lineChartView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    DummyJson dummyJson = new DummyJson();
    DummyModel dummyJsonModel = dummyJson.getDummyModel();

    LineSet dataset = new LineSet();

    for (String str : dummyJsonModel.getDummy().getDummydata().getDummylist().keySet()) {
      dataset.addPoint(str, dummyJsonModel.getDummy().getDummydata().getDummylist().get(str));
    }

    lineChartView.addData(dataset);
    lineChartView.show();

  }
}
