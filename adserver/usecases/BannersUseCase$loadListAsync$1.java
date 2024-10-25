package com.forsale.adserver.usecases;

import com.forsale.adserver.datalayer.bannerdata.BannerFactory;
import com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes;
import com.forsale.adserver.datalayer.bannerdata.Screens;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BannersUseCase.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.usecases.BannersUseCase$loadListAsync$1", f = "BannersUseCase.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BannersUseCase$loadListAsync$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super List<? extends g9.b>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f20754a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BannersUseCase f20755b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ i9.a f20756c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersUseCase$loadListAsync$1(BannersUseCase bannersUseCase, i9.a aVar, zz.a<? super BannersUseCase$loadListAsync$1> aVar2) {
        super(2, aVar2);
        this.f20755b = bannersUseCase;
        this.f20756c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BannersUseCase$loadListAsync$1(this.f20755b, this.f20756c, aVar);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, zz.a<? super List<? extends g9.b>> aVar) {
        return invoke2(coroutineScope, (zz.a<? super List<g9.b>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        BannerFactory bannerFactory;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f20754a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            bannerFactory = this.f20755b.f20753b;
            int b11 = this.f20755b.b();
            Screens c11 = this.f20756c.c();
            ScreenBannerTypes a11 = this.f20756c.a();
            Integer b12 = this.f20756c.b();
            this.f20754a = 1;
            obj = bannerFactory.e(b11, c11, a11, b12, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, zz.a<? super List<g9.b>> aVar) {
        return ((BannersUseCase$loadListAsync$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
