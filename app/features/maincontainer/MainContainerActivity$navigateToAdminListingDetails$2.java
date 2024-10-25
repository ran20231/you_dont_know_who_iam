package com.forsale.app.features.maincontainer;

import com.forsale.adserver.view.models.AdsModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: MainContainerActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$navigateToAdminListingDetails$2", f = "MainContainerActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MainContainerActivity$navigateToAdminListingDetails$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31394a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerActivity f31395b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AdsModel f31396c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f31397d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerActivity$navigateToAdminListingDetails$2(MainContainerActivity mainContainerActivity, AdsModel adsModel, boolean z11, zz.a<? super MainContainerActivity$navigateToAdminListingDetails$2> aVar) {
        super(2, aVar);
        this.f31395b = mainContainerActivity;
        this.f31396c = adsModel;
        this.f31397d = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerActivity$navigateToAdminListingDetails$2(this.f31395b, this.f31396c, this.f31397d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z12;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f31394a == 0) {
            kotlin.f.b(obj);
            z12 = this.f31395b.z1();
            if (z12) {
                MainContainerActivity mainContainerActivity = this.f31395b;
                HomeTabs homeTabs = mainContainerActivity.x0().f1().get();
                o.h(homeTabs, "get(...)");
                mainContainerActivity.i2(homeTabs);
            }
            this.f31395b.H1(this.f31396c, this.f31397d);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerActivity$navigateToAdminListingDetails$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
