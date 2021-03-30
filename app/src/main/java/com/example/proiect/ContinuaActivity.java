package com.example.proiect;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ContinuaActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.continua_activity);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ContinuaActivity.this,MessageSender.class);
                startActivity(intent);
            }
        });
    }
}

/*public class ContinuaActivity extends AppCompatActivity {
    EditText el1,el2,el3;
    Button trimite;
    ProgressDialog progressDialog;
    MessageSender MessageSender;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.continua_activity);

        el1= (EditText) findViewById(R.id.editTextTextPersonName2);
        el2= (EditText) findViewById(R.id.editTextTextPersonName3);
        el3= (EditText) findViewById(R.id.editTextTextPersonName4);
        trimite=(Button)findViewById(R.id.button);

        MessageSender=new MessageSender();

        progressDialog= new ProgressDialog(this);
        trimite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Doregister doregister= new Doregister();
                doregister.execute("");
            }
        });
    }
    @SuppressLint("StaticFieldLeak")
    public  class Doregister extends AsyncTask<String,String,String>{
        String numestr=el1.getText().toString();
        String  pachetstr=el2.getText().toString();
        String adresastr=el3.getText().toString();

        String  z="";
        boolean isSucces=false;

        @Override
        protected void onPreExecute() {
            progressDialog.setMessage("Loading...");
            progressDialog.show();
        }

        @Override
        protected String doInBackground(String... strings) {
            if(numestr.trim().equals("")||pachetstr.trim().equals("")||adresastr.trim().equals(""))
                z="Introdu fiecare raspuns";
         else {
             try{
                Connection con = MessageSender.CONN();
                if(con==null){
                    z="Verifica  internetul";
                } else{
                    String query="introdu('"+numestr+"','"+pachetstr+"','"+adresastr+"')";

                    Statement stmt= con.createStatement();
                    stmt.executeUpdate(query);

                    z="Succes";
                    isSucces=true;

                }
            }
             catch (Exception ex){
                 isSucces=false;
                 z="Exceptions"+ex;
             }
        }
    }
    public void send(View v){
        MessageSender messageSender= new MessageSender();
        messageSender.execute(el1.getText().toString());
        messageSender.execute(el2.getText().toString());
        messageSender.execute(el3.getText().toString());
    }
 }
}*/
