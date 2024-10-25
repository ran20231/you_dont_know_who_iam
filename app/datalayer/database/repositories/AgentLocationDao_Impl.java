package com.forsale.app.datalayer.database.repositories;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.AgentLocationEntity;
import com.forsale.app.datalayer.database.LocationEntity;
import j4.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import l4.m;
import zz.a;
/* loaded from: classes2.dex */
public final class AgentLocationDao_Impl implements AgentLocationDao {
    private final RoomDatabase __db;
    private final h<AgentLocationEntity> __deletionAdapterOfAgentLocationEntity;
    private final i<AgentLocationEntity> __insertionAdapterOfAgentLocationEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllAgentLocations;
    private final h<AgentLocationEntity> __updateAdapterOfAgentLocationEntity;

    public AgentLocationDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfAgentLocationEntity = new i<AgentLocationEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.database.repositories.AgentLocationDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `agents_locations` (`id`,`agent_id`,`location_id`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, AgentLocationEntity agentLocationEntity) {
                mVar.d1(1, agentLocationEntity.getId());
                mVar.d1(2, agentLocationEntity.getAgentId());
                mVar.d1(3, agentLocationEntity.getLocationId());
            }
        };
        this.__deletionAdapterOfAgentLocationEntity = new h<AgentLocationEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.database.repositories.AgentLocationDao_Impl.2
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `agents_locations` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, AgentLocationEntity agentLocationEntity) {
                mVar.d1(1, agentLocationEntity.getId());
            }
        };
        this.__updateAdapterOfAgentLocationEntity = new h<AgentLocationEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.database.repositories.AgentLocationDao_Impl.3
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR REPLACE `agents_locations` SET `id` = ?,`agent_id` = ?,`location_id` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, AgentLocationEntity agentLocationEntity) {
                mVar.d1(1, agentLocationEntity.getId());
                mVar.d1(2, agentLocationEntity.getAgentId());
                mVar.d1(3, agentLocationEntity.getLocationId());
                mVar.d1(4, agentLocationEntity.getId());
            }
        };
        this.__preparedStmtOfDeleteAllAgentLocations = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.database.repositories.AgentLocationDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM agents_locations";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.database.repositories.AgentLocationDao
    public Object deleteAgentLocation(final AgentLocationEntity agentLocationEntity, a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.database.repositories.AgentLocationDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                AgentLocationDao_Impl.this.__db.beginTransaction();
                try {
                    AgentLocationDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(AgentLocationDao_Impl.this.__deletionAdapterOfAgentLocationEntity.handle(agentLocationEntity) + 0);
                } finally {
                    AgentLocationDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.database.repositories.AgentLocationDao
    public Object deleteAllAgentLocations(final List<AgentLocationEntity> list, a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.database.repositories.AgentLocationDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                AgentLocationDao_Impl.this.__db.beginTransaction();
                try {
                    AgentLocationDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(AgentLocationDao_Impl.this.__deletionAdapterOfAgentLocationEntity.handleMultiple(list) + 0);
                } finally {
                    AgentLocationDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.database.repositories.AgentLocationDao
    public LiveData<AgentLocationEntity> getAgentLocationById(int i11) {
        final v i12 = v.i("SELECT * FROM  agents_locations WHERE id == ?", 1);
        i12.d1(1, i11);
        return this.__db.getInvalidationTracker().e(new String[]{AgentLocationEntity.AGENTS_LOCATIONS_TABLE}, false, new Callable<AgentLocationEntity>() { // from class: com.forsale.app.datalayer.database.repositories.AgentLocationDao_Impl.11
            protected void finalize() {
                i12.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public AgentLocationEntity call() throws Exception {
                Cursor c11 = b.c(AgentLocationDao_Impl.this.__db, i12, false, null);
                try {
                    return c11.moveToFirst() ? new AgentLocationEntity(c11.getInt(j4.a.e(c11, "id")), c11.getInt(j4.a.e(c11, AgentLocationEntity.AGENT_ID)), c11.getInt(j4.a.e(c11, AgentLocationEntity.LOCATION_ID))) : null;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.database.repositories.AgentLocationDao
    public LiveData<List<AgentLocationEntity>> getAllAgentLocations() {
        final v i11 = v.i("SELECT * FROM  agents_locations", 0);
        return this.__db.getInvalidationTracker().e(new String[]{AgentLocationEntity.AGENTS_LOCATIONS_TABLE}, false, new Callable<List<AgentLocationEntity>>() { // from class: com.forsale.app.datalayer.database.repositories.AgentLocationDao_Impl.12
            protected void finalize() {
                i11.release();
            }

            @Override // java.util.concurrent.Callable
            public List<AgentLocationEntity> call() throws Exception {
                Cursor c11 = b.c(AgentLocationDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, AgentLocationEntity.AGENT_ID);
                    int e13 = j4.a.e(c11, AgentLocationEntity.LOCATION_ID);
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new AgentLocationEntity(c11.getInt(e11), c11.getInt(e12), c11.getInt(e13)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.database.repositories.AgentLocationDao
    public Object getAllAgentLocationsSuspend(a<? super List<AgentLocationEntity>> aVar) {
        final v i11 = v.i("SELECT * FROM  agents_locations", 0);
        return CoroutinesRoom.b(this.__db, false, b.a(), new Callable<List<AgentLocationEntity>>() { // from class: com.forsale.app.datalayer.database.repositories.AgentLocationDao_Impl.13
            @Override // java.util.concurrent.Callable
            public List<AgentLocationEntity> call() throws Exception {
                Cursor c11 = b.c(AgentLocationDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, AgentLocationEntity.AGENT_ID);
                    int e13 = j4.a.e(c11, AgentLocationEntity.LOCATION_ID);
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new AgentLocationEntity(c11.getInt(e11), c11.getInt(e12), c11.getInt(e13)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.database.repositories.AgentLocationDao
    public LiveData<List<LocationEntity>> getLocationsByAgentId(int i11) {
        final v i12 = v.i("SELECT locations.* FROM locations INNER JOIN agents_locations on agents_locations.location_id=locations.id WHERE agents_locations.agent_id ==? ", 1);
        i12.d1(1, i11);
        return this.__db.getInvalidationTracker().e(new String[]{LocationEntity.LOCATIONS_TABLE, AgentLocationEntity.AGENTS_LOCATIONS_TABLE}, false, new Callable<List<LocationEntity>>() { // from class: com.forsale.app.datalayer.database.repositories.AgentLocationDao_Impl.14
            protected void finalize() {
                i12.release();
            }

            @Override // java.util.concurrent.Callable
            public List<LocationEntity> call() throws Exception {
                Cursor c11 = b.c(AgentLocationDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "name_ar");
                    int e13 = j4.a.e(c11, "name_en");
                    int e14 = j4.a.e(c11, "region_id");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new LocationEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : c11.getString(e13), c11.getInt(e14)));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.database.repositories.AgentLocationDao
    public Object insertAgentLocation(final AgentLocationEntity agentLocationEntity, a<? super Long> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Long>() { // from class: com.forsale.app.datalayer.database.repositories.AgentLocationDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                AgentLocationDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(AgentLocationDao_Impl.this.__insertionAdapterOfAgentLocationEntity.insertAndReturnId(agentLocationEntity));
                    AgentLocationDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    AgentLocationDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.database.repositories.AgentLocationDao
    public Object insertAllAgentLocations(final List<AgentLocationEntity> list, a<? super List<Long>> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<List<Long>>() { // from class: com.forsale.app.datalayer.database.repositories.AgentLocationDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                AgentLocationDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = AgentLocationDao_Impl.this.__insertionAdapterOfAgentLocationEntity.insertAndReturnIdsList(list);
                    AgentLocationDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    AgentLocationDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.database.repositories.AgentLocationDao
    public Object updateAgentLocation(final AgentLocationEntity agentLocationEntity, a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.database.repositories.AgentLocationDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                AgentLocationDao_Impl.this.__db.beginTransaction();
                try {
                    AgentLocationDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(AgentLocationDao_Impl.this.__updateAdapterOfAgentLocationEntity.handle(agentLocationEntity) + 0);
                } finally {
                    AgentLocationDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.database.repositories.AgentLocationDao
    public Object deleteAllAgentLocations(a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.database.repositories.AgentLocationDao_Impl.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = AgentLocationDao_Impl.this.__preparedStmtOfDeleteAllAgentLocations.acquire();
                try {
                    AgentLocationDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    AgentLocationDao_Impl.this.__db.setTransactionSuccessful();
                    AgentLocationDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    AgentLocationDao_Impl.this.__preparedStmtOfDeleteAllAgentLocations.release(acquire);
                }
            }
        }, aVar);
    }
}
