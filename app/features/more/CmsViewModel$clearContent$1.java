package com.forsale.app.features.more;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CmsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.CmsViewModel$clearContent$1", f = "CmsViewModel.kt", l = {160}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CmsViewModel$clearContent$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31583a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CmsViewModel f31584b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CmsViewModel$clearContent$1(CmsViewModel cmsViewModel, zz.a<? super CmsViewModel$clearContent$1> aVar) {
        super(2, aVar);
        this.f31584b = cmsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CmsViewModel$clearContent$1(this.f31584b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31583a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableStateFlow = this.f31584b.f31569p0;
            this.f31583a = 1;
            if (mutableStateFlow.emit(null, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CmsViewModel$clearContent$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
