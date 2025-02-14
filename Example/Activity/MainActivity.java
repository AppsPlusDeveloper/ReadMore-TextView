package erickc.appsplus.readmore.textview;

import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.text.*;
import android.text.style.*;

public class MainActivity extends Activity {
	
	private ReadMoreTextView readMoreTextView;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		readMoreTextView = findViewById(R.id.readMoreTextView);
	}

}