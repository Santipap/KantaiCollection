package netkasakice_pbru.santipap.guideapp;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private Button about;
    private ListView trafficlistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindWidget(); //)ประกาศตัวแปรที่เราจะใช้
        buttoncontroler();

        CreateListView();


    }//main method

    private void CreateListView() {
    // ประกาศแบบ1
        final int[] intIcon={R.drawable.traffic_01,R.drawable.traffic_02,R.drawable.traffic_03,R.drawable.traffic_04,R.drawable.traffic_05,
        R.drawable.traffic_06,R.drawable.traffic_07,R.drawable.traffic_08,R.drawable.traffic_09,R.drawable.traffic_10,R.drawable.traffic_11,
        R.drawable.traffic_12,R.drawable.traffic_13,R.drawable.traffic_14,R.drawable.traffic_15,R.drawable.traffic_16,R.drawable.traffic_17,
        R.drawable.traffic_18,R.drawable.traffic_19,R.drawable.traffic_20};
//ประกาศแบบ 2
        final String[] titleStrings = new String[20];
        titleStrings[0]="After Effects";
        titleStrings[1]="CCleaner";
        titleStrings[2]="Chrome";
        titleStrings[3]="Driver Booster 3";
        titleStrings[4]="Eagle Get ";
        titleStrings[5]="Firefox";
        titleStrings[6]="Format Factory";
        titleStrings[7]="Internet Downloads";
        titleStrings[8]="K-lite";
        titleStrings[9]="WinRAR";
        titleStrings[10]="Microsoft Edge ";
        titleStrings[11]="Microsotf Office";
        titleStrings[12]="Mirillis Action";
        titleStrings[13]="Photoscap";
        titleStrings[14]="Photoshop";
        titleStrings[15]="Premiere Pro";
        titleStrings[16]="Teamspeak 3";
        titleStrings[17]="Utorrent";
        titleStrings[18]="Vegas Pro";
        titleStrings[19]="Windows Media Player";

        String[] detailStrings = getResources().getStringArray(R.array.detail_short);

        // ส่งค่าไป traffic_listview
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, intIcon, titleStrings, detailStrings);
        trafficlistview.setAdapter(myAdapter);


    }//create List View

    // ในส่วนของ () ที่ 2 จะเป็นกสรกำหนดต่าต่างเกีย่วกับการรแสดงผมทั้งหมด
    private void buttoncontroler() //ส่วนที่ใช้แสดงผล อันนี้สำหรับ link ไปยัง www
    {
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/profile.php?id=100009860237292"));
                startActivity(intent);
            }
        });
    }

    private void bindWidget(){ //ส่วนที่ใช้กำหนดค่าตัวแปร กำหนดชื่อตัวแปรที่สร้างใหม่ใน text = id ของ object ที่เราสร้างไว้
        about=(Button) findViewById(R.id.button);

       trafficlistview = (ListView) findViewById(R.id.listView); //listview คือ object ที่สร้างไว้ที่หน้า main หลัก


    }//bindWidget


}
