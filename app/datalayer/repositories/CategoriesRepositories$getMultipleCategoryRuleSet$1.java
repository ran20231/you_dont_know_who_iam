package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesRepositories.kt */
@d(c = "com.forsale.app.datalayer.repositories.CategoriesRepositories", f = "CategoriesRepositories.kt", l = {158}, m = "getMultipleCategoryRuleSet")
/* loaded from: classes2.dex */
public final class CategoriesRepositories$getMultipleCategoryRuleSet$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CategoriesRepositories this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesRepositories$getMultipleCategoryRuleSet$1(CategoriesRepositories categoriesRepositories, zz.a<? super CategoriesRepositories$getMultipleCategoryRuleSet$1> aVar) {
        super(aVar);
        this.this$0 = categoriesRepositories;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object multipleCategoryRuleSet;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        multipleCategoryRuleSet = this.this$0.getMultipleCategoryRuleSet(null, this);
        return multipleCategoryRuleSet;
    }
}
