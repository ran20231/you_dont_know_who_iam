package com.forsale.adserver.view.viewmodel;

import com.forsale.adserver.usecases.BannersUseCase;
import g00.l;
import g9.b;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.Deferred;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BannerViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.BannerViewModel$loadLandingBanner$1", f = "BannerViewModel.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BannerViewModel$loadLandingBanner$1 extends SuspendLambda implements l<a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21627a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BannerViewModel f21628b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ i9.a f21629c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannerViewModel.kt */
    @d(c = "com.forsale.adserver.view.viewmodel.BannerViewModel$loadLandingBanner$1$1", f = "BannerViewModel.kt", l = {95}, m = "invokeSuspend")
    /* renamed from: com.forsale.adserver.view.viewmodel.BannerViewModel$loadLandingBanner$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements l<a<? super List<? extends b>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f21630a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannerViewModel f21631b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i9.a f21632c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BannerViewModel bannerViewModel, i9.a aVar, a<? super AnonymousClass1> aVar2) {
            super(1, aVar2);
            this.f21631b = bannerViewModel;
            this.f21632c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<p> create(a<?> aVar) {
            return new AnonymousClass1(this.f21631b, this.f21632c, aVar);
        }

        @Override // g00.l
        public /* bridge */ /* synthetic */ Object invoke(a<? super List<? extends b>> aVar) {
            return invoke2((a<? super List<b>>) aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            BannersUseCase bannersUseCase;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f21630a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                bannersUseCase = this.f21631b.f21604b;
                Deferred<List<b>> d11 = bannersUseCase.d(this.f21632c);
                this.f21630a = 1;
                obj = d11.await(this);
                if (obj == f11) {
                    return f11;
                }
            }
            return (List) obj;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(a<? super List<b>> aVar) {
            return ((AnonymousClass1) create(aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerViewModel$loadLandingBanner$1(BannerViewModel bannerViewModel, i9.a aVar, a<? super BannerViewModel$loadLandingBanner$1> aVar2) {
        super(1, aVar2);
        this.f21628b = bannerViewModel;
        this.f21629c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new BannerViewModel$loadLandingBanner$1(this.f21628b, this.f21629c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object k11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f21627a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            BannerViewModel bannerViewModel = this.f21628b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bannerViewModel, this.f21629c, null);
            AnonymousClass2 anonymousClass2 = new l<List<? extends b>, Boolean>() { // from class: com.forsale.adserver.view.viewmodel.BannerViewModel$loadLandingBanner$1.2
                @Override // g00.l
                /* renamed from: b */
                public final Boolean invoke(List<b> it2) {
                    o.i(it2, "it");
                    return Boolean.valueOf(it2.isEmpty());
                }
            };
            this.f21627a = 1;
            k11 = bannerViewModel.k(anonymousClass1, anonymousClass2, this);
            if (k11 == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(a<? super p> aVar) {
        return ((BannerViewModel$loadLandingBanner$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
