package com.example.proiect;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.StrictMode;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MessageSender extends AppCompatActivity{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trimite_activity);
    }
}


/*public class MessageSender extends AsyncTask<String,Void,Void> {
    Socket s;
    DataOutputStream dos;
    PrintWriter pw;

    @Override
    protected Void doInBackground(String... voids) {
        String message= voids[0];
        try {
            s= new Socket("192.168.222.108",7800);
            pw = new PrintWriter(s.getOutputStream());
            pw.write(message);
            pw.flush();
            pw.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}*/
/*
public class MessageSender{
    String  classs="com.mysql.jdbc.Driver";

    String url="jdbc:mysql://192.168.222.108/andro";
    String nume="alo";
    String pachet="da";
    String  adresa="oras";

@SuppressLint("NewApi")
public static Connection CONN() {
    StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
    StrictMode.setThreadPolicy(policy);
    Connection conn = null;
    String ConnURL = null;
    try {
        Class.forName(classs);
        conn = DriverManager.getConnection(url, nume, pachet);
    } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
    }
    return conn;
}
}*/


