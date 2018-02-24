package blog.matheuscastiglioni.com.br.injetando_views_butterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.et_nome)
    EditText et_nome;
    @BindView(R.id.tv_nome)
    TextView tv_nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_ola)
    public void ola() {
        if (!this.et_nome.getText().toString().equals("")) {
            this.tv_nome.setText(String.format("Olá %s", this.et_nome.getText().toString()));
        }
    }

}
