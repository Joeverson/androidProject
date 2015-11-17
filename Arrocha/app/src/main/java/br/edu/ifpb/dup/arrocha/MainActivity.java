package br.edu.ifpb.dup.arrocha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView telaApresentacao;
    private Button btnGo;
    private EditText inputText;
    private ProcessingNumber game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //jogando os elementos para ser utilizados no futuro
        telaApresentacao = (TextView) findViewById(R.id.screenShow);
        btnGo = (Button) findViewById(R.id.btn_go);
        inputText = (EditText) findViewById(R.id.txt_chute);
        Log.w("tstAPP", "entrando agora");
        this.game = new ProcessingNumber();
        Log.w("tstAPP", "criado o objeto");
        this.game.playing(10);
        Log.w("tstAPP", "passou pelo execucao");

    }
}
