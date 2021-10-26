package com.wankercraft.dice;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

public class RollAnimation extends Activity {

    static RollAnimation an = new RollAnimation();

    public static void rollAnimation() {
        // get image resource assign to variable imgbutton
        ImageView imgButton = (ImageView) an.findViewById(R.id.rollButton);

        ObjectAnimator anim = ObjectAnimator.ofFloat(imgButton, "rotationY", 0.0f);
        //duration
        anim.setDuration(1500);
        //repeatability
        anim.setRepeatCount(1);
        //set interpolator
        anim.setInterpolator(new AccelerateDecelerateInterpolator());
        //listener for animation end
        anim.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
            }
        });
        //start anim
        anim.start();
    }
}