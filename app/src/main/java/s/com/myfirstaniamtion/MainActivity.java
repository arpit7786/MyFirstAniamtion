package s.com.myfirstaniamtion;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button mClick;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mClick = (Button) findViewById(R.id.buttonClick);
        img = (ImageView) findViewById(R.id.imageView);
        final Drawable d = img.getDrawable();


        mClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if (d instanceof AnimatedVectorDrawableCompat){
                    AnimatedVectorDrawableCompat avd = (AnimatedVectorDrawableCompat) d;
                    avd.start();
                }
                else if (d instanceof AnimatedVectorDrawable){
                    AnimatedVectorDrawable avd = (AnimatedVectorDrawable) d;
                    avd.start();
                }

            }
        });
    }
}
