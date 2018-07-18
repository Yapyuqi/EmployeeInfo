package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewInfo;
    ArrayList<EmployeeInfo> alemployeeinfo;
    CustomAdapter caEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewInfo = findViewById(R.id.listViewInfo);

        alemployeeinfo = new ArrayList<>();
        EmployeeInfo item1 = new EmployeeInfo("John", "Software Technical Leader", "3400");
        EmployeeInfo item2 = new EmployeeInfo("May", "Programmer", "2200");
        alemployeeinfo.add(item1);
        alemployeeinfo.add(item2);

        caEmployee = new CustomAdapter(this, R.layout.employee_info, alemployeeinfo);

        listViewInfo.setAdapter(caEmployee);


    }
}
