package neu.edu.madcourse.neumad20spring_yimingzhao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Name: Yiming", "Email: zhao.yimin@husky.neu.edu");
                Toast.makeText(getApplicationContext(), "Hi,babe!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
