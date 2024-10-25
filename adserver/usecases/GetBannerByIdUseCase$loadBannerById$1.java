package com.forsale.adserver.usecases;

import com.forsale.adserver.datalayer.bannerdata.BannerFactory;
import com.forsale.adserver.datalayer.bannerdata.Screens;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetBannerByIdUseCase.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.usecases.GetBannerByIdUseCase$loadBannerById$1", f = "GetBannerByIdUseCase.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GetBannerByIdUseCase$loadBannerById$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super g9.b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f20758a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GetBannerByIdUseCase f20759b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f20760c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBannerByIdUseCase$loadBannerById$1(GetBannerByIdUseCase getBannerByIdUseCase, int i11, zz.a<? super GetBannerByIdUseCase$loadBannerById$1> aVar) {
        super(2, aVar);
        this.f20759b = getBannerByIdUseCase;
        this.f20760c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new GetBannerByIdUseCase$loadBannerById$1(this.f20759b, this.f20760c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f20758a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            BannerFactory c11 = this.f20759b.c();
            int b11 = this.f20759b.b();
            int i12 = this.f20760c;
            Screens screens = Screens.HOME_SCREEN;
            this.f20758a = 1;
            obj = c11.d(b11, i12, screens, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super g9.b> aVar) {
        return ((GetBannerByIdUseCase$loadBannerById$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
