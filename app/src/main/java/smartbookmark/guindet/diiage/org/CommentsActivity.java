package smartbookmark.guindet.diiage.org;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class CommentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);

        ListView lvComments = (ListView)findViewById(R.id.lvComments);
        CommentsBDD commentsBdd = new CommentsBDD(this);

        MyDatas md = new MyDatas(this,null);
        ArrayAdapter<Comment> arcomment = new ArrayAdapter<Comment>(this,R.layout.item_comment, (List<Comment>) commentsBdd.getComments());
        lvComments.setAdapter(arcomment);
    }
}
