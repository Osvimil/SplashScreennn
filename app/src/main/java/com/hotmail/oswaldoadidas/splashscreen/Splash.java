package com.hotmail.oswaldoadidas.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by oswaldosaldivar on 03/05/16.
 */
public class Splash extends Activity {


    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.splash);

        final ImageView imageView = (ImageView)findViewById(R.id.imagen);
        final Animation animation = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);
        final Animation animation1 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.abc_fade_out);

        imageView.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                imageView.startAnimation(animation1);
                finish();
                Intent intent = new Intent(Splash.this,MainActivity.class);
                startActivity(intent);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}
