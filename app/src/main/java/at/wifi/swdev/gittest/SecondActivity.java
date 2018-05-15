package at.wifi.swdev.gittest;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.Button;
        import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView hello_tv = findViewById(R.id.hello_tv);
        Button getname_btn = findViewById(R.id.getname_btn);

    }

}