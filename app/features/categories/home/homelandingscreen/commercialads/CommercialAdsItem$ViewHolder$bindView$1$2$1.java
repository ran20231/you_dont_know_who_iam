package com.forsale.app.features.categories.home.homelandingscreen.commercialads;

import aa.a5;
import com.forsale.app.features.maincontainer.HomeTabs;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: CommercialAdsItem.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.commercialads.CommercialAdsItem$ViewHolder$bindView$1$2$1", f = "CommercialAdsItem.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommercialAdsItem$ViewHolder$bindView$1$2$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24127a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CommercialAdsViewModel f24128b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a5 f24129c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CommercialAdsItem.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a5 f24130a;

        a(a5 a5Var) {
            this.f24130a = a5Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            MainContainerActivity mainContainerActivity;
            androidx.appcompat.app.d l11 = ContextExtensionsKt.l(this.f24130a.getRoot().getContext());
            if (l11 instanceof MainContainerActivity) {
                mainContainerActivity = (MainContainerActivity) l11;
            } else {
                mainContainerActivity = null;
            }
            if (mainContainerActivity != null) {
                mainContainerActivity.i2(HomeTabs.INDEX_OFFERS);
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialAdsItem$ViewHolder$bindView$1$2$1(CommercialAdsViewModel commercialAdsViewModel, a5 a5Var, zz.a<? super CommercialAdsItem$ViewHolder$bindView$1$2$1> aVar) {
        super(2, aVar);
        this.f24128b = commercialAdsViewModel;
        this.f24129c = a5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CommercialAdsItem$ViewHolder$bindView$1$2$1(this.f24128b, this.f24129c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f24127a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            OneShotEventHandler<wz.p> d11 = this.f24128b.d();
            a aVar = new a(this.f24129c);
            this.f24127a = 1;
            if (d11.e(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CommercialAdsItem$ViewHolder$bindView$1$2$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
