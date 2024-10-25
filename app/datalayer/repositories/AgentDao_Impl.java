package com.forsale.app.datalayer.repositories;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.room.h;
import androidx.room.i;
import androidx.room.v;
import com.forsale.app.datalayer.database.AgentEntity;
import com.forsale.app.datalayer.database.AgentLocationEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import l4.m;
/* loaded from: classes2.dex */
public final class AgentDao_Impl implements AgentDao {
    private final RoomDatabase __db;
    private final h<AgentEntity> __deletionAdapterOfAgentEntity;
    private final i<AgentEntity> __insertionAdapterOfAgentEntity;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllAgents;
    private final h<AgentEntity> __updateAdapterOfAgentEntity;

    public AgentDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfAgentEntity = new i<AgentEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.AgentDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `agents` (`id`,`name_ar`,`name_en`,`description_ar`,`description_en`,`phone`,`image`,`email`,`region_id`,`display_order`,`is_indexed`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.i
            public void bind(m mVar, AgentEntity agentEntity) {
                mVar.d1(1, agentEntity.getId());
                if (agentEntity.getNameAr() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, agentEntity.getNameAr());
                }
                if (agentEntity.getNameEn() == null) {
                    mVar.u1(3);
                } else {
                    mVar.Q0(3, agentEntity.getNameEn());
                }
                if (agentEntity.getDescriptionAr() == null) {
                    mVar.u1(4);
                } else {
                    mVar.Q0(4, agentEntity.getDescriptionAr());
                }
                if (agentEntity.getDescriptionEn() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, agentEntity.getDescriptionEn());
                }
                if (agentEntity.getPhone() == null) {
                    mVar.u1(6);
                } else {
                    mVar.Q0(6, agentEntity.getPhone());
                }
                if (agentEntity.getImage() == null) {
                    mVar.u1(7);
                } else {
                    mVar.Q0(7, agentEntity.getImage());
                }
                if (agentEntity.getEmail() == null) {
                    mVar.u1(8);
                } else {
                    mVar.Q0(8, agentEntity.getEmail());
                }
                mVar.d1(9, agentEntity.getRegionId());
                mVar.d1(10, agentEntity.getDisplayOrder());
                if (agentEntity.isIndexed() == null) {
                    mVar.u1(11);
                } else {
                    mVar.d1(11, agentEntity.isIndexed().intValue());
                }
            }
        };
        this.__deletionAdapterOfAgentEntity = new h<AgentEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.AgentDao_Impl.2
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "DELETE FROM `agents` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, AgentEntity agentEntity) {
                mVar.d1(1, agentEntity.getId());
            }
        };
        this.__updateAdapterOfAgentEntity = new h<AgentEntity>(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.AgentDao_Impl.3
            @Override // androidx.room.h, androidx.room.SharedSQLiteStatement
            protected String createQuery() {
                return "UPDATE OR REPLACE `agents` SET `id` = ?,`name_ar` = ?,`name_en` = ?,`description_ar` = ?,`description_en` = ?,`phone` = ?,`image` = ?,`email` = ?,`region_id` = ?,`display_order` = ?,`is_indexed` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.h
            public void bind(m mVar, AgentEntity agentEntity) {
                mVar.d1(1, agentEntity.getId());
                if (agentEntity.getNameAr() == null) {
                    mVar.u1(2);
                } else {
                    mVar.Q0(2, agentEntity.getNameAr());
                }
                if (agentEntity.getNameEn() == null) {
                    mVar.u1(3);
                } else {
                    mVar.Q0(3, agentEntity.getNameEn());
                }
                if (agentEntity.getDescriptionAr() == null) {
                    mVar.u1(4);
                } else {
                    mVar.Q0(4, agentEntity.getDescriptionAr());
                }
                if (agentEntity.getDescriptionEn() == null) {
                    mVar.u1(5);
                } else {
                    mVar.Q0(5, agentEntity.getDescriptionEn());
                }
                if (agentEntity.getPhone() == null) {
                    mVar.u1(6);
                } else {
                    mVar.Q0(6, agentEntity.getPhone());
                }
                if (agentEntity.getImage() == null) {
                    mVar.u1(7);
                } else {
                    mVar.Q0(7, agentEntity.getImage());
                }
                if (agentEntity.getEmail() == null) {
                    mVar.u1(8);
                } else {
                    mVar.Q0(8, agentEntity.getEmail());
                }
                mVar.d1(9, agentEntity.getRegionId());
                mVar.d1(10, agentEntity.getDisplayOrder());
                if (agentEntity.isIndexed() == null) {
                    mVar.u1(11);
                } else {
                    mVar.d1(11, agentEntity.isIndexed().intValue());
                }
                mVar.d1(12, agentEntity.getId());
            }
        };
        this.__preparedStmtOfDeleteAllAgents = new SharedSQLiteStatement(roomDatabase) { // from class: com.forsale.app.datalayer.repositories.AgentDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM agents";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    @Override // com.forsale.app.datalayer.repositories.AgentDao
    public Object deleteAgent(final AgentEntity agentEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.AgentDao_Impl.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                AgentDao_Impl.this.__db.beginTransaction();
                try {
                    AgentDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(AgentDao_Impl.this.__deletionAdapterOfAgentEntity.handle(agentEntity) + 0);
                } finally {
                    AgentDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.AgentDao
    public Object deleteAllAgents(final List<AgentEntity> list, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.AgentDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                AgentDao_Impl.this.__db.beginTransaction();
                try {
                    AgentDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(AgentDao_Impl.this.__deletionAdapterOfAgentEntity.handleMultiple(list) + 0);
                } finally {
                    AgentDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.AgentDao
    public LiveData<AgentEntity> getAgentById(int i11) {
        final v i12 = v.i("SELECT * FROM  agents WHERE id == ?", 1);
        i12.d1(1, i11);
        return this.__db.getInvalidationTracker().e(new String[]{AgentEntity.AGENTS_TABLE}, false, new Callable<AgentEntity>() { // from class: com.forsale.app.datalayer.repositories.AgentDao_Impl.11
            protected void finalize() {
                i12.release();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public AgentEntity call() throws Exception {
                AgentEntity agentEntity = null;
                Cursor c11 = j4.b.c(AgentDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "name_ar");
                    int e13 = j4.a.e(c11, "name_en");
                    int e14 = j4.a.e(c11, AgentEntity.DESCRIPTION_AR);
                    int e15 = j4.a.e(c11, AgentEntity.DESCRIPTION_EN);
                    int e16 = j4.a.e(c11, "phone");
                    int e17 = j4.a.e(c11, "image");
                    int e18 = j4.a.e(c11, "email");
                    int e19 = j4.a.e(c11, "region_id");
                    int e21 = j4.a.e(c11, "display_order");
                    int e22 = j4.a.e(c11, "is_indexed");
                    if (c11.moveToFirst()) {
                        agentEntity = new AgentEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : c11.getString(e13), c11.isNull(e14) ? null : c11.getString(e14), c11.isNull(e15) ? null : c11.getString(e15), c11.isNull(e16) ? null : c11.getString(e16), c11.isNull(e17) ? null : c11.getString(e17), c11.isNull(e18) ? null : c11.getString(e18), c11.getInt(e19), c11.getInt(e21), c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22)));
                    }
                    return agentEntity;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.AgentDao
    public LiveData<List<AgentEntity>> getAgentsByLocationId(int i11, int i12) {
        final v i13 = v.i("SELECT  agents.*  FROM agents  INNER JOIN agents_locations ON agents.id=agents_locations.agent_id  WHERE agents_locations.location_id ==?  AND agents.region_id == ? ", 2);
        i13.d1(1, i12);
        i13.d1(2, i11);
        return this.__db.getInvalidationTracker().e(new String[]{AgentEntity.AGENTS_TABLE, AgentLocationEntity.AGENTS_LOCATIONS_TABLE}, false, new Callable<List<AgentEntity>>() { // from class: com.forsale.app.datalayer.repositories.AgentDao_Impl.14
            protected void finalize() {
                i13.release();
            }

            @Override // java.util.concurrent.Callable
            public List<AgentEntity> call() throws Exception {
                Cursor c11 = j4.b.c(AgentDao_Impl.this.__db, i13, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "name_ar");
                    int e13 = j4.a.e(c11, "name_en");
                    int e14 = j4.a.e(c11, AgentEntity.DESCRIPTION_AR);
                    int e15 = j4.a.e(c11, AgentEntity.DESCRIPTION_EN);
                    int e16 = j4.a.e(c11, "phone");
                    int e17 = j4.a.e(c11, "image");
                    int e18 = j4.a.e(c11, "email");
                    int e19 = j4.a.e(c11, "region_id");
                    int e21 = j4.a.e(c11, "display_order");
                    int e22 = j4.a.e(c11, "is_indexed");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new AgentEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : c11.getString(e13), c11.isNull(e14) ? null : c11.getString(e14), c11.isNull(e15) ? null : c11.getString(e15), c11.isNull(e16) ? null : c11.getString(e16), c11.isNull(e17) ? null : c11.getString(e17), c11.isNull(e18) ? null : c11.getString(e18), c11.getInt(e19), c11.getInt(e21), c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22))));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.AgentDao
    public LiveData<List<AgentEntity>> getAllAgents(int i11) {
        final v i12 = v.i("SELECT * FROM  agents WHERE region_id == ?", 1);
        i12.d1(1, i11);
        return this.__db.getInvalidationTracker().e(new String[]{AgentEntity.AGENTS_TABLE}, false, new Callable<List<AgentEntity>>() { // from class: com.forsale.app.datalayer.repositories.AgentDao_Impl.12
            protected void finalize() {
                i12.release();
            }

            @Override // java.util.concurrent.Callable
            public List<AgentEntity> call() throws Exception {
                Cursor c11 = j4.b.c(AgentDao_Impl.this.__db, i12, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "name_ar");
                    int e13 = j4.a.e(c11, "name_en");
                    int e14 = j4.a.e(c11, AgentEntity.DESCRIPTION_AR);
                    int e15 = j4.a.e(c11, AgentEntity.DESCRIPTION_EN);
                    int e16 = j4.a.e(c11, "phone");
                    int e17 = j4.a.e(c11, "image");
                    int e18 = j4.a.e(c11, "email");
                    int e19 = j4.a.e(c11, "region_id");
                    int e21 = j4.a.e(c11, "display_order");
                    int e22 = j4.a.e(c11, "is_indexed");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new AgentEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : c11.getString(e13), c11.isNull(e14) ? null : c11.getString(e14), c11.isNull(e15) ? null : c11.getString(e15), c11.isNull(e16) ? null : c11.getString(e16), c11.isNull(e17) ? null : c11.getString(e17), c11.isNull(e18) ? null : c11.getString(e18), c11.getInt(e19), c11.getInt(e21), c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22))));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                }
            }
        });
    }

    @Override // com.forsale.app.datalayer.repositories.AgentDao
    public Object getAllAgentsSuspend(zz.a<? super List<AgentEntity>> aVar) {
        final v i11 = v.i("SELECT * FROM  agents", 0);
        return CoroutinesRoom.b(this.__db, false, j4.b.a(), new Callable<List<AgentEntity>>() { // from class: com.forsale.app.datalayer.repositories.AgentDao_Impl.13
            @Override // java.util.concurrent.Callable
            public List<AgentEntity> call() throws Exception {
                Cursor c11 = j4.b.c(AgentDao_Impl.this.__db, i11, false, null);
                try {
                    int e11 = j4.a.e(c11, "id");
                    int e12 = j4.a.e(c11, "name_ar");
                    int e13 = j4.a.e(c11, "name_en");
                    int e14 = j4.a.e(c11, AgentEntity.DESCRIPTION_AR);
                    int e15 = j4.a.e(c11, AgentEntity.DESCRIPTION_EN);
                    int e16 = j4.a.e(c11, "phone");
                    int e17 = j4.a.e(c11, "image");
                    int e18 = j4.a.e(c11, "email");
                    int e19 = j4.a.e(c11, "region_id");
                    int e21 = j4.a.e(c11, "display_order");
                    int e22 = j4.a.e(c11, "is_indexed");
                    ArrayList arrayList = new ArrayList(c11.getCount());
                    while (c11.moveToNext()) {
                        arrayList.add(new AgentEntity(c11.getInt(e11), c11.isNull(e12) ? null : c11.getString(e12), c11.isNull(e13) ? null : c11.getString(e13), c11.isNull(e14) ? null : c11.getString(e14), c11.isNull(e15) ? null : c11.getString(e15), c11.isNull(e16) ? null : c11.getString(e16), c11.isNull(e17) ? null : c11.getString(e17), c11.isNull(e18) ? null : c11.getString(e18), c11.getInt(e19), c11.getInt(e21), c11.isNull(e22) ? null : Integer.valueOf(c11.getInt(e22))));
                    }
                    return arrayList;
                } finally {
                    c11.close();
                    i11.release();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.AgentDao
    public Object insertAgent(final AgentEntity agentEntity, zz.a<? super Long> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Long>() { // from class: com.forsale.app.datalayer.repositories.AgentDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() throws Exception {
                AgentDao_Impl.this.__db.beginTransaction();
                try {
                    Long valueOf = Long.valueOf(AgentDao_Impl.this.__insertionAdapterOfAgentEntity.insertAndReturnId(agentEntity));
                    AgentDao_Impl.this.__db.setTransactionSuccessful();
                    return valueOf;
                } finally {
                    AgentDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.AgentDao
    public Object insertAllAgents(final List<AgentEntity> list, zz.a<? super List<Long>> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<List<Long>>() { // from class: com.forsale.app.datalayer.repositories.AgentDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<Long> call() throws Exception {
                AgentDao_Impl.this.__db.beginTransaction();
                try {
                    List<Long> insertAndReturnIdsList = AgentDao_Impl.this.__insertionAdapterOfAgentEntity.insertAndReturnIdsList(list);
                    AgentDao_Impl.this.__db.setTransactionSuccessful();
                    return insertAndReturnIdsList;
                } finally {
                    AgentDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.AgentDao
    public Object updateAgent(final AgentEntity agentEntity, zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.AgentDao_Impl.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                AgentDao_Impl.this.__db.beginTransaction();
                try {
                    AgentDao_Impl.this.__db.setTransactionSuccessful();
                    return Integer.valueOf(AgentDao_Impl.this.__updateAdapterOfAgentEntity.handle(agentEntity) + 0);
                } finally {
                    AgentDao_Impl.this.__db.endTransaction();
                }
            }
        }, aVar);
    }

    @Override // com.forsale.app.datalayer.repositories.AgentDao
    public Object deleteAllAgents(zz.a<? super Integer> aVar) {
        return CoroutinesRoom.c(this.__db, true, new Callable<Integer>() { // from class: com.forsale.app.datalayer.repositories.AgentDao_Impl.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                m acquire = AgentDao_Impl.this.__preparedStmtOfDeleteAllAgents.acquire();
                try {
                    AgentDao_Impl.this.__db.beginTransaction();
                    Integer valueOf = Integer.valueOf(acquire.O());
                    AgentDao_Impl.this.__db.setTransactionSuccessful();
                    AgentDao_Impl.this.__db.endTransaction();
                    return valueOf;
                } finally {
                    AgentDao_Impl.this.__preparedStmtOfDeleteAllAgents.release(acquire);
                }
            }
        }, aVar);
    }
}
