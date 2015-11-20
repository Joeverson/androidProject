package br.edu.ifpb.dup.myimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView txt;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.loadComponents();
        this.loadEvents();
    }

    private void loadComponents(){
        this.btn = (Button) findViewById(R.id.btn_image);
        this.txt = (TextView) findViewById(R.id.text_description);
        this.img = (ImageView) findViewById(R.id.imageView);
    }

    private void loadEvents(){
        this.btn.setOnClickListener(new onClickCurto());
        this.btn.setOnLongClickListener(new onClickLongo());
    }

    private class onClickCurto implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            MainActivity.this.img.setBackgroundResource(R.drawable.shooter001);
            MainActivity.this.txt.setText(MainActivity.this.img.getTransitionName());
        }
    }

    private class onClickLongo implements View.OnLongClickListener{

        @Override
        public boolean onLongClick(View v) {
            MainActivity.this.img.setBackgroundResource(R.drawable.powe_ranger_grande);
            MainActivity.this.txt.setText("esse aqui");
            return true;
        }
    }
}
