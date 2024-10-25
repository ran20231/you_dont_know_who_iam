package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesRepositories.kt */
@d(c = "com.forsale.app.datalayer.repositories.CategoriesRepositories", f = "CategoriesRepositories.kt", l = {91}, m = "getCategorySystemName")
/* loaded from: classes2.dex */
public final class CategoriesRepositories$getCategorySystemName$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CategoriesRepositories this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesRepositories$getCategorySystemName$1(CategoriesRepositories categoriesRepositories, zz.a<? super CategoriesRepositories$getCategorySystemName$1> aVar) {
        super(aVar);
        this.this$0 = categoriesRepositories;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getCategorySystemName(0, this);
    }
}
