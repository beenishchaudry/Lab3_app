package com.cs60333.username.lab2_app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by bchaudhr on 2/8/2017.
 */

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle os) {
        super.onCreate(os);
        setContentView(R.layout.activity_main);

        ArrayList<String[]> teams = new ArrayList<>();
        teams.add(new String[] {"fsulg", "Florida State", "Feb 11"});
        teams.add(new String[] {"bclg", "Boston College", "Feb 14"});
        teams.add(new String[]{"ncstlg", "North Carolina State", "Feb 18"});
        teams.add(new String[]{"geotlg", "Georgia Tech", "Feb 26"});
        teams.add(new String[]{"bclg", "Boston College", "March 1"});
        teams.add(new String[]{"loulg", "Louisville", "March 4"});
        teams.add(new String[]{"badge", "ACC Tournament", "March 7"});
        teams.add(new String[]{"badge", "NCAA Tournament", "March 16"});

        ListView scheduleListView = (ListView) findViewById(R.id.lstview_schedule);

        ScheduleAdapter scheduleAdapter = new  ScheduleAdapter (this, teams);
        scheduleListView.setAdapter(scheduleAdapter);

    }

}
