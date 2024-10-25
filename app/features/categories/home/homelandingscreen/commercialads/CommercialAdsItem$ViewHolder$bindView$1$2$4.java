package com.forsale.app.features.categories.home.homelandingscreen.commercialads;

import com.forsale.app.features.categories.home.homelandingscreen.commercialads.CommercialAdsItem;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CommercialAdsItem.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.commercialads.CommercialAdsItem$ViewHolder$bindView$1$2$4", f = "CommercialAdsItem.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CommercialAdsItem$ViewHolder$bindView$1$2$4 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24131a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CommercialAdsViewModel f24132b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CommercialAdsItem.ViewHolder f24133c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CommercialAdsItem.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommercialAdsItem.ViewHolder f24134a;

        a(CommercialAdsItem.ViewHolder viewHolder) {
            this.f24134a = viewHolder;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            CommercialAdsItem.ViewHolder.i(this.f24134a).R.t1(0);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialAdsItem$ViewHolder$bindView$1$2$4(CommercialAdsViewModel commercialAdsViewModel, CommercialAdsItem.ViewHolder viewHolder, zz.a<? super CommercialAdsItem$ViewHolder$bindView$1$2$4> aVar) {
        super(2, aVar);
        this.f24132b = commercialAdsViewModel;
        this.f24133c = viewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CommercialAdsItem$ViewHolder$bindView$1$2$4(this.f24132b, this.f24133c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f24131a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            OneShotEventHandler<wz.p> e11 = this.f24132b.e();
            a aVar = new a(this.f24133c);
            this.f24131a = 1;
            if (e11.e(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CommercialAdsItem$ViewHolder$bindView$1$2$4) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
