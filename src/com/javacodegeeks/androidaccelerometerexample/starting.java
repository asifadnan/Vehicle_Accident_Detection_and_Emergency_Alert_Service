package com.javacodegeeks.androidaccelerometerexample;

import java.net.URL;





import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class starting extends Activity {
	
	Button submit, previous,emergency;
    TextView number;
 
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starting);
        
        number  = (TextView)findViewById(R.id.number);
        submit = (Button)findViewById(R.id.submit);
        previous = (Button)findViewById(R.id.previous);
        emergency = (Button)findViewById(R.id.emergency);
        
        
        submit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                
            	String to=number.getText().toString();;
            	
            	String uu="http://khalidex.com/smsapi/adnan.php?body=fuck&from=5555&pre=0&to="+to;
                WebView x=(WebView) findViewById(R.id.wbBrowser);
                x.loadUrl(uu);
            	Toast.makeText(getApplicationContext(), "your Emergency number hasbeen Updated to "+to, 2000).show();
            	Intent i =new Intent(starting.this,mactivity.class);
                startActivity(i);
            	 
            }

			private void executeReq(URL url) {
				// TODO Auto-generated method stub
				
			}
        });

        previous.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            	Intent i =new Intent(starting.this,mactivity.class);
                startActivity(i);
               
            	 
            }
        });

        emergency.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            	Intent i =new Intent(starting.this,hello.class);
                startActivity(i);
               
            }
        });
}
}