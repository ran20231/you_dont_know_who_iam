package com.forsale.app.datalayer.repositories;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesRepositories.kt */
@d(c = "com.forsale.app.datalayer.repositories.CategoriesRepositories", f = "CategoriesRepositories.kt", l = {FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS, FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS}, m = "getAllCategories")
/* loaded from: classes2.dex */
public final class CategoriesRepositories$getAllCategories$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CategoriesRepositories this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesRepositories$getAllCategories$1(CategoriesRepositories categoriesRepositories, zz.a<? super CategoriesRepositories$getAllCategories$1> aVar) {
        super(aVar);
        this.this$0 = categoriesRepositories;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAllCategories(this);
    }
}
