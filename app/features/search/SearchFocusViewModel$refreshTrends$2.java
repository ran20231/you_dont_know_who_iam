package com.forsale.app.features.search;

import com.forsale.app.datalayer.network.errorhandling.ErrorCodes;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchFocusViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusViewModel$refreshTrends$2", f = "SearchFocusViewModel.kt", l = {ErrorCodes.BLOCKED_USER_ERROR_CODE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchFocusViewModel$refreshTrends$2 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36794a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchFocusViewModel f36795b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFocusViewModel$refreshTrends$2(SearchFocusViewModel searchFocusViewModel, zz.a<? super SearchFocusViewModel$refreshTrends$2> aVar) {
        super(2, aVar);
        this.f36795b = searchFocusViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchFocusViewModel$refreshTrends$2(this.f36795b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        h0 h0Var;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36794a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            h0Var = this.f36795b.f36707r0;
            this.f36794a = 1;
            if (h0Var.a(this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchFocusViewModel$refreshTrends$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
