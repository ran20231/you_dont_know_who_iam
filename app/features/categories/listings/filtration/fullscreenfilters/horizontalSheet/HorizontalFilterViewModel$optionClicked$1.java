package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import dc.c;
import g00.p;
import j0.k0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HorizontalFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel$optionClicked$1", f = "HorizontalFilterViewModel.kt", l = {104, FacebookMediationAdapter.ERROR_NULL_CONTEXT}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class HorizontalFilterViewModel$optionClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29693a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HorizontalFilterViewModel f29694b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f29695c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalFilterViewModel$optionClicked$1(HorizontalFilterViewModel horizontalFilterViewModel, c cVar, zz.a<? super HorizontalFilterViewModel$optionClicked$1> aVar) {
        super(2, aVar);
        this.f29694b = horizontalFilterViewModel;
        this.f29695c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new HorizontalFilterViewModel$optionClicked$1(this.f29694b, this.f29695c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        List<Integer> a12;
        c cVar;
        List<Integer> e11;
        k0<Boolean> l11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f29693a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            if (this.f29694b.L0()) {
                if (this.f29695c.l().getValue().booleanValue()) {
                    return wz.p.f75480a;
                }
                Iterator<c> it2 = this.f29694b.D0().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        cVar = it2.next();
                        if (cVar.l().getValue().booleanValue()) {
                            break;
                        }
                    } else {
                        cVar = null;
                        break;
                    }
                }
                c cVar2 = cVar;
                if (cVar2 != null && (l11 = cVar2.l()) != null) {
                    l11.setValue(kotlin.coroutines.jvm.internal.a.a(false));
                }
                this.f29695c.l().setValue(kotlin.coroutines.jvm.internal.a.a(true));
                MutableStateFlow<List<Integer>> H0 = this.f29694b.H0();
                e11 = q.e(kotlin.coroutines.jvm.internal.a.d(this.f29695c.e()));
                this.f29693a = 1;
                if (H0.emit(e11, this) == f11) {
                    return f11;
                }
            } else {
                this.f29695c.l().setValue(kotlin.coroutines.jvm.internal.a.a(!this.f29695c.l().getValue().booleanValue()));
                MutableStateFlow<List<Integer>> H02 = this.f29694b.H0();
                a12 = CollectionsKt___CollectionsKt.a1(this.f29694b.H0().getValue());
                c cVar3 = this.f29695c;
                if (cVar3.l().getValue().booleanValue()) {
                    a12.add(kotlin.coroutines.jvm.internal.a.d(cVar3.e()));
                } else {
                    a12.remove(kotlin.coroutines.jvm.internal.a.d(cVar3.e()));
                }
                this.f29693a = 2;
                if (H02.emit(a12, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((HorizontalFilterViewModel$optionClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
