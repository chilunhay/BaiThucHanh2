package com.example.androidwidgets;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.degree);
        /*Bai 1
        Toast toast = Toast.makeText(getApplicationContext(),"Ví dụ Toast", Toast.LENGTH_LONG);
        toast.show();*/
    }
    //Bai 2
    public void exit(View view)
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        //Title
        alertDialogBuilder.setTitle("Xác nhận để thoát ...!!!");
        //Icon
        alertDialogBuilder.setIcon(R.drawable.ic_launcher_background);
        //Message
        alertDialogBuilder.setMessage("Bạn có muốn thoát?");
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface agr0, int agr1) {
                //Close Activity
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("Không đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"Bạn đã click vào nút không đồng ý",Toast.LENGTH_SHORT).show();
            }
        });
        alertDialogBuilder.setNeutralButton("Hủy", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Bạn đã click vào nút hủy",Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }



    //Bai3
    /*public  void tinhTong(View view)
    {
        EditText editA = (EditText)findViewById(R.id.edtSoA);
        int a = Integer.parseInt(editA.getText()+"");
        EditText editB = (EditText)findViewById(R.id.edtSoB);
        int b = Integer.parseInt(editB.getText()+"");
        TextView textViewKQ = (TextView)findViewById(R.id.tvKetqua);
        int kq = Integer.parseInt(a+b+"");
        textViewKQ.setText(kq+"");
    }
    public  void tinhHieu(View view)
    {
        EditText editA = (EditText)findViewById(R.id.edtSoA);
        int a = Integer.parseInt(editA.getText()+"");
        EditText editB = (EditText)findViewById(R.id.edtSoB);
        int b = Integer.parseInt(editB.getText()+"");
        TextView textViewKQ = (TextView)findViewById(R.id.tvKetqua);
        int kq = Integer.parseInt(a-b+"");
        textViewKQ.setText(kq+"");
    }
    public  void tinhTich(View view)
    {
        EditText editA = (EditText)findViewById(R.id.edtSoA);
        int a = Integer.parseInt(editA.getText()+"");
        EditText editB = (EditText)findViewById(R.id.edtSoB);
        int b = Integer.parseInt(editB.getText()+"");
        TextView textViewKQ = (TextView)findViewById(R.id.tvKetqua);
        int kq = Integer.parseInt(a*b+"");
        textViewKQ.setText(kq+"");
    }
    public  void tinhThuong(View view)
    {
        EditText editA = (EditText)findViewById(R.id.edtSoA);
        float a = Float.parseFloat(editA.getText()+"");
        EditText editB = (EditText)findViewById(R.id.edtSoB);
        float b = Float.parseFloat(editB.getText()+"");
        TextView textViewKQ = (TextView)findViewById(R.id.tvKetqua);
        float kq = Float.parseFloat(a/b+"");
        textViewKQ.setText(kq+"");
    }*/
    //Bai4
    public void CtoF(View view)
    {
        EditText editFa = (EditText)findViewById(R.id.editFa);
        float fa = Float.parseFloat(editFa.getText()+"");
        EditText editTextKQ = (EditText) findViewById(R.id.editCe);
        float kq = Float.parseFloat(fa*9/5+32+"");
        editTextKQ.setText(kq+"");
    }
    public void FtoC(View view)
    {
        EditText editCe = (EditText)findViewById(R.id.editCe);
        float ce = Float.parseFloat(editCe.getText()+"");
        EditText editTextKQ = (EditText) findViewById(R.id.editFa);
        float kq = Float.parseFloat((ce-32)*5/9+"");
        editTextKQ.setText(kq+"");
    }

}