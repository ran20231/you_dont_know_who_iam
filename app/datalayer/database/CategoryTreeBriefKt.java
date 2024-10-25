package com.forsale.app.datalayer.database;

import cb.a;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import kotlin.jvm.internal.o;
/* compiled from: CategoryTreeBrief.kt */
/* loaded from: classes2.dex */
public final class CategoryTreeBriefKt {
    public static final a toCategoryBreadCrumbs(CategoryTreeBrief categoryTreeBrief, CategoryEntity parentCategory) {
        o.i(categoryTreeBrief, "<this>");
        o.i(parentCategory, "parentCategory");
        return new a(parentCategory, categoryTreeBrief.getCategoryName(categoryTreeBrief.getCategoryNamesList()), new GetListingsBody.FiltrationData(categoryTreeBrief.getFilter(categoryTreeBrief.getCategoryListReversedIds(), 2), categoryTreeBrief.getFilter(categoryTreeBrief.getCategoryListReversedIds(), 3), null, null, null, 28, null));
    }
}
