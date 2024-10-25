package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet;

import com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel;
import com.forsale.app.utils.analytics.listingfiltration.a;
import dc.c;
import falcon.chat.entities.Constants;
import fc.c;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.text.s;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SelectableFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel$applyFilters$1", f = "SelectableFilterViewModel.kt", l = {Constants.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION, 153}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SelectableFilterViewModel$applyFilters$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30053a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SelectableFilterViewModel f30054b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableFilterViewModel$applyFilters$1(SelectableFilterViewModel selectableFilterViewModel, zz.a<? super SelectableFilterViewModel$applyFilters$1> aVar) {
        super(2, aVar);
        this.f30054b = selectableFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SelectableFilterViewModel$applyFilters$1(this.f30054b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        boolean R0;
        List A0;
        List list;
        boolean z11;
        boolean v11;
        a.d X0;
        List M0;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f30053a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            MutableStateFlow<Boolean> J0 = this.f30054b.J0();
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(false);
            this.f30053a = 1;
            if (J0.emit(a11, this) == f11) {
                return f11;
            }
        }
        R0 = this.f30054b.R0();
        if (R0) {
            list = r.n();
        } else {
            A0 = this.f30054b.A0();
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
        SelectableFilterViewModel selectableFilterViewModel = this.f30054b;
        String value = selectableFilterViewModel.G0().getValue();
        v11 = s.v(value);
        if (v11) {
            value = null;
        }
        X0 = selectableFilterViewModel.X0(list, value);
        MutableSharedFlow<SelectableFilterViewModel.a> B0 = this.f30054b.B0();
        M0 = this.f30054b.M0(list);
        SelectableFilterViewModel.a.C0334a c0334a = new SelectableFilterViewModel.a.C0334a(new c.a(M0, X0));
        this.f30053a = 2;
        if (B0.emit(c0334a, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SelectableFilterViewModel$applyFilters$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
