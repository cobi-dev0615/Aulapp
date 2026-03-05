package co.ceduladigital.sdk;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import kotlin.jvm.functions.Function4;

/* loaded from: classes.dex */
public final /* synthetic */ class w5 implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Cursor query$lambda$1;
        Cursor query$lambda$0;
        switch (this.a) {
            case 0:
                query$lambda$1 = FrameworkSQLiteDatabase.query$lambda$1((SupportSQLiteQuery) this.b, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$1;
            default:
                query$lambda$0 = FrameworkSQLiteDatabase.query$lambda$0((Function4) this.b, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$0;
        }
    }
}
