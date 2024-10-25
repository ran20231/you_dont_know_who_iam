package com.forsale.app.features.search;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.CategoryTreeInteractor;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MatchingCategoriesRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.MatchingCategoriesRepository$handleMatchingCategoriesClicked$categoryBreadCrumbs$1", f = "MatchingCategoriesRepository.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MatchingCategoriesRepository$handleMatchingCategoriesClicked$categoryBreadCrumbs$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super cb.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36611a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MatchingCategoriesRepository f36612b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoryEntity f36613c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchingCategoriesRepository$handleMatchingCategoriesClicked$categoryBreadCrumbs$1(MatchingCategoriesRepository matchingCategoriesRepository, CategoryEntity categoryEntity, zz.a<? super MatchingCategoriesRepository$handleMatchingCategoriesClicked$categoryBreadCrumbs$1> aVar) {
        super(2, aVar);
        this.f36612b = matchingCategoriesRepository;
        this.f36613c = categoryEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MatchingCategoriesRepository$handleMatchingCategoriesClicked$categoryBreadCrumbs$1(this.f36612b, this.f36613c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoryTreeInteractor categoryTreeInteractor;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36611a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            categoryTreeInteractor = this.f36612b.f36597b;
            int id2 = this.f36613c.getId();
            this.f36611a = 1;
            obj = categoryTreeInteractor.a(id2, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super cb.a> aVar) {
        return ((MatchingCategoriesRepository$handleMatchingCategoriesClicked$categoryBreadCrumbs$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
