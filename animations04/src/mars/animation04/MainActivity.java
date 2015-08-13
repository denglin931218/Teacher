package mars.animation04;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateDecelerateInterpolator;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
	private Button button = null;
	private ImageView imageView =null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        imageView = (ImageView) findViewById(R.id.imageViewId);
        button = (Button) findViewById(R.id.scaleButtonId);
        button.setOnClickListener(new AnimationButtonListener());
    }
    public class AnimationButtonListener implements OnClickListener{
		@Override
		public void onClick(View v) {
			
			/* AnimationSet animationSet = new AnimationSet(false);
				AlphaAnimation alpha = new AlphaAnimation(1.0f, 0.0f);
				alpha.setInterpolator(new DecelerateInterpolator());
				RotateAnimation rotate = new RotateAnimation(0, 360,
						Animation.RELATIVE_TO_SELF, 0.5f,
						Animation.RELATIVE_TO_SELF, 0.5f);
				rotate.setInterpolator(new AccelerateInterpolator());
				animationSet.addAnimation(alpha);
				animationSet.addAnimation(rotate);
				animationSet.setDuration(2000);
				animationSet.setStartOffset(500);
				imageView.startAnimation(animationSet);*/
			
			
		AnimationSet animationSet = new AnimationSet(false);
		AlphaAnimation alph =new AlphaAnimation(1.0f, 0.0f);
		alph.setInterpolator(new DecelerateInterpolator());
		RotateAnimation rotate = new RotateAnimation(0, 360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
		rotate.setInterpolator(new AccelerateDecelerateInterpolator());
		animationSet.addAnimation(alph);
		animationSet.addAnimation(rotate);
		animationSet.setDuration(2000);
		animationSet.setStartOffset(500);
		imageView.startAnimation(animationSet);
			
		}
    }

	
}