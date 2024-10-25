package com.forsale.adserver.view.viewmodel;

import com.forsale.adserver.datalayer.bannerdata.ClickType;
import com.forsale.adserver.view.models.AdType;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.analytics.AnalyticsType;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDetailsViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.NewDetailsViewModel$reportAnalyticsActionWhatsAppShared$1", f = "NewDetailsViewModel.kt", l = {264}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewDetailsViewModel$reportAnalyticsActionWhatsAppShared$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21807a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewDetailsViewModel f21808b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDetailsViewModel$reportAnalyticsActionWhatsAppShared$1(NewDetailsViewModel newDetailsViewModel, a<? super NewDetailsViewModel$reportAnalyticsActionWhatsAppShared$1> aVar) {
        super(2, aVar);
        this.f21808b = newDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new NewDetailsViewModel$reportAnalyticsActionWhatsAppShared$1(this.f21808b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ImpressionsViewModel Y;
        boolean z11;
        DetailsAnalyticsLogger T;
        f11 = b.f();
        int i11 = this.f21807a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            AdsModel value = this.f21808b.L().getValue();
            if (value != null) {
                NewDetailsViewModel newDetailsViewModel = this.f21808b;
                if (value.o()) {
                    T = newDetailsViewModel.T();
                    T.h(String.valueOf(value.g()), AnalyticsType.WHATSAPP);
                } else {
                    Y = newDetailsViewModel.Y();
                    if (value.a() == AdType.OFFER) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int g11 = value.g();
                    ClickType clickType = ClickType.WHATSAPP;
                    this.f21807a = 1;
                    if (Y.q(z11, g11, clickType, this) == f11) {
                        return f11;
                    }
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((NewDetailsViewModel$reportAnalyticsActionWhatsAppShared$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
