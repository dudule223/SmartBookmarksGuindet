package smartbookmark.guindet.diiage.org;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDatas md = new MyDatas(this,null);

        Button btnNotes = (Button)findViewById(R.id.btnComments);
        Button btnAddCommentaire = (Button)findViewById(R.id.btnAddComment);
        TextView txtStats = (TextView)findViewById(R.id.txtStats);



        txtStats.setText("Il y a * livre(s), * commentaire(s), et une moyenne de * commentaire(s) par livre");


        //Dirige vers la liste des notes
        btnNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CommentsActivity.class));
            }
        });

        //Dirige vers l'activité pour ajouter un commentaire
        btnAddCommentaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddCommentActivity.class));
            }
        });

    }
}
