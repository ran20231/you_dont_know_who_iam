package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.forsale.app.datalayer.network.entities.ExtraAttr;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
/* compiled from: ExtraAttributesRepository.kt */
/* loaded from: classes2.dex */
public final class ExtraAttributesRepository {
    public static final int $stable = 8;
    private final ExtraAttributeDao extraAttributeDao;

    public ExtraAttributesRepository(ExtraAttributeDao extraAttributeDao) {
        o.i(extraAttributeDao, "extraAttributeDao");
        this.extraAttributeDao = extraAttributeDao;
    }

    private final List<Integer> getAttributeIdsAndPurify(List<ListingItemBrief> list) {
        int y11;
        List<ListingItemBrief> list2 = list;
        y11 = s.y(list2, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (ListingItemBrief listingItemBrief : list2) {
            List<ExtraAttr> extraAttrs = listingItemBrief.getExtraAttrs();
            if (extraAttrs == null) {
                extraAttrs = r.n();
            }
            arrayList.add(extraAttrs);
        }
        return purifyAttributeIds(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAttributesByIdList(List<Integer> list, zz.a<? super List<ExtraAttributeEntity>> aVar) {
        return this.extraAttributeDao.getExtraAttributeByIds(list, aVar);
    }

    public final Object getAttributesByIdListSuspend(List<Integer> list, zz.a<? super List<ExtraAttributeEntity>> aVar) {
        return this.extraAttributeDao.getExtraAttributeByIds(list, aVar);
    }

    public final Object getAttributesFormItemList(List<ListingItemBrief> list, zz.a<? super List<ExtraAttributeEntity>> aVar) {
        return getAttributesByIdList(getAttributeIdsAndPurify(list), aVar);
    }

    public final Object getExtraAttributeById(int i11, zz.a<? super LiveData<ExtraAttributeEntity>> aVar) {
        return this.extraAttributeDao.getExtraAttributeById(i11);
    }

    public final List<Integer> purifyAttributeIds(List<? extends List<ExtraAttr>> extraAttrs) {
        List A;
        int y11;
        List<Integer> c02;
        o.i(extraAttrs, "extraAttrs");
        A = s.A(extraAttrs);
        List<ExtraAttr> list = A;
        y11 = s.y(list, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (ExtraAttr extraAttr : list) {
            arrayList.add(Integer.valueOf(extraAttr.getId()));
        }
        c02 = CollectionsKt___CollectionsKt.c0(arrayList);
        return c02;
    }
}
