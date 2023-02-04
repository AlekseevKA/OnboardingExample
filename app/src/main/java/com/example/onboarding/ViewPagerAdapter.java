package com.example.onboarding;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;

    int images[] = {

            R.drawable.image1,
            R.drawable.image22,
            R.drawable.yyyyyybbbar,
            R.drawable.image44

    };
    int images2[] = {

      //      R.drawable.vector1,
      //      R.drawable.vector2,
      //      R.drawable.vector3,
      //      R.drawable.vector4

    };



    int headings[] = {

            R.string.heading_one,
            R.string.heading_two,
            R.string.heading_three,
            R.string.heading_fourth
    };

    int description[] = {

      R.string.desc_one,
      R.string.desc_two,
      R.string.desc_three,
      R.string.desc_fourth
    };


    public ViewPagerAdapter(Context context){

        this.context = context;

    }

    @Override
    public int getCount() {
        return  headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (ConstraintLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slider_layout,container,false);

        ImageView slidetitleimage = (ImageView) view.findViewById(R.id.titleImage);
        ImageView slidetitleimage2 = (ImageView) view.findViewById(R.id.titleImage2);
        TextView slideHeading = (TextView) view.findViewById(R.id.texttitle);
        TextView slideDesciption = (TextView) view.findViewById(R.id.textdeccription);




  //      LinearLayout slidelayout = (LinearLayout) view.findViewById(R.id.linearLayout);
  //      slidelayout.setLayoutMode(fragments[position]);

        slidetitleimage.setImageResource(images[position]);
//        slidetitleimage2.setImageResource(images2[position]);
        slideHeading.setText(headings[position]);
        slideDesciption.setText(description[position]);

        container.addView(view);

        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((ConstraintLayout)object);

    }
}
