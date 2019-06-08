package com.example.android.roomdbsample.activity;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.roomdbsample.R;
import com.example.android.roomdbsample.database.DatabaseClient;
import com.example.android.roomdbsample.entity.Message;
import com.example.android.roomdbsample.utils.BookingInfo;
import com.example.android.roomdbsample.utils.DoctorList;
import com.example.android.roomdbsample.utils.Online;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView labsListView;
    private TextView doctorsListTextView;
    private TextView name;
    private TextView doctorQualificationTextView;
    private TextView bookingInfoOpdLabelTextView;
    private TextView bookingInfoOnlineDoctorListTv;
    ArrayList<String> labsList = new ArrayList<String>();
    DoctorList doctorList = new DoctorList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        labsListView = (ListView)findViewById(R.id.labs_list);
        doctorsListTextView = (TextView) findViewById(R.id.doctor_list_tv);
        doctorQualificationTextView = (TextView) findViewById(R.id.doctor_qualification_tv);
        bookingInfoOpdLabelTextView = (TextView) findViewById(R.id.booking_info_opd_label_tv);
        bookingInfoOnlineDoctorListTv = (TextView) findViewById(R.id.booking_info_online_doctor_list_tv);
        addMessages();
        getMessages();

    }

    private void getMessages() {
        class GetMessages extends AsyncTask<Void, Void, List<Message>> {

            @Override
            protected List<Message> doInBackground(Void... voids) {
                List<Message> messageList = DatabaseClient
                        .getInstance(getApplicationContext())
                        .getAppDatabase()
                        .messageDao()
                        .findMessageByConsultationId(212);
                return messageList;
            }

            @Override
            protected void onPostExecute(List<Message> messages) {
                super.onPostExecute(messages);
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.activity_list_view, R.id.textView, messages.get(0).getLabs());
                labsListView.setAdapter(arrayAdapter);
                /*ArrayAdapter<DoctorList> arrayAdapter1 = new ArrayAdapter<DoctorList>(MainActivity.this, R.layout.activity_list_view, R.id.textView,
                        messages.get(0).getTopCard());
                doctorsListView.setAdapter(arrayAdapter1);*/
                doctorsListTextView.setText(String.format("doctor List attribute: %s", messages.get(0).getTopCard().get(0).getAddress().toString()));
                doctorQualificationTextView.setText(String.format("doctor qualification :%s", messages.get(0).getTopCard().get(0).getQualification().get(0)));
                bookingInfoOpdLabelTextView.setText(String.format("booking info opd label: %s", messages.get(0).getBookingInfo().getOpdLabel()));
                bookingInfoOnlineDoctorListTv.setText(String.format("booking info online doctor list: %s", messages.get(0).getBookingInfo().getOnline().getList().get(0).getAddress()));
                name.setText(messages.get(0).getName());

            }
        }

        GetMessages gm = new GetMessages();
        gm.execute();
    }

    private void addMessages() {

        class AddMessages extends AsyncTask<Void, Void, Void> {

            @Override
            protected Void doInBackground(Void... voids) {

                //creating a task
                labsList = new ArrayList<String>();
                BookingInfo bookingInfo = new BookingInfo();
                Online online = new Online();
                List<DoctorList> doctorLists = new ArrayList<>();
                List<String> doctorQualification = new ArrayList<>();

                labsList.add("abc");
                labsList.add("xyz");
                labsList.add("qwe");
                labsList.add("dcdsc");
                doctorList.setDoctorId("443");
                doctorList.setAddress("fwfhwufhi");
                doctorQualification.add("MBBS");
                doctorList.setQualification(doctorQualification);
                doctorLists.add(doctorList);
                online.setList(doctorLists);
                bookingInfo.setOpdLabel("qwerty");
                bookingInfo.setOnline(online);
                Message message = new Message();
                message.setName("Divyanshu");
                message.setMessageId(Integer.toString((int)Math.random()));
                message.setConsultationId(212);
                message.setLabs(labsList);
                message.setTopCard(doctorLists);
                message.setBookingInfo(bookingInfo);
                //adding to database
                DatabaseClient.getInstance(getApplicationContext()).getAppDatabase()
                        .messageDao()
                        .insert(message);
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                //Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
        }
        }

        AddMessages addMessages = new AddMessages();
        addMessages.execute();
    }
}
