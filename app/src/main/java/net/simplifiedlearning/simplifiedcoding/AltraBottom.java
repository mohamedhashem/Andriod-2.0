package net.simplifiedlearning.simplifiedcoding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class AltraBottom extends AppCompatActivity {
    LineGraphSeries<DataPoint> series;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altra_bottom);

        GraphView graph = (GraphView) findViewById(R.id.altrabottom);
        double y, x;
        x = -5.0;

        series = new LineGraphSeries<DataPoint>();

        for (int i = 0; i < 400; i++) {
            x = x + 0.1;
            y = Math.sin(x);
            series.appendData(new DataPoint(x, y), true, 400);
        }
        graph.addSeries(series);


    }
}
