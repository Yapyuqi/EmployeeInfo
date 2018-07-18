package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<EmployeeInfo> employeeInfo;

    public CustomAdapter( Context context, int resource, ArrayList<EmployeeInfo> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        employeeInfo = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater
                = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvEmployee = rowView.findViewById(R.id.tvEmployee);
        TextView tvJob = rowView.findViewById(R.id.tvJob);
        TextView tvPrice = rowView.findViewById(R.id.tvPrice);
        EmployeeInfo currentItem = employeeInfo.get(position);
        tvEmployee.setText(currentItem.getEmployeeName());
        tvJob.setText(currentItem.getEmployeeJob());
        tvPrice.setText(currentItem.getEmployeePrice());
        return rowView;
    }


}

