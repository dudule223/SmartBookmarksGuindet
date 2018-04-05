package smartbookmark.guindet.diiage.org;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;

public class MyDatas extends SQLiteOpenHelper
{

    private static final String DATABASE_NAME = "SmartBookmarksGuindet";

    private static final int DATABASE_VERSION = 1;

    public MyDatas(Context context, SQLiteDatabase.CursorFactory factory) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {

        sqLiteDatabase.execSQL("CREATE TABLE \"Books\" (\"id\" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , \"title\" TEXT NOT NULL , \"author\" TEXT NOT NULL , \"genre\"TEXT NOT NULL ); \n" +
                "CREATE TABLE \"Comments\" (\"id\"  PRIMARY KEY  NOT NULL , \"bookId\" INTEGER  NOT NULL, \"page\" INTEGER NOT NULL , \"comment\"  NOT NULL , \"date\" DATETIME NOT NULL ); \n" +
                "INSERT INTO \"Books\" VALUES(1,'Les fleurs du mal','Charles Baudelaire','Poèmes'); \n" +
                "INSERT INTO \"Books\" VALUES(2,'Germinal','Emile Zola','Roman'); \n" +
                "INSERT INTO \"Books\" VALUES(3,'Les misérables','Victor Hugo','Roman'); \n" +
                "INSERT INTO \"Books\" VALUES(4,'1984','George Orwell','Science-Fiction'); \n" +
                "INSERT INTO \"Books\" VALUES(5,'Le Meilleur des mondes','Aldous Huxley','Science-Fiction'); \n" +
                "INSERT INTO \"Books\" VALUES(6,'Vingt mille lieues sous les mers','Jules Verne','Aventure'); \n" +
                "INSERT INTO \"Books\" VALUES(7,'Les Trois Mousquetaires','Alexandre Dumas','Aventure'); ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int nextVersion)
    {
        if (nextVersion >= 2 && oldVersion < 2)
        {
            //On fait la maj 2
            //sqLiteDatabase.execSQL();
        }
    }

}
