package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.CategoryConverters;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.FiltrationDataConverters;
import com.forsale.app.datalayer.database.SearchHistoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import l4.m;
import wz.p;
/* loaded from: classes2.dex */
public final class SearchHistoryDao_Impl implements SearchHistoryDao {
    private final RoomDatabase __db;
    private final h<SearchHistoryEntity> __deletionAdapterOfSearchHistoryEntity;
    private final i<SearchHistoryEntity> __insertionAdapterOfSearchHistoryEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final SharedSQLiteStatement __preparedStmtOfDeleteById;
    private final SharedSQLiteStatement __preparedStmtOfDeleteOldestRecord;
    private final SharedSQLiteStatement __preparedStmtOfDeleteOldestRecord_1;
    private final CategoryConverters __categoryConverters = new CategoryConverters();
    private final FiltrationDataConverters __filtrationDataConverters = new FiltrationDataConverters();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl$18  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass18 {
        static final /* synthetic */ int[] $SwitchMap$com$forsale$app$datalayer$database$SearchHistoryEntity$SearchHistorySource;

        static {
            int[] iArr = new int[SearchHistoryEntity.SearchHistorySource.values().length];
            $SwitchMap$com$forsale$app$datalayer$database$SearchHistoryEntity$SearchHistorySource = iArr;
            try {
                iArr[SearchHistoryEntity.SearchHistorySource.SEARCH_HISTORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$forsale$app$datalayer$database$SearchHistoryEntity$SearchHistorySource[SearchHistoryEntity.SearchHistorySource.MATCHING_CATEGORIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public SearchHistoryDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfSearchHistoryEntity = new i<SearchHistoryEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `search_history_table` (`id`,`search_text`,`category_id`,`category_name`,`category`,`filters`,`source`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, SearchHistoryEntity searchHistoryEntity) {
                mVar.d1(1, searchHistoryEntity.getId());
                if (searchHistoryEntity.getSearchText() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, searchHistoryEntity.getSearchText());
                }
                if (searchHistoryEntity.getCategoryId() == null) {
                    mVar.u1(3);
                } else {
                    mVar.d1(3, searchHistoryEntity.getCategoryId().intValue());
                }
                if (searchHistoryEntity.getCategoryName() == null) {
                    mVar.u1(4);
                } else {
                    mVar.Q0(4, searchHistoryEntity.getCategoryName());
                }
                String categoryConverters = SearchHistoryDao_Impl.this.__categoryConverters.toString(searchHistoryEntity.getCategory());
                if (categoryConverters == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, categoryConverters);
                }
                String filtrationDataConverters = SearchHistoryDao_Impl.this.__filtrationDataConverters.toString(searchHistoryEntity.getFiltrationData());
                if (filtrationDataConverters == null) {
                    mVar.u1(6);
                } else {
                    mVar.Q0(6, filtrationDataConverters);
                }
                if (searchHistoryEntity.getSource() != null) {
                    mVar.Q0(7, SearchHistoryDao_Impl.this.__SearchHistorySource_enumToString(searchHistoryEntity.getSource()));
                } else {
                    mVar.u1(7);
                }
            }
        };
        this.__deletionAdapterOfSearchHistoryEntity = new h<SearchHistoryEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl.2
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `search_history_table` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, SearchHistoryEntity searchHistoryEntity) {
                mVar.d1(1, searchHistoryEntity.getId());
            }
        };
        this.__preparedStmtOfDeleteOldestRecord = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM search_history_table WHERE ID = (SELECT MIN(ID) FROM search_history_table )";
            }
        };
        this.__preparedStmtOfDeleteOldestRecord_1 = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM search_history_table WHERE ID = (SELECT MIN(ID) FROM search_history_table ) AND source = ?";
            }
        };
        this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM search_history_table WHERE ID = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl.6
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM search_history_table";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String __SearchHistorySource_enumToString(SearchHistoryEntity.SearchHistorySource searchHistorySource) {
        int i11 = AnonymousClass18.$SwitchMap$com$forsale$app$datalayer$database$SearchHistoryEntity$SearchHistorySource[searchHistorySource.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return "MATCHING_CATEGORIES";
            }
            throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + searchHistorySource);
        }
        return "SEARCH_HISTORY";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SearchHistoryEntity.SearchHistorySource __SearchHistorySource_stringToEnum(String str) {
        str.hashCode();
        if (!str.equals("SEARCH_HISTORY")) {
            if (str.equals("MATCHING_CATEGORIES")) {
                return SearchHistoryEntity.SearchHistorySource.MATCHING_CATEGORIES;
            }
            throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
        }
        return SearchHistoryEntity.SearchHistorySource.SEARCH_HISTORY;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.SearchHistoryDao
    public Object delete(final SearchHistoryEntity searchHistoryEntity, zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl.8
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                SearchHistoryDao_Impl.this.__db.beginTransaction();
                try {
                    SearchHistoryDao_Impl.this.__deletionAdapterOfSearchHistoryEntity.handle(searchHistoryEntity);
                    SearchHistoryDao_Impl.this.__db.setTransactionSuccessful();
                    return p.f75480a;
                } finally {
                    SearchHistoryDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.SearchHistoryDao
    public Object deleteAll(zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl.11
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                m acquire = SearchHistoryDao_Impl.this.__preparedStmtOfDeleteAll.acquire();
                try {
                    SearchHistoryDao_Impl.this.__db.beginTransaction();
                    acquire.O();
                    SearchHistoryDao_Impl.this.__db.setTransactionSuccessful();
                    p pVar = p.f75480a;
                    SearchHistoryDao_Impl.this.__db.endTransaction();
                    return pVar;
                } finally {
                    SearchHistoryDao_Impl.this.__preparedStmtOfDeleteAll.release(acquire);
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.SearchHistoryDao
    public Object deleteById(final int i11, zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl.10
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                m acquire = SearchHistoryDao_Impl.this.__preparedStmtOfDeleteById.acquire();
                acquire.d1(1, i11);
                try {
                    SearchHistoryDao_Impl.this.__db.beginTransaction();
                    acquire.O();
                    SearchHistoryDao_Impl.this.__db.setTransactionSuccessful();
                    p pVar = p.f75480a;
                    SearchHistoryDao_Impl.this.__db.endTransaction();
                    return pVar;
                } finally {
                    SearchHistoryDao_Impl.this.__preparedStmtOfDeleteById.release(acquire);
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.SearchHistoryDao
    public Object deleteOldestRecord(zz.a<? super p> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<p>() { // from class: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl.9
            @Override // java.util.concurrent.Callable
            public p call() throws Exception {
                m acquire = SearchHistoryDao_Impl.this.__preparedStmtOfDeleteOldestRecord.acquire();
                try {
                    SearchHistoryDao_Impl.this.__db.beginTransaction();
                    acquire.O();
                    SearchHistoryDao_Impl.this.__db.setTransactionSuccessful();
                    p pVar = p.f75480a;
                    SearchHistoryDao_Impl.this.__db.endTransaction();
                    return pVar;
                } finally {
                    SearchHistoryDao_Impl.this.__preparedStmtOfDeleteOldestRecord.release(acquire);
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.SearchHistoryDao
    public Flow<List<SearchHistoryEntity>> getAllBySourceOrDefaultWithLimit(SearchHistoryEntity.SearchHistorySource searchHistorySource, int i11) {
        final v i12 = v.i("SELECT * FROM search_history_table WHERE source =? OR source IS NULL ORDER BY ID DESC LIMIT ?", 2);
        i12.Q0(1, __SearchHistorySource_enumToString(searchHistorySource));
        i12.d1(2, i11);
        return CoroutinesRoom.a(this.__db, false, new String[]{SearchHistoryEntity.tableName}, new Callable<List<SearchHistoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl.14
            protected void finalize() {
                i12.release();
            }

            @Override // java.util.concurrent.Callable
            public List<SearchHistoryEntity> call() throws Exception {
                Cursor c11 = j4.b.c(SearchHistoryDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "search_text");
                    int e13 = j4.a.e(c11, "category_id");
                    int e14 = j4.a.e(c11, "category_name");
                    int e15 = j4.a.e(c11, "category");
                    int e16 = j4.a.e(c11, "filters");
                    int e17 = j4.a.e(c11, "source");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new SearchHistoryEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13)), c11.isNull(e14) ? null : c11.getString(e14), SearchHistoryDao_Impl.this.__categoryConverters.toCategory(c11.isNull(e15) ? null : c11.getString(e15)), SearchHistoryDao_Impl.this.__filtrationDataConverters.toFiltrationData(c11.isNull(e16) ? null : c11.getString(e16)), c11.isNull(e17) ? null : SearchHistoryDao_Impl.this.__SearchHistorySource_stringToEnum(c11.getString(e17))));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.SearchHistoryDao
    public Flow<List<SearchHistoryEntity>> getAllBySourceWithLimit(SearchHistoryEntity.SearchHistorySource searchHistorySource, int i11) {
        final v i12 = v.i("SELECT * FROM search_history_table WHERE source = ? ORDER BY ID DESC LIMIT ?", 2);
        i12.Q0(1, __SearchHistorySource_enumToString(searchHistorySource));
        i12.d1(2, i11);
        return CoroutinesRoom.a(this.__db, false, new String[]{SearchHistoryEntity.tableName}, new Callable<List<SearchHistoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl.15
            protected void finalize() {
                i12.release();
            }

            @Override // java.util.concurrent.Callable
            public List<SearchHistoryEntity> call() throws Exception {
                Cursor c11 = j4.b.c(SearchHistoryDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "search_text");
                    int e13 = j4.a.e(c11, "category_id");
                    int e14 = j4.a.e(c11, "category_name");
                    int e15 = j4.a.e(c11, "category");
                    int e16 = j4.a.e(c11, "filters");
                    int e17 = j4.a.e(c11, "source");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new SearchHistoryEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13)), c11.isNull(e14) ? null : c11.getString(e14), SearchHistoryDao_Impl.this.__categoryConverters.toCategory(c11.isNull(e15) ? null : c11.getString(e15)), SearchHistoryDao_Impl.this.__filtrationDataConverters.toFiltrationData(c11.isNull(e16) ? null : c11.getString(e16)), c11.isNull(e17) ? null : SearchHistoryDao_Impl.this.__SearchHistorySource_stringToEnum(c11.getString(e17))));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.SearchHistoryDao
    public Flow<List<SearchHistoryEntity>> getAllWithLimit(int i11) {
        final v i12 = v.i("SELECT * FROM search_history_table ORDER BY ID DESC LIMIT ?", 1);
        i12.d1(1, i11);
        return CoroutinesRoom.a(this.__db, false, new String[]{SearchHistoryEntity.tableName}, new Callable<List<SearchHistoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl.12
            protected void finalize() {
                i12.release();
            }

            @Override // java.util.concurrent.Callable
            public List<SearchHistoryEntity> call() throws Exception {
                Cursor c11 = j4.b.c(SearchHistoryDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "search_text");
                    int e13 = j4.a.e(c11, "category_id");
                    int e14 = j4.a.e(c11, "category_name");
                    int e15 = j4.a.e(c11, "category");
                    int e16 = j4.a.e(c11, "filters");
                    int e17 = j4.a.e(c11, "source");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new SearchHistoryEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13)), c11.isNull(e14) ? null : c11.getString(e14), SearchHistoryDao_Impl.this.__categoryConverters.toCategory(c11.isNull(e15) ? null : c11.getString(e15)), SearchHistoryDao_Impl.this.__filtrationDataConverters.toFiltrationData(c11.isNull(e16) ? null : c11.getString(e16)), c11.isNull(e17) ? null : SearchHistoryDao_Impl.this.__SearchHistorySource_stringToEnum(c11.getString(e17))));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.SearchHistoryDao
    public Object getCount(zz.a<? super Integer> aVar) {
        final v i11 = v.i("SELECT COUNT(ID) FROM search_history_table ORDER BY ID DESC", 0);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl.17
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                Integer num = null;
                Cursor c11 = j4.b.c(SearchHistoryDao_Impl.this.__db, i11, false, null);
                try {
                    if (c11.moveToFirst() && !c11.isNull(0)) {
                        num = Integer.valueOf(c11.getInt(0));
                    }
                    return num;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.SearchHistoryDao
    public SearchHistoryEntity getSingleByCategoryId(int i11, SearchHistoryEntity.SearchHistorySource searchHistorySource) {
        String string;
        Integer valueOf;
        String string2;
        String string3;
        String string4;
        v i12 = v.i("SELECT * FROM search_history_table WHERE CATEGORY_ID = ? AND SOURCE = ?", 2);
        i12.d1(1, i11);
        if (searchHistorySource == null) {
            i12.u1(2);
        } else {
            i12.Q0(2, __SearchHistorySource_enumToString(searchHistorySource));
        }
        this.__db.assertNotSuspendingTransaction();
        SearchHistoryEntity searchHistoryEntity = null;
        SearchHistoryEntity.SearchHistorySource __SearchHistorySource_stringToEnum = null;
        Cursor c11 = j4.b.c(this.__db, i12, false, null);
        try {
            int e11 = j4.a.e(c11, "id");
            int e12 = j4.a.e(c11, "search_text");
            int e13 = j4.a.e(c11, "category_id");
            int e14 = j4.a.e(c11, "category_name");
            int e15 = j4.a.e(c11, "category");
            int e16 = j4.a.e(c11, "filters");
            int e17 = j4.a.e(c11, "source");
            if (c11.moveToFirst()) {
                int i13 = c11.getInt(e11);
                if (c11.isNull(e12)) {
                    string = null;
                } else {
                    string = c11.getString(e12);
                }
                if (c11.isNull(e13)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(c11.getInt(e13));
                }
                if (c11.isNull(e14)) {
                    string2 = null;
                } else {
                    string2 = c11.getString(e14);
                }
                if (c11.isNull(e15)) {
                    string3 = null;
                } else {
                    string3 = c11.getString(e15);
                }
                CategoryEntity category = this.__categoryConverters.toCategory(string3);
                if (c11.isNull(e16)) {
                    string4 = null;
                } else {
                    string4 = c11.getString(e16);
                }
                GetListingsBody.FiltrationData filtrationData = this.__filtrationDataConverters.toFiltrationData(string4);
                if (!c11.isNull(e17)) {
                    __SearchHistorySource_stringToEnum = __SearchHistorySource_stringToEnum(c11.getString(e17));
                }
                searchHistoryEntity = new SearchHistoryEntity(i13, string, valueOf, string2, category, filtrationData, __SearchHistorySource_stringToEnum);
            }
            return searchHistoryEntity;
        } finally {
            c11.close();
            i12.release();
        }
    }

    @Override // com.forsale.app.datalayer.repositories.SearchHistoryDao
    public Object getSingleBySearchText(String str, zz.a<? super SearchHistoryEntity> aVar) {
        final v i11 = v.i("SELECT * FROM search_history_table WHERE SEARCH_TEXT LIKE ? AND CATEGORY_ID IS null", 1);
        if (str == null) {
            i11.u1(1);
        } else {
            i11.Q0(1, str);
        }
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<SearchHistoryEntity>() { // from class: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public SearchHistoryEntity call() throws Exception {
                SearchHistoryEntity searchHistoryEntity = null;
                Cursor c11 = j4.b.c(SearchHistoryDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "search_text");
                    int e13 = j4.a.e(c11, "category_id");
                    int e14 = j4.a.e(c11, "category_name");
                    int e15 = j4.a.e(c11, "category");
                    int e16 = j4.a.e(c11, "filters");
                    int e17 = j4.a.e(c11, "source");
                    if (c11.moveToFirst()) {
                        searchHistoryEntity = new SearchHistoryEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13)), c11.isNull(e14) ? null : c11.getString(e14), SearchHistoryDao_Impl.this.__categoryConverters.toCategory(c11.isNull(e15) ? null : c11.getString(e15)), SearchHistoryDao_Impl.this.__filtrationDataConverters.toFiltrationData(c11.isNull(e16) ? null : c11.getString(e16)), c11.isNull(e17) ? null : SearchHistoryDao_Impl.this.__SearchHistorySource_stringToEnum(c11.getString(e17)));
                    }
                    return searchHistoryEntity;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.SearchHistoryDao
    public Object getSingleBySearchTextAndId(String str, int i11, zz.a<? super SearchHistoryEntity> aVar) {
        final v i12 = v.i("SELECT * FROM search_history_table WHERE SEARCH_TEXT LIKE ? AND CATEGORY_ID = ?", 2);
        if (str == null) {
            i12.u1(1);
        } else {
            i12.Q0(1, str);
        }
        i12.d1(2, i11);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<SearchHistoryEntity>() { // from class: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl.16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public SearchHistoryEntity call() throws Exception {
                SearchHistoryEntity searchHistoryEntity = null;
                Cursor c11 = j4.b.c(SearchHistoryDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "search_text");
                    int e13 = j4.a.e(c11, "category_id");
                    int e14 = j4.a.e(c11, "category_name");
                    int e15 = j4.a.e(c11, "category");
                    int e16 = j4.a.e(c11, "filters");
                    int e17 = j4.a.e(c11, "source");
                    if (c11.moveToFirst()) {
                        searchHistoryEntity = new SearchHistoryEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13)), c11.isNull(e14) ? null : c11.getString(e14), SearchHistoryDao_Impl.this.__categoryConverters.toCategory(c11.isNull(e15) ? null : c11.getString(e15)), SearchHistoryDao_Impl.this.__filtrationDataConverters.toFiltrationData(c11.isNull(e16) ? null : c11.getString(e16)), c11.isNull(e17) ? null : SearchHistoryDao_Impl.this.__SearchHistorySource_stringToEnum(c11.getString(e17)));
                    }
                    return searchHistoryEntity;
                } finally {
                    c11.close();
                    i12.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.SearchHistoryDao
    public Object insert(final SearchHistoryEntity searchHistoryEntity, zz.a<? super Long> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Long>() { // from class: com.forsale.app.datalayer.repositories.SearchHistoryDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                SearchHistoryDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(SearchHistoryDao_Impl.this.__insertionAdapterOfSearchHistoryEntity.insertAndReturnId(searchHistoryEntity));
                    SearchHistoryDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    SearchHistoryDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.SearchHistoryDao
    public void deleteOldestRecord(SearchHistoryEntity.SearchHistorySource searchHistorySource) {
        this.__db.assertNotSuspendingTransaction();
        m acquire = this.__preparedStmtOfDeleteOldestRecord_1.acquire();
        acquire.Q0(1, __SearchHistorySource_enumToString(searchHistorySource));
        try {
            this.__db.beginTransaction();
            acquire.O();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
        } finally {
            this.__preparedStmtOfDeleteOldestRecord_1.release(acquire);
        }
    }

    @Override // com.forsale.app.datalayer.repositories.SearchHistoryDao
    public int getCount(SearchHistoryEntity.SearchHistorySource searchHistorySource) {
        v i11 = v.i("SELECT COUNT(ID) FROM search_history_table WHERE source = ? ORDER BY ID DESC", 1);
        i11.Q0(1, __SearchHistorySource_enumToString(searchHistorySource));
        this.__db.assertNotSuspendingTransaction();
        Cursor c11 = j4.b.c(this.__db, i11, false, null);
        try {
            return c11.moveToFirst() ? c11.getInt(0) : 0;
        } finally {
            c11.close();
            i11.release();
        }
    }

    @Override // com.forsale.app.datalayer.repositories.SearchHistoryDao
    public SearchHistoryEntity getSingleBySearchText(String str, SearchHistoryEntity.SearchHistorySource searchHistorySource) {
        v i11 = v.i("SELECT * FROM search_history_table WHERE SEARCH_TEXT LIKE ? AND CATEGORY_ID IS null  AND SOURCE = ?", 2);
        if (str == null) {
            i11.u1(1);
        } else {
            i11.Q0(1, str);
        }
        if (searchHistorySource == null) {
            i11.u1(2);
        } else {
            i11.Q0(2, __SearchHistorySource_enumToString(searchHistorySource));
        }
        this.__db.assertNotSuspendingTransaction();
        SearchHistoryEntity searchHistoryEntity = null;
        Cursor c11 = j4.b.c(this.__db, i11, false, null);
        try {
            int e11 = j4.a.e(c11, "id");
            int e12 = j4.a.e(c11, "search_text");
            int e13 = j4.a.e(c11, "category_id");
            int e14 = j4.a.e(c11, "category_name");
            int e15 = j4.a.e(c11, "category");
            int e16 = j4.a.e(c11, "filters");
            int e17 = j4.a.e(c11, "source");
            if (c11.moveToFirst()) {
                searchHistoryEntity = new SearchHistoryEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13)), c11.isNull(e14) ? null : c11.getString(e14), this.__categoryConverters.toCategory(c11.isNull(e15) ? null : c11.getString(e15)), this.__filtrationDataConverters.toFiltrationData(c11.isNull(e16) ? null : c11.getString(e16)), c11.isNull(e17) ? null : __SearchHistorySource_stringToEnum(c11.getString(e17)));
            }
            return searchHistoryEntity;
        } finally {
            c11.close();
            i11.release();
        }
    }

    @Override // com.forsale.app.datalayer.repositories.SearchHistoryDao
    public SearchHistoryEntity getSingleBySearchTextAndId(String str, int i11, SearchHistoryEntity.SearchHistorySource searchHistorySource) {
        v i12 = v.i("SELECT * FROM search_history_table WHERE SEARCH_TEXT LIKE ? AND CATEGORY_ID = ? AND SOURCE = ?", 3);
        if (str == null) {
            i12.u1(1);
        } else {
            i12.Q0(1, str);
        }
        i12.d1(2, i11);
        if (searchHistorySource == null) {
            i12.u1(3);
        } else {
            i12.Q0(3, __SearchHistorySource_enumToString(searchHistorySource));
        }
        this.__db.assertNotSuspendingTransaction();
        SearchHistoryEntity searchHistoryEntity = null;
        Cursor c11 = j4.b.c(this.__db, i12, false, null);
        try {
            int e11 = j4.a.e(c11, "id");
            int e12 = j4.a.e(c11, "search_text");
            int e13 = j4.a.e(c11, "category_id");
            int e14 = j4.a.e(c11, "category_name");
            int e15 = j4.a.e(c11, "category");
            int e16 = j4.a.e(c11, "filters");
            int e17 = j4.a.e(c11, "source");
            if (c11.moveToFirst()) {
                searchHistoryEntity = new SearchHistoryEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : Integer.valueOf(c11.getInt(e13)), c11.isNull(e14) ? null : c11.getString(e14), this.__categoryConverters.toCategory(c11.isNull(e15) ? null : c11.getString(e15)), this.__filtrationDataConverters.toFiltrationData(c11.isNull(e16) ? null : c11.getString(e16)), c11.isNull(e17) ? null : __SearchHistorySource_stringToEnum(c11.getString(e17)));
            }
            return searchHistoryEntity;
        } finally {
            c11.close();
            i12.release();
        }
    }
}
