package com.forsale.app.features.categories.listings.category;

import com.forsale.app.utils.analytics.AmplitudeLogger;
import com.forsale.app.utils.analytics.AmplitudeScopes;
import g00.l;
import g00.p;
import kotlin.collections.w;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$trackListingScreenOpened$1", f = "CategoryListingsViewModel.kt", l = {922}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$trackListingScreenOpened$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28620a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28621b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f28622c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$trackListingScreenOpened$1(CategoryListingsViewModel categoryListingsViewModel, boolean z11, zz.a<? super CategoryListingsViewModel$trackListingScreenOpened$1> aVar) {
        super(2, aVar);
        this.f28621b = categoryListingsViewModel;
        this.f28622c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$trackListingScreenOpened$1(this.f28621b, this.f28622c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        AmplitudeLogger amplitudeLogger;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28620a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f28621b.X1;
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(this.f28622c);
            this.f28620a = 1;
            if (mutableStateFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        if (!this.f28622c) {
            amplitudeLogger = this.f28621b.f28389w0;
            w.K(amplitudeLogger.k(), new l<String, Boolean>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$trackListingScreenOpened$1.1
                @Override // g00.l
                /* renamed from: b */
                public final Boolean invoke(String it2) {
                    o.i(it2, "it");
                    return Boolean.valueOf(AmplitudeScopes.CATEGORY_LISTINGS.getEvents().contains(it2));
                }
            });
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$trackListingScreenOpened$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
