package com.forsale.adserver.view.screens.offersScreen;

import com.forsale.adserver.view.screens.offersScreen.OffersViewModel;
import com.forsale.adserver.view.screens.ui.a;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import g00.r;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OffersViewModel.kt */
@d(c = "com.forsale.adserver.view.screens.offersScreen.OffersViewModel$screenUiState$1", f = "OffersViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class OffersViewModel$screenUiState$1 extends SuspendLambda implements r<OffersViewModel.a, List<? extends g9.d>, AdManagerAdRequest, a<? super com.forsale.adserver.view.screens.ui.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21470a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f21471b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f21472c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f21473d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OffersViewModel$screenUiState$1(a<? super OffersViewModel$screenUiState$1> aVar) {
        super(4, aVar);
    }

    @Override // g00.r
    /* renamed from: b */
    public final Object d(OffersViewModel.a aVar, List<g9.d> list, AdManagerAdRequest adManagerAdRequest, a<? super com.forsale.adserver.view.screens.ui.a> aVar2) {
        OffersViewModel$screenUiState$1 offersViewModel$screenUiState$1 = new OffersViewModel$screenUiState$1(aVar2);
        offersViewModel$screenUiState$1.f21471b = aVar;
        offersViewModel$screenUiState$1.f21472c = list;
        offersViewModel$screenUiState$1.f21473d = adManagerAdRequest;
        return offersViewModel$screenUiState$1.invokeSuspend(p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f21470a == 0) {
            f.b(obj);
            OffersViewModel.a aVar = (OffersViewModel.a) this.f21471b;
            List list = (List) this.f21472c;
            AdManagerAdRequest adManagerAdRequest = (AdManagerAdRequest) this.f21473d;
            if (aVar instanceof OffersViewModel.a.C0242a) {
                return new a.C0243a(((OffersViewModel.a.C0242a) aVar).a());
            }
            if (o.d(aVar, OffersViewModel.a.b.f21440a)) {
                return a.b.f21597a;
            }
            if (aVar instanceof OffersViewModel.a.c) {
                return new a.c(((OffersViewModel.a.c) aVar).b(), adManagerAdRequest, list);
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
