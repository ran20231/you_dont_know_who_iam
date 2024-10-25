package com.forsale.app.datalayer.database;

import android.database.Cursor;
import kotlin.jvm.internal.o;
import l4.i;
import x10.a;
/* compiled from: DBUtilityFunctions.kt */
/* loaded from: classes2.dex */
public final class DBUtilityFunctionsKt {
    public static final boolean isColumnExistsInDatabase(i database, String table, String column) {
        o.i(database, "database");
        o.i(table, "table");
        o.i(column, "column");
        Cursor cursor = null;
        try {
            cursor = database.o1("PRAGMA table_info(" + table + ")");
            boolean z11 = false;
            if (cursor != null) {
                while (true) {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    int columnIndex = cursor.getColumnIndex("name");
                    if (columnIndex >= 0) {
                        String string = cursor.getString(columnIndex);
                        a.b("isColumnExistsInDatabase: " + string, new Object[0]);
                        if (o.d(column, string)) {
                            z11 = true;
                            break;
                        }
                    }
                }
            }
            return z11;
        } finally {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
    }
}
