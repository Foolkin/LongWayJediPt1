package longwayjedi.pt1;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
	
	private RelativeLayout background;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		background = (RelativeLayout) findViewById(R.id.relative_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void changeColor(View view) {
		Random rand = new Random();
		int red = (int) rand.nextInt() * 255;
		int green = (int) rand.nextInt() * 255;
		int blue = (int) rand.nextInt() * 255;
		
		background.setBackgroundColor(Color.rgb(red, green, blue));
	}
}
