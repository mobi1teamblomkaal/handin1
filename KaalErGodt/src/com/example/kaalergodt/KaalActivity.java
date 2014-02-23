package com.example.kaalergodt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KaalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kaal);
	}

	public void toOtherActivity(View view) {
		Intent i = new Intent(this, MereKaalErBedreActivity.class);
		startActivity(i);
	}
	
	public void toOtherActivityWithReorder(View view) {
		Intent i = new Intent(this, MereKaalErBedreActivity.class);
		i.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		startActivity(i);
	}
}
