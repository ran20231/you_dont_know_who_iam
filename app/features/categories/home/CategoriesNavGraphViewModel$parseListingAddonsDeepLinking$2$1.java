package com.forsale.app.features.categories.home;

import g00.p;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesNavGraphViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.CategoriesNavGraphViewModel$parseListingAddonsDeepLinking$2$1", f = "CategoriesNavGraphViewModel.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoriesNavGraphViewModel$parseListingAddonsDeepLinking$2$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23304a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoriesNavGraphViewModel f23305b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Integer f23306c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f23307d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesNavGraphViewModel$parseListingAddonsDeepLinking$2$1(CategoriesNavGraphViewModel categoriesNavGraphViewModel, Integer num, String str, a<? super CategoriesNavGraphViewModel$parseListingAddonsDeepLinking$2$1> aVar) {
        super(2, aVar);
        this.f23305b = categoriesNavGraphViewModel;
        this.f23306c = num;
        this.f23307d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new CategoriesNavGraphViewModel$parseListingAddonsDeepLinking$2$1(this.f23305b, this.f23306c, this.f23307d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f23304a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f23305b.f23288w0;
            Pair pair = new Pair(this.f23306c, com.forsale.app.features.categories.listingdetails.f.a(this.f23307d));
            this.f23304a = 1;
            if (mutableSharedFlow.emit(pair, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((CategoriesNavGraphViewModel$parseListingAddonsDeepLinking$2$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
