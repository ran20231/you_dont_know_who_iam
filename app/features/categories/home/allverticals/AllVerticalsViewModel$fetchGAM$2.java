package com.forsale.app.features.categories.home.allverticals;

import com.forsale.app.utils.gam.ContentUrlType;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllVerticalsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$fetchGAM$2", f = "AllVerticalsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AllVerticalsViewModel$fetchGAM$2 extends SuspendLambda implements g00.l<zz.a<? super AdManagerAdRequest>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23441a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AllVerticalsViewModel f23442b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllVerticalsViewModel$fetchGAM$2(AllVerticalsViewModel allVerticalsViewModel, zz.a<? super AllVerticalsViewModel$fetchGAM$2> aVar) {
        super(1, aVar);
        this.f23442b = allVerticalsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new AllVerticalsViewModel$fetchGAM$2(this.f23442b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        da.a aVar;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f23441a == 0) {
            kotlin.f.b(obj);
            aVar = this.f23442b.f23391j;
            return aVar.a(this.f23442b.Q(), ContentUrlType.HOME);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super AdManagerAdRequest> aVar) {
        return ((AllVerticalsViewModel$fetchGAM$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
