package smartbookmark.guindet.diiage.org;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class CommentsBDD {
    private SQLiteDatabase bdd;
    private MyDatas maBaseSQLite;

    public CommentsBDD(Context context){
        //On crée la BDD et sa table
        maBaseSQLite = new MyDatas(context, null);
    }

    public void open(){
        //on ouvre la BDD en écriture
        bdd = maBaseSQLite.getWritableDatabase();
    }

    public void close(){
        //on ferme l'accès à la BDD
        bdd.close();
    }

    public SQLiteDatabase getBDD(){
        return bdd;
    }

    //Compte les livres
    public List<Comment> getComments()
    {
        List<Comment> commentaires = new ArrayList<>();
        Cursor c = bdd.query("Comments", new String[] {"id", "bookId","page","comment","date"},null, null, null, null, "date DESC");
        if (c.moveToFirst()) {
            do {
                Comment newComment = new Comment();
                newComment.setId(c.getInt(0));
                newComment.setBookId(c.getInt(1));
                newComment.setPage(c.getInt(2));
                newComment.setComment(c.getString(3));
                //newComment.setDate(c.getString(4));

                commentaires.add(newComment);
            } while(c.moveToNext());
        }
        //si aucun élément n'a été retourné dans la requête, on renvoie null
        if (c.getCount() == 0)
            return null;

        c.close();
        //On retourne le livre
        return commentaires;
    }
}
