package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet;

import com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel;
import com.forsale.app.utils.analytics.listingfiltration.a;
import dc.c;
import fc.c;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HorizontalFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel$applyFilters$1", f = "HorizontalFilterViewModel.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class HorizontalFilterViewModel$applyFilters$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29691a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HorizontalFilterViewModel f29692b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalFilterViewModel$applyFilters$1(HorizontalFilterViewModel horizontalFilterViewModel, zz.a<? super HorizontalFilterViewModel$applyFilters$1> aVar) {
        super(2, aVar);
        this.f29692b = horizontalFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new HorizontalFilterViewModel$applyFilters$1(this.f29692b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        boolean K0;
        List A0;
        List list;
        boolean z11;
        a.d N0;
        List G0;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f29691a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            K0 = this.f29692b.K0();
            if (K0) {
                list = r.n();
            } else {
                A0 = this.f29692b.A0();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : A0) {
                    if (((c) obj2).e() == -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        arrayList.add(obj2);
                    }
                }
                list = arrayList;
            }
            N0 = this.f29692b.N0(list);
            MutableSharedFlow<HorizontalFilterViewModel.a> B0 = this.f29692b.B0();
            G0 = this.f29692b.G0(list);
            HorizontalFilterViewModel.a.C0329a c0329a = new HorizontalFilterViewModel.a.C0329a(new c.a(G0, N0));
            this.f29691a = 1;
            if (B0.emit(c0329a, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((HorizontalFilterViewModel$applyFilters$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
