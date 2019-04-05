package com.linguo.admin.codingchallange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String GET = "https://api.github.com/repos/rails/rails/commits";
    private ListView recyclerView;
    private ProgressBar bar;
    private ArrayList<String> list;
    private Button fetch;
    private ArrayAdapter adapter;
    private RequestQueue requestQueue;
    private StringRequest stringRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.r);
        bar = findViewById(R.id.bar);

      //  send();
    }

  /**  private void send(){
        requestQueue = Volley.newRequestQueue(this);
        stringRequest = new StringRequest(Request.Method.GET, GET, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONArray array = new JSONArray(response);
                    list = new ArrayList<>();

                    for (int i = 0; i < array.length(); i++) {
                        JSONObject obj = array.getJSONObject(i);
                        String commits = "Name : " + obj.getString("name") + "\n" + "Message : " + obj.getString("message");

                        list.add(commits);
                    }

                    adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,list);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setVisibility(View.VISIBLE);
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_LONG).show();
                }
                bar.setVisibility(View.GONE);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_LONG).show();
                bar.setVisibility(View.GONE);
            }
        });

        requestQueue.add(stringRequest);
    } **/


}
