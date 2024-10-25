package com.forsale.app.domainlayer.interactors.categoriesinteractors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetHomeSectionsInteractor.kt */
@d(c = "com.forsale.app.domainlayer.interactors.categoriesinteractors.GetHomeSectionsInteractor", f = "GetHomeSectionsInteractor.kt", l = {100}, m = "updateCategoryData")
/* loaded from: classes2.dex */
public final class GetHomeSectionsInteractor$updateCategoryData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f22434a;

    /* renamed from: b  reason: collision with root package name */
    Object f22435b;

    /* renamed from: c  reason: collision with root package name */
    Object f22436c;

    /* renamed from: d  reason: collision with root package name */
    Object f22437d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f22438e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ GetHomeSectionsInteractor f22439f;

    /* renamed from: g  reason: collision with root package name */
    int f22440g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHomeSectionsInteractor$updateCategoryData$1(GetHomeSectionsInteractor getHomeSectionsInteractor, zz.a<? super GetHomeSectionsInteractor$updateCategoryData$1> aVar) {
        super(aVar);
        this.f22439f = getHomeSectionsInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object n11;
        this.f22438e = obj;
        this.f22440g |= Integer.MIN_VALUE;
        n11 = this.f22439f.n(null, this);
        return n11;
    }
}
