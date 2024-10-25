package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.BottomTipEntity;
import com.forsale.app.datalayer.database.MasterDataBottomTooltipSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import l4.m;
import wz.p;
/* loaded from: classes2.dex */
public final class BottomTipDao_Impl implements BottomTipDao {
    private final RoomDatabase __db;
    private final i<BottomTipEntity> __insertionAdapterOfBottomTipEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllBottomTips;
    private final SharedSQLiteStatement __preparedStmtOfResetLastShow;
    private final SharedSQLiteStatement __preparedStmtOfUpdateSingleTip;
    private final SharedSQLiteStatement __preparedStmtOfUpdateTip;
    private final SharedSQLiteStatement __preparedStmtOfUpdateTipAndResetCount;

    public BottomTipDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfBottomTipEntity = new i<BottomTipEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.BottomTipDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `bottom_tips_table` (`id`,`tab_id`,`reset_count`,`tab_order`,`max_views_sessions`,`duration_milliseconds`,`count_views`,`is_last_show`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, BottomTipEntity bottomTipEntity) {
                mVar.d1(1, bottomTipEntity.getId());
                if (bottomTipEntity.getTabId() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, bottomTipEntity.getTabId());
                }
                mVar.d1(3, bottomTipEntity.getResetCount());
                mVar.d1(4, bottomTipEntity.getTabOrder());
                mVar.d1(5, bottomTipEntity.getMaxViewsSessions());
                mVar.d1(6, bottomTipEntity.getDurationMilliseconds());
                mVar.d1(7, bottomTipEntity.getCountViews());
                mVar.d1(8, bottomTipEntity.isLastShow() ? 1L : 0L);
            }
        };
        this.__preparedStmtOfDeleteAllBottomTips = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.BottomTipDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM BOTTOM_TIPS_TABLE";
            }
        };
        this.__preparedStmtOfResetLastShow = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.BottomTipDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE BOTTOM_TIPS_TABLE SET is_last_show = 0 WHERE is_last_show = 1";
            }
        };
        this.__preparedStmtOfUpdateSingleTip = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.BottomTipDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE BOTTOM_TIPS_TABLE SET is_last_show = 1, count_views = count_views + 1 WHERE id = ?";
            }
        };
        this.__preparedStmtOfUpdateTipAndResetCount = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.BottomTipDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE BOTTOM_TIPS_TABLE SET tab_id = ?, reset_count = ?, tab_order = ?, max_views_sessions = ?, duration_milliseconds = ?, count_views = ?   WHERE id = ?";
            }
        };
        this.__preparedStmtOfUpdateTip = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.BottomTipDao_Impl.6
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE BOTTOM_TIPS_TABLE SET tab_id = ?, reset_count = ?, tab_order = ?, max_views_sessions = ?, duration_milliseconds = ? WHERE id = ?";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.BottomTipDao
    public Object deleteAllBottomTips(zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.BottomTipDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = BottomTipDao_Impl.this.__preparedStmtOfDeleteAllBottomTips.acquire();
                try {
                    BottomTipDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    BottomTipDao_Impl.this.__db.setTransactionSuccessful();
                    BottomTipDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    BottomTipDao_Impl.this.__preparedStmtOfDeleteAllBottomTips.release(acquire);
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.BottomTipDao
    public Object getAllBottomTips(zz.a<? super List<BottomTipEntity>> aVar) {
        final v i11 = v.i("SELECT * FROM BOTTOM_TIPS_TABLE ORDER BY tab_order ASC", 0);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<BottomTipEntity>>() { // from class: com.forsale.app.datalayer.repositories.BottomTipDao_Impl.14
            @Override // java.util.concurrent.Callable
            public List<BottomTipEntity> call() throws Exception {
                Cursor c11 = j4.b.c(BottomTipDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, MasterDataBottomTooltipSettings.TAB_ID);
                    int e13 = j4.a.e(c11, MasterDataBottomTooltipSettings.RESET_COUNT);
                    int e14 = j4.a.e(c11, "tab_order");
                    int e15 = j4.a.e(c11, "max_views_sessions");
                    int e16 = j4.a.e(c11, "duration_milliseconds");
                    int e17 = j4.a.e(c11, "count_views");
                    int e18 = j4.a.e(c11, "is_last_show");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new BottomTipEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.getInt(e13), c11.getInt(e14), c11.getInt(e15), c11.getInt(e16), c11.getInt(e17), c11.getInt(e18) != 0));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.BottomTipDao
    public Object getSingle(int i11, zz.a<? super BottomTipEntity> aVar) {
        final v i12 = v.i("SELECT * FROM BOTTOM_TIPS_TABLE Where id = ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<BottomTipEntity>() { // from class: com.forsale.app.datalayer.repositories.BottomTipDao_Impl.15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public BottomTipEntity call() throws Exception {
                BottomTipEntity bottomTipEntity = null;
                Cursor c11 = j4.b.c(BottomTipDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, MasterDataBottomTooltipSettings.TAB_ID);
                    int e13 = j4.a.e(c11, MasterDataBottomTooltipSettings.RESET_COUNT);
                    int e14 = j4.a.e(c11, "tab_order");
                    int e15 = j4.a.e(c11, "max_views_sessions");
                    int e16 = j4.a.e(c11, "duration_milliseconds");
                    int e17 = j4.a.e(c11, "count_views");
                    int e18 = j4.a.e(c11, "is_last_show");
                    if (c11.moveToFirst()) {
                        bottomTipEntity = new BottomTipEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.getInt(e13), c11.getInt(e14), c11.getInt(e15), c11.getInt(e16), c11.getInt(e17), c11.getInt(e18) != 0);
                    }
                    return bottomTipEntity;
                } finally {
                    c11.close();
                    i12.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.BottomTipDao
    public Object onInsertAll(final List<BottomTipEntity> list, zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.BottomTipDao_Impl.7
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                BottomTipDao_Impl.this.__db.beginTransaction();
                try {
                    BottomTipDao_Impl.this.__insertionAdapterOfBottomTipEntity.insert((Iterable) list);
                    BottomTipDao_Impl.this.__db.setTransactionSuccessful();
                    return p.f75480a;
                } finally {
                    BottomTipDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.BottomTipDao
    public Object onInsertSingle(final BottomTipEntity bottomTipEntity, zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.BottomTipDao_Impl.8
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                BottomTipDao_Impl.this.__db.beginTransaction();
                try {
                    BottomTipDao_Impl.this.__insertionAdapterOfBottomTipEntity.insert((i) bottomTipEntity);
                    BottomTipDao_Impl.this.__db.setTransactionSuccessful();
                    return p.f75480a;
                } finally {
                    BottomTipDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.BottomTipDao
    public Object resetLastShow(zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.BottomTipDao_Impl.10
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                m acquire = BottomTipDao_Impl.this.__preparedStmtOfResetLastShow.acquire();
                try {
                    BottomTipDao_Impl.this.__db.beginTransaction();
                    acquire.O();
                    BottomTipDao_Impl.this.__db.setTransactionSuccessful();
                    p pVar = p.f75480a;
                    BottomTipDao_Impl.this.__db.endTransaction();
                    return pVar;
                } finally {
                    BottomTipDao_Impl.this.__preparedStmtOfResetLastShow.release(acquire);
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.BottomTipDao
    public Object updateSingleTip(final int i11, zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.BottomTipDao_Impl.11
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                m acquire = BottomTipDao_Impl.this.__preparedStmtOfUpdateSingleTip.acquire();
                acquire.d1(1, i11);
                try {
                    BottomTipDao_Impl.this.__db.beginTransaction();
                    acquire.O();
                    BottomTipDao_Impl.this.__db.setTransactionSuccessful();
                    p pVar = p.f75480a;
                    BottomTipDao_Impl.this.__db.endTransaction();
                    return pVar;
                } finally {
                    BottomTipDao_Impl.this.__preparedStmtOfUpdateSingleTip.release(acquire);
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.BottomTipDao
    public Object updateTip(final int i11, final String str, final int i12, final int i13, final int i14, final int i15, zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.BottomTipDao_Impl.13
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                m acquire = BottomTipDao_Impl.this.__preparedStmtOfUpdateTip.acquire();
                String str2 = str;
                if (str2 == null) {
                    acquire.u1(1);
                } else {
                    acquire.Q0(1, str2);
                }
                acquire.d1(2, i12);
                acquire.d1(3, i13);
                acquire.d1(4, i14);
                acquire.d1(5, i15);
                acquire.d1(6, i11);
                try {
                    BottomTipDao_Impl.this.__db.beginTransaction();
                    acquire.O();
                    BottomTipDao_Impl.this.__db.setTransactionSuccessful();
                    p pVar = p.f75480a;
                    BottomTipDao_Impl.this.__db.endTransaction();
                    return pVar;
                } finally {
                    BottomTipDao_Impl.this.__preparedStmtOfUpdateTip.release(acquire);
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.BottomTipDao
    public Object updateTipAndResetCount(final int i11, final String str, final int i12, final int i13, final int i14, final int i15, final int i16, zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.BottomTipDao_Impl.12
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                m acquire = BottomTipDao_Impl.this.__preparedStmtOfUpdateTipAndResetCount.acquire();
                String str2 = str;
                if (str2 == null) {
                    acquire.u1(1);
                } else {
                    acquire.Q0(1, str2);
                }
                acquire.d1(2, i12);
                acquire.d1(3, i13);
                acquire.d1(4, i14);
                acquire.d1(5, i15);
                acquire.d1(6, i16);
                acquire.d1(7, i11);
                try {
                    BottomTipDao_Impl.this.__db.beginTransaction();
                    acquire.O();
                    BottomTipDao_Impl.this.__db.setTransactionSuccessful();
                    p pVar = p.f75480a;
                    BottomTipDao_Impl.this.__db.endTransaction();
                    return pVar;
                } finally {
                    BottomTipDao_Impl.this.__preparedStmtOfUpdateTipAndResetCount.release(acquire);
                }
            }
        }, aVar);
    }
}
