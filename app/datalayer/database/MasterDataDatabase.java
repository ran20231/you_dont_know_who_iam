package com.forsale.app.datalayer.database;

import androidx.room.RoomDatabase;
import com.forsale.app.datalayer.database.repositories.AgentLocationDao;
import com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao;
import com.forsale.app.datalayer.repositories.AgentDao;
import com.forsale.app.datalayer.repositories.CategoryDao;
import com.forsale.app.datalayer.repositories.CategoryDistrictDao;
import com.forsale.app.datalayer.repositories.CategoryWithSubCategoriesDao;
import com.forsale.app.datalayer.repositories.DirectoryCategoryDao;
import com.forsale.app.datalayer.repositories.DistrictDao;
import com.forsale.app.datalayer.repositories.ExtraAttributeDao;
import com.forsale.app.datalayer.repositories.ExtraAttributeGroupDao;
import com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawDao;
import com.forsale.app.datalayer.repositories.LocationDao;
import com.forsale.app.datalayer.repositories.ProhibitedKeywordDao;
import com.forsale.app.datalayer.repositories.RegionDao;
/* compiled from: MasterDataDatabase.kt */
/* loaded from: classes2.dex */
public abstract class MasterDataDatabase extends RoomDatabase {
    public static final int $stable = 0;

    public abstract AgentDao agentDao();

    public abstract AgentLocationDao agentLocationDao();

    public abstract CategoryDao categoryDao();

    public abstract CategoryDistrictDao categoryDistrictDao();

    public abstract CategoryExtraAttributeDao categoryExtraAttributeDao();

    public abstract CategoryWithSubCategoriesDao categoryWithSubCategoriesDao();

    public abstract DirectoryCategoryDao directoryCategoryDao();

    public abstract DistrictDao districtDao();

    public abstract ExtraAttributeDao extraAttributeDao();

    public abstract ExtraAttributeGroupDao extraAttributeGroupDao();

    public abstract ExtraAttributeOptionDao extraAttributeOptionDao();

    public abstract ExtraAttributeRawDao extraAttributeRawDao();

    public abstract LocationDao locationDao();

    public abstract ProhibitedKeywordDao prohibitedKeywordDao();

    public abstract RegionDao regionDao();
}
