package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.DirectoryCategoryEntity;
import java.util.List;
/* compiled from: DirectoryCategoryDao.kt */
/* loaded from: classes2.dex */
public interface DirectoryCategoryDao {
    Object deleteAllDirectoryCategories(List<DirectoryCategoryEntity> list, zz.a<? super Integer> aVar);

    Object deleteAllDirectoryCategories(zz.a<? super Integer> aVar);

    Object deleteDirectoryCategory(DirectoryCategoryEntity directoryCategoryEntity, zz.a<? super Integer> aVar);

    LiveData<List<DirectoryCategoryEntity>> getAllDirectoryCategories();

    Object getAllDirectoryCategoriesSuspend(zz.a<? super List<DirectoryCategoryEntity>> aVar);

    LiveData<List<DirectoryCategoryEntity>> getDirectoryCategoriesByParentId(int i11);

    Object getDirectoryCategoryById(int i11, zz.a<? super DirectoryCategoryEntity> aVar);

    Object insertAllDirectoryCategories(List<DirectoryCategoryEntity> list, zz.a<? super List<Long>> aVar);

    Object insertDirectoryCategory(DirectoryCategoryEntity directoryCategoryEntity, zz.a<? super Long> aVar);

    Object updateDirectoryCategory(DirectoryCategoryEntity directoryCategoryEntity, zz.a<? super Integer> aVar);
}
