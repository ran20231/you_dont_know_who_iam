package com.forsale.app.features.categories.listings.category;

import com.forsale.app.utils.analytics.AmplitudeLogger;
import com.forsale.app.utils.analytics.AmplitudeScopes;
import g00.l;
import g00.q;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.w;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$isAnalyticsEnabled$1", f = "CategoryListingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$isAnalyticsEnabled$1 extends SuspendLambda implements q<Boolean, Boolean, zz.a<? super Object>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28509a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ boolean f28510b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ boolean f28511c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28512d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$isAnalyticsEnabled$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$isAnalyticsEnabled$1> aVar) {
        super(3, aVar);
        this.f28512d = categoryListingsViewModel;
    }

    public final Object b(boolean z11, boolean z12, zz.a<Object> aVar) {
        CategoryListingsViewModel$isAnalyticsEnabled$1 categoryListingsViewModel$isAnalyticsEnabled$1 = new CategoryListingsViewModel$isAnalyticsEnabled$1(this.f28512d, aVar);
        categoryListingsViewModel$isAnalyticsEnabled$1.f28510b = z11;
        categoryListingsViewModel$isAnalyticsEnabled$1.f28511c = z12;
        return categoryListingsViewModel$isAnalyticsEnabled$1.invokeSuspend(p.f75480a);
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, zz.a<? super Object> aVar) {
        return b(bool.booleanValue(), bool2.booleanValue(), aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AmplitudeLogger amplitudeLogger;
        boolean K;
        AmplitudeLogger amplitudeLogger2;
        List E0;
        List c02;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f28509a == 0) {
            kotlin.f.b(obj);
            boolean z11 = this.f28510b;
            boolean z12 = this.f28511c;
            if (!z11 || !z12) {
                amplitudeLogger = this.f28512d.f28389w0;
                K = w.K(amplitudeLogger.k(), new l<String, Boolean>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$isAnalyticsEnabled$1.2
                    @Override // g00.l
                    /* renamed from: b */
                    public final Boolean invoke(String it2) {
                        o.i(it2, "it");
                        return Boolean.valueOf(AmplitudeScopes.CATEGORY_LISTINGS.getEvents().contains(it2));
                    }
                });
                return kotlin.coroutines.jvm.internal.a.a(K);
            }
            amplitudeLogger2 = this.f28512d.f28389w0;
            List<String> k11 = amplitudeLogger2.k();
            E0 = CollectionsKt___CollectionsKt.E0(k11, AmplitudeScopes.CATEGORY_LISTINGS.getEvents());
            c02 = CollectionsKt___CollectionsKt.c0(E0);
            k11.clear();
            k11.addAll(c02);
            return k11;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
