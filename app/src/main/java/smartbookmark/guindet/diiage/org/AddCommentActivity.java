package smartbookmark.guindet.diiage.org;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;

import java.util.List;

public class AddCommentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_comment);

        Spinner spinnerLivres = (Spinner) findViewById(R.id.spnBooks);
        BooksBDD booksBdd = new BooksBDD(this);
        MyDatas md = new MyDatas(this,null);
        Button btnAddComment = (Button)findViewById(R.id.btnValidComment);

        ArrayAdapter<Book> adapterLivre = new ArrayAdapter<Book>(this, android.R.layout.simple_spinner_item, (List<Book>) booksBdd.getLivres());
        adapterLivre.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLivres.setAdapter(adapterLivre);

    }
}
