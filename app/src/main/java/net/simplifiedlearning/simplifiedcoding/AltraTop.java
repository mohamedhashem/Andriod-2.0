package net.simplifiedlearning.simplifiedcoding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class AltraTop extends AppCompatActivity {
    LineGraphSeries<DataPoint> series;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altra_top);


        GraphView graph = (GraphView) findViewById(R.id.altratop);


       // JsonObjectRequest getRequest;
       // StringRequest stringRequest=new StringRequest(Request.Method.GET,
         //       URLs.URL_GRAPHID,








        double y, x;
        x = -5.0;


        series = new LineGraphSeries<DataPoint>();

        for (int i = 0; i < 120; i++) {
            x = x + 0.1;
            y = Math.sin(x);
            series.appendData(new  DataPoint(x, y), true, 120);
        }
        graph.addSeries(series);


    }
}
