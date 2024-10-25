package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesRepositories.kt */
@d(c = "com.forsale.app.datalayer.repositories.CategoriesRepositories", f = "CategoriesRepositories.kt", l = {68, 67}, m = "subCategoriesCount")
/* loaded from: classes2.dex */
public final class CategoriesRepositories$subCategoriesCount$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CategoriesRepositories this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesRepositories$subCategoriesCount$1(CategoriesRepositories categoriesRepositories, zz.a<? super CategoriesRepositories$subCategoriesCount$1> aVar) {
        super(aVar);
        this.this$0 = categoriesRepositories;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object subCategoriesCount;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        subCategoriesCount = this.this$0.subCategoriesCount(0, this);
        return subCategoriesCount;
    }
}
