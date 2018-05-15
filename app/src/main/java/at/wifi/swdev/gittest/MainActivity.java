package at.wifi.swdev.gittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hello_tv = findViewById(R.id.hello_tv);
        Button getname_btn = findViewById(R.id.getname_btn);

    }

    public void startSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);


    }
}
