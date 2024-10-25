package com.forsale.app.ui.recyclerviewitems.sectionfooteritem;

import com.google.android.gms.common.ConnectionResult;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SectionFooterItemViewModel.kt */
@d(c = "com.forsale.app.ui.recyclerviewitems.sectionfooteritem.SectionFooterItemViewModel$toggleView$1", f = "SectionFooterItemViewModel.kt", l = {ConnectionResult.API_DISABLED}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SectionFooterItemViewModel$toggleView$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39505a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SectionFooterItemViewModel f39506b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionFooterItemViewModel$toggleView$1(SectionFooterItemViewModel sectionFooterItemViewModel, a<? super SectionFooterItemViewModel$toggleView$1> aVar) {
        super(2, aVar);
        this.f39506b = sectionFooterItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SectionFooterItemViewModel$toggleView$1(this.f39506b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = b.f();
        int i11 = this.f39505a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableStateFlow = this.f39506b.f39502e;
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(!this.f39506b.d());
            this.f39505a = 1;
            if (mutableStateFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SectionFooterItemViewModel$toggleView$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
