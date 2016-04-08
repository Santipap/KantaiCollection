package netkasakice_pbru.santipap.guideapp;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by hibiki on 4/5/2016.
 */
public class MyAdapter extends BaseAdapter{
    //Explicit ประกาศตัวแปร
    private Context context;
    private int[] iconInts;
    private String[] titleStrings,detailStrings;

    public MyAdapter(Context context, int[] iconInts, String[] titleString, String[] datailStrings) { // ait+insert  ตัวแปรตรงนี้คือ MainActivityjava ที่ส่งข้อมูลเข้ามา
        this.context = context;
        this.iconInts = iconInts;
        this.titleStrings = titleString;
        this.detailStrings = datailStrings;
    }//ส่วนประกาศตัวแปร


    @Override
    public int getCount() {
        return iconInts.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.traffic_listview,viewGroup,false);

//for icon
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);

        //fot title
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[i]);

        //for detail
        TextView detailTextView = (TextView) view1.findViewById(R.id.textView3);
        detailTextView.setText(detailStrings[i]);

        return view1;
    }
}// MyAdapter class ที่สร้างใหม่

