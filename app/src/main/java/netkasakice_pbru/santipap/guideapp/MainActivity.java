package netkasakice_pbru.santipap.guideapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindWidget(); //)ประกาศตัวแปรที่เราจะใช้
        buttoncontroler();

    }//main method

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

    }//bindWidget


}
